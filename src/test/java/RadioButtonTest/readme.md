# RadioButtonTest Selenium WebDriver Örneği

Bu proje, Selenium WebDriver kullanarak radio button (radyo düğmesi) etkileşimlerini test etmeyi amaçlar. DemoQA web sitesinde bulunan bir radio button üzerinde yapılan işlemler doğrultusunda başlık testi, seçim testi ve alt metin doğrulaması yapılır.

## 📚 Proje İçeriği

### **RadioButtonTest.java**
1. **Amaç:** Bu program, DemoQA web sitesinde bir radyo düğmesinin doğru şekilde seçildiğini doğrulamak ve başlık ile alt metinlerin doğru olduğunu test etmek için yazılmıştır.
2. **İşlem Adımları:**
   - **https://demoqa.com/radio-button** adresine gidilir.
   - Sayfadaki başlık doğrulanır.
   - "Yes" radyo butonunun seçili olup olmadığı kontrol edilir, eğer seçili değilse seçilir.
   - Seçim sonrası ekrana yazılan metin alınır ve konsola yazdırılır.
3. **Ana Fonksiyonlar:**
   - **`driver.findElement(By.xpath(...))`**: Web öğelerini XPath ile bulur.
   - **`isSelected()`**: Web öğesinin seçili olup olmadığını kontrol eder.
   - **`click()`**: Web öğesini tıklar.
   - **`getText()`**: Web öğesinin metnini alır.

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
4. **RadioButtonTest.java** sınıfını çalıştırın.
   - Tarayıcı açılacak ve belirtilen işlemler gerçekleştirilecektir.
   - Sonuçlar konsolda yazdırılacaktır.

---

