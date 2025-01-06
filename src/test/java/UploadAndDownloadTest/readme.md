# UploadAndDownloadTest Selenium WebDriver Örneği

Bu proje, Selenium WebDriver kullanarak dosya yükleme ve indirme işlemleri üzerinde test yapmayı amaçlar. DemoQA web sitesinde bulunan "Upload and Download" sayfasını kullanarak dosya yükleme ve indirme işlemleri gerçekleştirilir.

## 📚 Proje İçeriği

### **UploadTest.java**
1. **Amaç:** Bu program, DemoQA web sitesindeki dosya yükleme işlevini test etmeyi amaçlar. Yükleme işlemi başarılı olduktan sonra, "File Uploaded!" metninin görünüp görünmediği kontrol edilir.
2. **İşlem Adımları:**
   - **https://demoqa.com/upload-download** adresine gidilir.
   - "Dosya Seç" butonuna tıklanır ve bir dosya yüklenir.
   - Yükleme tamamlandığında "File Uploaded!" mesajı kontrol edilir.
3. **Ana Fonksiyonlar:**
   - **`sendKeys(filePath)`**: Dosya yükleme butonuna dosya yolunu girerek dosya yüklenir.
   - **`isEnabled()`**: Yükleme mesajının başarılı olup olmadığını kontrol eder.

---

### **DownloadTest.java**
1. **Amaç:** Bu program, DemoQA web sitesindeki dosya indirme işlevini test etmeyi amaçlar. İndirme işlemi başarılı olduktan sonra, indirilen dosyanın belirtilen dizinde var olup olmadığı kontrol edilir.
2. **İşlem Adımları:**
   - **https://demoqa.com/upload-download** adresine gidilir.
   - "Download" butonuna tıklanarak dosya indirilir.
   - İndirilmiş dosyanın bilgisayarın "Downloads" klasöründe var olup olmadığı kontrol edilir.
3. **Ana Fonksiyonlar:**
   - **`click()`**: İndirme butonuna tıklar.
   - **`Files.exists(Paths.get(filePath))`**: Dosyanın belirtilen dizinde olup olmadığını kontrol eder.

---

## 🛠️ Araçlar ve Teknolojiler

- **Selenium WebDriver**: Web uygulamaları için tarayıcı otomasyonu yapar.
- **Java 8+**: Scriptlerin yazıldığı programlama dili.
- **ChromeDriver**: Google Chrome ile etkileşim için WebDriver.

---

## 🚀 Projeyi Çalıştırma

1. **Projeyi** bilgisayarınıza klonlayın veya indirin.
2. Projeyi istediğiniz IDE (IntelliJ IDEA, Eclipse vb.) ile açın.
3. **ChromeDriver**'ı bilgisayarınızda uygun şekilde ayarlayın.
   - **chromedriver.exe** dosyasını uygun bir dizine yerleştirin (örneğin `C:\\Project\\ChromeDriver\\chromedriver.exe`).
4. **UploadTest.java** ve **DownloadTest.java** sınıflarını çalıştırın.
   - Tarayıcı açılacak ve belirtilen işlemler gerçekleştirilecektir.
   - Sonuçlar konsolda yazdırılacaktır.

---
