# DynamicElementsTest Selenium WebDriver Örneği

Bu proje, Selenium WebDriver kullanarak dinamik öğelerle etkileşimde bulunmayı gösteren bir örnektir. Projede, DemoQA web sitesindeki dinamik öğelerle etkileşime girilir: öğelerin görünürlük durumu, butonların etkinleştirilmesi ve sınıf değişikliklerinin kontrolü gibi işlemler yapılmaktadır.

## 📚 Proje İçeriği

### **DynamicElementsTest.java**
1. **Amaç:** Bu program, DemoQA web sitesinde dinamik öğelerle etkileşime girer. Örneğin, belirli bir süre sonra etkinleşen bir butona tıklama, sınıf değiştiren bir butonu kontrol etme ve görünür hale gelen bir öğeyi tıklama işlemleri yapılır.
2. **İşlem Adımları:**
   - **https://demoqa.com/dynamic-properties** adresine gidilir.
   - Sayfanın başlığındaki metin yazdırılır.
   - 5 saniye beklenir, ardından bir butona tıklanır.
   - Sınıfı değişen bir butonun önceki ve sonraki sınıf değerleri yazdırılır.
   - Görünür hale gelen bir öğe tıklanır.
3. **Ana Fonksiyonlar:**
   - **`driver.findElement(By.xpath(...))`**: Web öğelerini XPath ile bulur.
   - **`WebDriverWait`**: Dinamik öğelerin durumunu beklemek için kullanılır.
   - **`wait.until(ExpectedConditions.elementToBeClickable(...))`**: Bir öğenin tıklanabilir olmasını bekler.
   - **`wait.until(ExpectedConditions.attributeToBe(...))`**: Bir öğenin belirli bir sınıfın olmasını bekler.
   - **`wait.until(ExpectedConditions.visibilityOfElementLocated(...))`**: Bir öğenin görünür olmasını bekler.

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
4. **DynamicElementsTest.java** sınıfını çalıştırın.
   - Tarayıcı açılacak ve belirtilen dinamik öğeler üzerinde etkileşimde bulunulacaktır.
   - Sonuçlar konsolda yazdırılacaktır.

---
