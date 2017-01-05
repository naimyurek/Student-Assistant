# Student Assistant

`Nesneye Dayalı Programlama`

`Harun Uyar`, `Naim Yürek`, `Sedat Girgin`

# PROJE TANIMI


Proje kapsamında Lisansüstü öğrencilerin üzerinde çalışacağı makalelerin yönetimi ve yaklaşan ALES, YDS gibi sınavların bilgilendirilmesi gibi gereksinimlerini karşılayan bir uygulama geliştirilecek.

  - ACM.csv dosyasından 10 tane makale seçilecek. Bu küçük CSV dosyasında yer alan “id” parametresiyle makalelerin PDF dokümanları JAVA kodu ile otomatik olarak indirilecek.

  - Makale içerikleri MongoDB veri tabanına aktarılacak. Bunu yaparken DAO tasarım deseni kullanılacak.

  - Makalelerden birbirine benzeyenler kullanıcıya önerilecek. Benzerlik hesabı bir ya da birden fazla şekilde yapılabilir. Bunlardan bir tanesi Jaccard benzerlik hesabı olacak. Benzerlik hesapları arasında seçim yapmak için strateji tasarım deseni kullanılacak.

  - Makale veri tabanına aktarılırken, bu makaleye ilişkin bilgilerden id, title, author, venue ve year bilgileri CSV dosyasından elde edilecek. Makalenin içeriği ise indirilen PDF dosyasında elde edilecek. Ayrıca daha kolay arama yapılabilmesi için en çok geçen kelimeler de veri tabanına aktarılacak.

  - Her makale için en sık geçen kelimeler listesi hazırlanacak. Ayrıca 3Gram listeleri de oluşturulacak.

  - Kullanıcı, arayüz yardımıyla makalenin adını, yılını ya da anahtar kelimesini girerek arama yapabilecek.

  - Kullanıcı, sınav takviminden seçtiği sınavların başvuru tarihleri yaklaşınca bildirim alacak. Sınav takvimi HTML etiketlerinden arındırılarak internet sitesinden çekilecek.

  - Bildirimler E-Posta yoluyla gönderilebileceği gibi kullanıcı arayüzünden de uyarı yoluyla gönderilebilir.

  - Üstteki iki tasarım desenine ek en az bir tasarım deseni daha kullanılacak.

  - JUnit kullanılarak birkaç test yapılacak.

  - Proje Github’a yüklenecek.
