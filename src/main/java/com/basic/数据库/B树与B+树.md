####B树
    为什么有了二叉树还要B树呢？
        二叉树在查找时要执行很多次IO操作，IO操作的效率很低，当在大量数据存储中，查询时不能一下子将所有数据加载到内存中，只能逐一加载磁盘页，每个磁盘页对应树的节点，造成大量磁盘IO操作
        平衡二叉树由于树深度过大而造成磁盘IO读写过于频繁，进而导致效率低下
        为了减少磁盘IO的次数，就必须降低树的深度，将“瘦高”的树变得“胖矮”。想法就是：1.每个节点存储多个元素；2.摒弃二叉树结构，使用多叉树
        
    B树的特点
       1.根节点至少有两个子女
       2.所有叶子节点都位于同一层
       3.每个节点中的元素从小到大排列  
       4.每个中间节点都包含k-1个元素和k个孩子. m/2 <= k <= m
       5.每一个叶子节点都包含k-1个元素 m/2 <= k <= m
    
    查找：
        查找时比较的次数可能并不少，但是磁盘IO的次数大大减少了，因为值比较是在内存中进行的，相比于磁盘IO的速度，耗时几乎可以忽略。
        所以当树的高度足够低的话，就可以极大的提高效率。节点中的元素多也仅仅是多了几次内存交互而已，只要不超过磁盘页大小即可。
    插入：
        插入时找到元素应该插入的位置，分情况插入：
           1.若该节点中元素个数小于m-1，则直接插入即可
           2.如否则将引起节点的分裂，以中间元素为界将节点一分为二，产生一个新节点，并把中间节点插入到父节点 、
           重复上述工作，最坏情况一直分裂到根节点，建立一个新的根节点，整个B树增加一层。
           确保了B树是一个自平衡树       
    B树上算法执行时间由磁盘IO的次数来决定，故一次IO操作应该写尽可能多的信息。
    节点规模一般以一个磁盘页为单位，一个节点包含的关键字及其孩子个数取决于磁盘页的大小
    
####B+树
    特性：
        1.有k个子树的中间节点包含k个元素(B树中是k-1个元素)，每个元素不保存数据，只用来索引，所有数据都保存在叶子节点。
        2.所有的叶子节点中包含了全部元素的信息，及指向这些元素记录的指针，且叶子节点本身依关键字的大小自小而大顺序链接。
        3.所有的中间节点元素都同时存在于子节点，在子节点元素中是最大（或最小）元素，对子节点来说是最大，对父节点来说是最小。
        4.B+树通常有两个指针，一个指向根节点，一个指向关键字最小的叶子节点。因此，对于B+树进行查找两种运算：一种是从最小关键字顺序查找，另一种是从根节点开始进行随机查找
        
    插入：
        B+树的插入与B树的插入过程类似，不同的是B+树在叶节点上进行，如果叶节点中的关键码超过m，就必须分裂关键码数目大致相同的两个节点，并保证上层节点之间有这两个节点的最大关键码    
    
       
          
####区别
       1.B+树中间节点没有卫星数据，只有索引，而B树每个节点的每个关键字都有卫星数据，也就是B+树的数据都在叶子节点上
       2.B树的查找只需要找到匹配元素即可，最好情况下查找到根节点，最坏情况下查找到叶子节点，所以性能很不稳定，而B+树每次必须查找到叶子节点，性能稳定
       3.B树的范围查找需要不断依赖中序遍历，首先二分查找到范围下限，在不断通过中序遍历，直到找到范围上限即可。比较耗时。
         而B+树的范围查找则简单了很多，首先通过范围查找，找到范围下限，然后通过叶子节点的链表顺序遍历，直至找到上限即可，整个过程简单许多，效率比较高。
     
       B+树的优势：
          1.单一节点存储更多是元素，使得查询IO次数更少
          2.所有查询都要查找到叶节点，查询性能稳定
          3.所有叶子节点形成有序链表，便于范围查询         

####MyISAM和InnoDB在索引实现上的区别
    MyISAM中，data存的是数据地址，索引是索引，数据是数据。索引放在.MYI文件，数据放在.MYD文件，属于非聚簇索引
    InnoDB，data存的是数据本身，索引本身也是数据，数据和索引存储在.MDB文件中，聚簇索引