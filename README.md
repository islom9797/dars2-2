Bu loyihada controller va servicelarsiz qanday qilib default methodlarni yaratish o'rgatiladi birinchi bo'lib repostoryni bunday o'zgartiramiz 

///path bu yerda link,collectionResourceREl esa qaytarib yuboradigan listning addresses o'rniga=>list deb qaytaradi
@RepositoryRestResource(path = "address",collectionResourceRel = "list",excerptProjection = CustomAddress.class)
public interface AddresRepo extends JpaRepository<Address, Integer> {
}


default tarzda ReposityoryRestResourceda id qaytarilmaydi shuning uchun biz custom projection yozamiz
 <pre>
<code>
@Projection(types = Address.class)
public interface CustomAddress {
    Integer getId();
    String getStreet();
    String getCity();
}

    </code>
  </pre>
  <style>
    pre {
      background-color: #f4f4f4;
      border: 1px solid #ddd;
      border-radius: 5px;
      padding: 10px;
      overflow-x: auto;
      font-family: "Courier New", Courier, monospace;
    }
    code {
      color: #d14;
    }
  </style>
