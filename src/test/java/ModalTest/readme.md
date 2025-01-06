# ModalTest Selenium WebDriver Örneği

Bu proje, Selenium WebDriver kullanarak modal pencerelerle etkileşimde bulunmayı gösteren bir örnektir. Projede, DemoQA web sitesindeki küçük ve büyük modal pencerelerle etkileşimde bulunulur: modal metni alındıktan sonra pencereler kapatılır.

## 📚 Proje İçeriği

### **ModalTest.java**
1. **Amaç:** Bu program, DemoQA web sitesindeki küçük ve büyük modal pencerelerle etkileşime girer. Modal pencerelere tıklanır, metinler alınır ve ardından pencereler kapatılır.
2. **İşlem Adımları:**
   - **https://demoqa.com/modal-dialogs** adresine gidilir.
   - Küçük modal pencere tıklanır, metin alınır, ve pencere kapatılır.
   - Büyük modal pencere tıklanır, metin alınır, ve pencere kapatılır.
3. **Ana Fonksiyonlar:**
   - **`driver.findElement(By.id(...))`**: Web öğelerini ID ile bulur.
   - **`driver.findElement(By.cssSelector(...))`**: Web öğelerini CSS seçici ile bulur.
   - **`WebDriver`**: Tarayıcıyı kontrol etmek için kullanılır.
   - **`click()`**: Elemanı tıklar.
   - **`getText()`**: Elemandan metni alır.

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
4. **ModalTest.java** sınıfını çalıştırın.
   - Tarayıcı açılacak ve belirtilen modal pencereler üzerinde etkileşimde bulunulacaktır.
   - Sonuçlar konsolda yazdırılacaktır.

---

