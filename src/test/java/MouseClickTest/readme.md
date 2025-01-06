# MouseClickTest Selenium WebDriver Örneği

Bu proje, Selenium WebDriver kullanarak fare ile yapılan çeşitli tıklama işlemleri (çift tıklama, sağ tıklama, ve normal tıklama) üzerinde testler gerçekleştirmeyi gösteren bir örnektir. DemoQA web sitesindeki butonlar üzerinde bu işlemler yapılır ve sonuçlar konsola yazdırılır.

## 📚 Proje İçeriği

### **MouseClickTest.java**
1. **Amaç:** Bu program, DemoQA web sitesinde üç farklı tıklama türünü simüle eder:
   - İlk olarak, bir butona çift tıklanır ve mesaj alınır.
   - İkinci olarak, bir butona sağ tıklanır ve mesaj alınır.
   - Son olarak, bir butona normal tıklama yapılır ve mesaj alınır.
2. **İşlem Adımları:**
   - **https://demoqa.com/buttons** adresine gidilir.
   - İlk butona çift tıklanır ve mesaj alınır.
   - İkinci butona sağ tıklanır ve mesaj alınır.
   - Üçüncü butona tıklanır ve mesaj alınır.
3. **Ana Fonksiyonlar:**
   - **`driver.findElement(By.id(...))`**: Web öğelerini ID ile bulur.
   - **`driver.findElement(By.xpath(...))`**: Web öğelerini XPath ile bulur.
   - **`Actions`**: Fare hareketleri ve tıklama işlemlerini simüle eder.
   - **`doubleClick()`**: Çift tıklama işlemi gerçekleştirir.
   - **`contextClick()`**: Sağ tıklama işlemi gerçekleştirir.
   - **`click()`**: Tek tıklama işlemi gerçekleştirir.

---

## 🛠️ Araçlar ve Teknolojiler

- **Selenium WebDriver**: Web uygulamaları için tarayıcı otomasyonu yapar.
- **Java 8+**: Scriptlerin yazıldığı programlama dili.
- **ChromeDriver**: Google Chrome ile etkileşim için WebDriver.
- **Actions**: Fare etkileşimlerini (çift tıklama, sağ tıklama, tıklama) simüle eder.

---

## 🚀 Projeyi Çalıştırma

1. **Projeyi** bilgisayarınıza klonlayın veya indirin.
2. Projeyi istediğiniz IDE (IntelliJ IDEA, Eclipse vb.) ile açın.
3. **ChromeDriver**'ı bilgisayarınızda uygun şekilde ayarlayın.
   - **chromedriver.exe** dosyasını uygun bir dizine yerleştirin (örneğin `C:\\Project\\ChromeDriver\\chromedriver.exe`).
4. **MouseClickTest.java** sınıfını çalıştırın.
   - Tarayıcı açılacak ve belirtilen butonlar üzerinde etkileşimde bulunulacaktır.
   - Sonuçlar konsolda yazdırılacaktır.

---
