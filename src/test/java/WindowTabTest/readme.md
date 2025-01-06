# WindowTabTest Selenium WebDriver Örneği

Bu proje, Selenium WebDriver kullanarak yeni sekme ve pencere açma, sekmeler arasında geçiş yapma ve bu sekmeleri kapatma işlemleri üzerinde test yapmayı amaçlar. DemoQA web sitesinde bulunan "Browser Windows" sayfasını kullanarak çoklu sekmeler ve pencerelerle çalışılır.

## 📚 Proje İçeriği

### **WindowTabTest.java**
1. **Amaç:** Bu program, DemoQA web sitesindeki sekme ve pencere açma işlevlerini test etmeyi amaçlar. "New Tab", "New Window" ve "New Window Message" butonlarına tıklanarak yeni sekmeler ve pencereler açılır. Sekmeler ve pencereler arasında geçiş yapılır ve her sekme/pencere kapanmadan önce URL'leri yazdırılır.
2. **İşlem Adımları:**
   - **https://demoqa.com/browser-windows** adresine gidilir.
   - "New Tab", "New Window", ve "New Window Message" butonlarına tıklanır.
   - Yeni açılan sekme ve pencerelere geçilir ve URL'leri ekrana yazdırılır.
   - Sekmeler ve pencereler kapatılır ve orijinal sekmeye geri dönülür.
3. **Ana Fonksiyonlar:**
   - **`getWindowHandles()`**: Aktif olan tüm sekmelerin ve pencerelerin tanımlayıcılarını alır.
   - **`switchTo().window()`**: Belirli bir pencereye veya sekmeye geçiş yapar.
   - **`getCurrentUrl()`**: Aktif pencerenin URL'sini döner.
   - **`close()`**: Mevcut pencereyi kapatır.

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
4. **WindowTabTest.java** sınıfını çalıştırın.
   - Tarayıcı açılacak ve belirtilen işlemler gerçekleştirilecektir.
   - Sekmeler ve pencereler arasında geçiş yapılacak ve sonuçlar konsolda yazdırılacaktır.

---
