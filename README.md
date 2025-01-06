# Selenium WebDriver Test Projeleri

Bu depo, Selenium WebDriver kullanarak çeşitli web sayfalarındaki etkileşimleri otomatikleştiren ve test eden Java projelerini içermektedir. Projeler, DemoQA web sitesindeki çeşitli test senaryolarını kapsamaktadır. Bu projede, form doldurma, dosya yükleme, fare tıklama, pencere ve sekme geçişi, butonlar ile etkileşim gibi işlemler test edilmiştir.

## 📚 Proje İçeriği

Bu depo, aşağıdaki test senaryolarını içermektedir:

1. **TextBoxTest**: DemoQA web sitesindeki "Text Box" sayfasında kullanıcı adı, email, adres gibi bilgileri girerek formun doğru çalışıp çalışmadığını test etme.
2. **MouseClickTest**: "Buttons" sayfasında, çift tıklama, sağ tıklama ve tıklama gibi fare etkileşimlerini test etme.
3. **RadioButtonTest**: "Radio Button" sayfasında, belirli bir radyo butonunun seçilmesini ve doğrulama metninin doğru şekilde görüntülenmesini test etme.
4. **UploadAndDownloadTest**: "Upload and Download" sayfasında dosya yükleme ve dosya indirme işlemlerini test etme.
5. **WindowTabTest**: "Browser Windows" sayfasında yeni sekme açma, pencere geçişi yapma ve sekmeleri/pencereleri kapatma işlemlerini test etme.
6. **ModalTest**: "Modal Dialogs" sayfasında küçük ve büyük modal pencerelerin açılması, metinlerinin alınması ve kapatılması işlemlerini test etme.
7. **DynamicElementsTest**: "Dynamic Elements" sayfasındaki dinamik içeriklerle etkileşimi test etme.
8. **CheckboxTest**: "Checkbox" sayfasında kutucukların işaretlenmesi ve işaretleme işlemleri ile etkileşimi test etme.
9. **AlertTest**: "Alerts" sayfasında uyarı mesajlarını tetikleyip doğrulama yapma.
10. **AccordionTest**: "Accordion" sayfasındaki dinamik menüleri test etme.

Projeler, her biri ilgili web sayfasındaki etkileşimleri doğrulamak için Selenium WebDriver kullanarak aşağıdaki adımları gerçekleştirir:

- **Elementlerin Bulunması**: Sayfadaki belirli öğelere (butonlar, metin alanları, onay kutuları, vb.) erişim sağlanır.
- **Etkileşim**: Bu öğelerle etkileşime girilir (tıklama, metin gönderme, sağ tıklama, çift tıklama, vb.).
- **Doğrulama**: Formları gönderme ve belirli metinlerin veya sonuçların doğru şekilde görüntülendiğini kontrol etme.

## 🛠️ Araçlar ve Teknolojiler

- **Selenium WebDriver**: Web uygulamaları için tarayıcı otomasyonu yapar.
- **Java 8+**: Scriptlerin yazıldığı programlama dili.
- **ChromeDriver**: Google Chrome ile etkileşim için WebDriver.
- **Actions Class**: Fare etkileşimleri (çift tıklama, sağ tıklama, sayfa kaydırma, vb.) için kullanılır.

---

## 🚀 Projeyi Çalıştırma

1. **Projeyi** bilgisayarınıza klonlayın veya indirin.
2. Projeyi istediğiniz IDE (IntelliJ IDEA, Eclipse vb.) ile açın.
3. **ChromeDriver**'ı bilgisayarınızda uygun şekilde ayarlayın.
   - **chromedriver.exe** dosyasını uygun bir dizine yerleştirin (örneğin `C:\\Project\\ChromeDriver\\chromedriver.exe`).
4. Her bir test dosyasını çalıştırın.
   - Tarayıcı açılacak, işlemler gerçekleştirilecek ve doğrulama sonuçları konsola yazdırılacaktır.

---

## 📄 Kaynaklar

- [Selenium WebDriver Dokümantasyonu](https://www.selenium.dev/documentation/)
- [Java API Dokümantasyonu](https://docs.oracle.com/javase/8/docs/api/)
- [DemoQA Web Sayfası](https://demoqa.com/)

---

## 📝 Test Senaryoları

### **TextBoxTest**
- **Test Adımları**: Kullanıcı adı, email, adres bilgileri girildi. Form gönderildikten sonra doğrulama metni kontrol edildi.
- **Sonuç**: Formun doğru şekilde çalıştığı ve bilgilerin doğru şekilde gönderildiği doğrulandı.

### **MouseClickTest**
- **Test Adımları**: Çift tıklama, sağ tıklama ve normal tıklama işlemleri gerçekleştirilerek her tıklamanın ardından uygun mesajların alındığı test edildi.
- **Sonuç**: Tıklama işlemleri başarılı bir şekilde gerçekleştirildi ve sonuçlar konsola yazdırıldı.

### **RadioButtonTest**
- **Test Adımları**: "Yes" radyo butonunun seçilmesi sağlandı ve ardından doğrulama metninin doğru olup olmadığı kontrol edildi.
- **Sonuç**: Radyo butonu seçildi ve doğrulama metni doğru şekilde alındı.

### **UploadAndDownloadTest**
- **Test Adımları**: Dosya yükleme ve dosya indirme işlemleri yapıldı. İndirilen dosyanın varlığı doğrulandı.
- **Sonuç**: Dosya yükleme ve indirme işlemleri başarılı bir şekilde gerçekleşti.

### **WindowTabTest**
- **Test Adımları**: Yeni sekme ve pencere açma, sekme ve pencere geçişleri gerçekleştirilerek her bir geçişin doğru yapıldığı kontrol edildi.
- **Sonuç**: Sekme ve pencere geçişleri doğru şekilde yapıldı ve ilgili URL'ler doğrulandı.

### **ModalTest**
- **Test Adımları**: Modal pencerelerin açılması, metinlerin alınması ve kapatılması işlemleri yapıldı.
- **Sonuç**: Modal pencereler başarıyla açıldı ve kapatıldı, metinler doğru şekilde alındı.

### **DynamicElementsTest**
- **Test Adımları**: Dinamik olarak yüklenen öğelerle etkileşim sağlandı ve öğelerin doğru şekilde görüntülenmesi kontrol edildi.
- **Sonuç**: Dinamik öğeler başarılı bir şekilde kontrol edildi ve etkileşim gerçekleştirildi.

### **CheckboxTest**
- **Test Adımları**: Onay kutularının seçilmesi ve işaretlenmesi işlemleri test edilerek doğru sonuçlar kontrol edildi.
- **Sonuç**: Onay kutularının doğru şekilde işaretlenmesi ve işaretlerinin kontrol edilmesi sağlandı.

### **AlertTest**
- **Test Adımları**: Uyarı mesajları tetiklendi ve her birinin doğru şekilde görüntülenip görüntülenmediği kontrol edildi.
- **Sonuç**: Uyarılar doğru şekilde tetiklendi ve doğrulama yapıldı.

### **AccordionTest**
- **Test Adımları**: Dinamik accordion menülerinde her bir başlık tıklandı ve içeriklerin doğru şekilde açıldığından emin olundu.
- **Sonuç**: Accordion menüleri doğru şekilde açıldı ve kapatıldı, içerikler görüntülendi.

---

Bu projeler, web otomasyon testlerinin temel konularını kapsar ve Selenium WebDriver kullanarak çeşitli web etkileşimlerini test etme yeteneğinizi geliştirmeyi amaçlamaktadır.
