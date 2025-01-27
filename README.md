<h2>Bu loyihada controller va servicelarsiz qanday qilib default methodlarni yaratish o'rgatiladi birinchi bo'lib repostoryni bunday o'zgartiramiz </h2>
<code>
///path bu yerda link,collectionResourceREl esa qaytarib yuboradigan listning addresses o'rniga=>list deb qaytaradi
@RepositoryRestResource(path = "address",collectionResourceRel = "list",excerptProjection = CustomAddress.class)
public interface AddresRepo extends JpaRepository<Address, Integer> {
} 
</code>
<h2>default tarzda ReposityoryRestResourceda id qaytarilmaydi shuning uchun biz custom projection yozamiz</h2>
 
<code>
@Projection(types = Address.class)
public interface CustomAddress {
    Integer getId();
    String getStreet();
    String getCity();
}
</code>
  

