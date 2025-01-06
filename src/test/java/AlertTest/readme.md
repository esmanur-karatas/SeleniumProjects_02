# AlertTest Selenium WebDriver Örneği

Bu proje, Selenium WebDriver kullanarak farklı türdeki alert'lerle (uyarı kutuları) nasıl etkileşimde bulunulacağını gösteren bir örnektir. Program, DemoQA web sitesindeki çeşitli alert butonlarına tıklayarak, alert mesajlarını okur, kabul eder, iptal eder ve metin girer.

## 📚 Proje İçeriği

### **AlertTest.java**
1. **Amaç:** Bu program, DemoQA web sitesindeki alert'lerle etkileşim kurar ve farklı türlerdeki alert'leri yönetir:
   - İlk alert'i tıklar, mesajı alır ve kabul eder.
   - İkinci alert'i tıklar, 5 saniye bekler, mesajı alır ve kabul eder.
   - Üçüncü alert'i tıklar, mesajı alır, kabul eder ve tekrar tıklayarak iptal eder.
   - Dördüncü alert'i tıklar, bir metin girer, kabul eder ve iptal eder.

2. **İşlem Adımları:**
   - **https://demoqa.com/alerts** adresine gidilir.
   - Her bir alert'e tıklanır, mesajları alınır ve uygun işlemler (kabul veya iptal) yapılır.

3. **Ana Fonksiyonlar:**
   - **`driver.findElement(By.id("alertButton"))`**: Alert butonunu ID ile bulur ve tıklar.
   - **`driver.switchTo().alert()`**: Alert ile etkileşime geçmek için kullanılır.
   - **`alert.getText()`**: Alert mesajını alır.
   - **`alert.accept()`**: Alert'i kabul eder.
   - **`alert.dismiss()`**: Alert'i iptal eder.
   - **`alert.sendKeys()`**: Alert'e metin girer.

4. **İşlem Detayları:**
   - **Birinci Alert**: Mesaj alınır ve kabul edilir.
   - **İkinci Alert**: 5 saniye beklenir, mesaj alınır ve kabul edilir.
   - **Üçüncü Alert**: Mesaj alınır, kabul edilir ve tekrar tıklanarak iptal edilir.
   - **Dördüncü Alert**: Metin girilir, kabul edilir ve iptal edilir.

---

## 🛠️ Araçlar ve Teknolojiler

- **Selenium WebDriver**: Web uygulamaları için tarayıcı otomasyonu yapar.
- **Java 8+**: Scriptlerin yazıldığı programlama dili.
- **ChromeDriver**: Google Chrome ile etkileşim için WebDriver.
- **WebDriverWait**: Alert'in görünmesini bekler.

---

## 🚀 Projeyi Çalıştırma

1. **Projeyi** bilgisayarınıza klonlayın veya indirin.
2. Projeyi istediğiniz IDE (IntelliJ IDEA, Eclipse vb.) ile açın.
3. **ChromeDriver**'ı bilgisayarınızda uygun şekilde ayarlayın.
   - **chromedriver.exe** dosyasını uygun bir dizine yerleştirin (örneğin `C:\\Project\\ChromeDriver\\chromedriver.exe`).
4. **AlertTest.java** sınıfını çalıştırın.
   - Tarayıcı açılacak ve belirtilen alert'lerle etkileşime girilecek.
   - Her bir alert mesajı alınacak ve uygun işlem (kabul veya iptal) yapılacaktır.

---

