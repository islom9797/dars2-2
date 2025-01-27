
<body>
<h2>Bu loyihada controller va servicelarsiz qanday qilib default methodlarni yaratish o'rgatiladi birinchi bo'lib repostoryni bunday o'zgartiramiz </h2>
<pre>
<code>
    <font size="2">
        ///path bu yerda link,collectionResourceREl esa qaytarib yuboradigan listning addresses o'rniga=>list deb qaytaradi
@RepositoryRestResource(path = "address",collectionResourceRel = "list",excerptProjection = CustomAddress.class)
public interface AddresRepo extends JpaRepository<Address, Integer> {
} 
    </font>
</code>
</pre>
<h2>default tarzda ReposityoryRestResourceda id qaytarilmaydi shuning uchun biz custom projection yozamiz</h2>
<pre>
<code>
    <pre style="background-color: #f4f4f4; border: 1px solid #ddd; padding: 10px;">
@Projection(types = Address.class)
public interface CustomAddress {
    Integer getId();
    String getStreet();
    String getCity();
}
        </pre>
</code>
</pre>
</body>
  

