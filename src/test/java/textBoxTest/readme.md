# TextBoxTest - Selenium WebDriver Testi

Bu proje, Selenium WebDriver kullanarak DemoQA web sitesindeki **Text Box** sayfasında bir formu otomatik olarak doldurup, gönderme işlemi yapmaktadır. Formda yer alan kullanıcı adı, e-posta, adres ve kalıcı adres gibi bilgilerin doğru bir şekilde girilmesi sağlanır ve gönderim sonrası ekranda görünen doğrulama metninin doğruluğu kontrol edilir.

## 📚 Proje İçeriği

### **Test Senaryosu**
- **URL**: [https://demoqa.com/text-box](https://demoqa.com/text-box)
- Sayfada yer alan "Full Name", "Email", "Current Address" ve "Permanent Address" alanlarına bilgiler girilir.
- **Girilen Bilgiler**:
  - **Full Name**: Esmanur Karataş
  - **Email**: esman@gmail.com
  - **Current Address**: Elazığ/Merkez
  - **Permanent Address**: Elazığ
- Formun alt kısmında yer alan **Submit** butonuna tıklanarak form gönderilir.
- Gönderim sonrası ekrana gelen doğrulama metninin doğruluğu kontrol edilir.

### **Adımlar**:
1. **WebDriver Başlatma**: Chrome tarayıcısı açılır ve gerekli ayarlar yapılır.
2. **Form Verilerini Girme**: 
   - Kullanıcı adı, e-posta, adres bilgileri ve kalıcı adres bilgileri ilgili alanlara yazılır.
3. **Sayfayı Kaydırma**: Formun en altında yer alan submit butonuna tıklanabilmesi için sayfa aşağı kaydırılır.
4. **Form Gönderme**: Submit butonuna tıklanır.
5. **Sonuçların Doğrulanması**: Form gönderimi başarılı olursa ekranda doğrulama metni görüntülenir ve bu metin konsola yazdırılır.
6. **Tarayıcıyı Kapatma**: Test işlemi tamamlandıktan sonra tarayıcı kapatılır.

### **Test Sonucu**:
Test başarılı olduğunda, konsola "Test Başarılı!" mesajı yazdırılır ve girilen veriler ekrana yazdırılır.

---

## 🛠️ Araçlar ve Teknolojiler

- **Selenium WebDriver**: Web uygulamaları için otomasyon sağlar.
- **Java**: Programlama dili olarak Java kullanılmıştır.
- **ChromeDriver**: Google Chrome ile etkileşim için kullanılır.
- **Actions Class**: Sayfayı kaydırmak ve fare etkileşimleri gibi işlemleri yapmak için kullanılır.

---

## 🚀 Projeyi Çalıştırma

1. **Projeyi** bilgisayarınıza klonlayın veya indirin.
2. Projeyi bir IDE (IntelliJ IDEA, Eclipse vb.) ile açın.
3. **ChromeDriver**'ı bilgisayarınızda uygun bir dizine yerleştirin. (Örneğin: `C:\\Project\\ChromeDriver\\chromedriver.exe`).
4. Testi başlatmak için **textBoxTest** sınıfını çalıştırın.

---

## 📄 Kaynaklar

- [Selenium WebDriver Dokümantasyonu](https://www.selenium.dev/documentation/)
- [Java API Dokümantasyonu](https://docs.oracle.com/javase/8/docs/api/)
- [DemoQA Web Sayfası](https://demoqa.com/)
