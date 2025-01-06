# AccordionTest Selenium WebDriver Örneği

Bu proje, Selenium WebDriver kullanarak bir web sayfasındaki akordeon (accordion) öğesiyle nasıl etkileşimde bulunulacağını gösteren bir örnektir. Test, **DemoQA** web sitesine giderek her bir akordeon bölümünü tıklar, başlık metnini alır ve ardından her bir bölümün içeriğini yazdırır.

## 📚 Proje İçeriği

### **AccordionTest.java**
1. **Amaç:** Bu program, DemoQA web sitesindeki bir akordeon bileşeniyle etkileşimi test eder:
   - **DemoQA** web sitesine gidilir ve akordeon bileşeni bulunur.
   - Her bir akordeon bölümüne tıklanır.
   - Başlık ve içerik metinleri alınarak konsola yazdırılır.

2. **İşlem Adımları:**
   - **https://demoqa.com/accordian** adresine gidilir.
   - Her bir bölüm tıklanır ve başlık metni ile içerik metni yazdırılır.

3. **Ana Fonksiyonlar:**
   - **`driver.findElement(By.id("section1Heading"))`**: Akordeon bölüm başlığını ID ile bulur.
   - **`accordion1.click()`**: Akordeon bölümüne tıklama işlemi simüle eder.
   - **`driver.findElement(By.cssSelector("div#section1Content p"))`**: Tıklanan bölümün içeriğini CSS seçicisi ile bulur.
   - **`System.out.println()`**: Başlık ve içeriği konsola yazdırır.

---

## 🛠️ Araçlar ve Teknolojiler

- **Selenium WebDriver**: Web uygulamaları için tarayıcı otomasyonu.
- **Java 8+**: Scriptlerin yazıldığı programlama dili.
- **ChromeDriver**: Google Chrome ile etkileşim için WebDriver.
- **Duration.ofSeconds(10)**: Öğelerin bulunması için verilen 10 saniyelik implicit bekleme süresi.

---

## 🚀 Projeyi Çalıştırma

1. **Projeyi** bilgisayarınıza klonlayın veya indirin.
2. Projeyi istediğiniz IDE (IntelliJ IDEA, Eclipse vb.) ile açın.
3. **ChromeDriver**'ı bilgisayarınızda uygun şekilde ayarlayın.
   - **chromedriver.exe** dosyasını uygun bir dizine yerleştirin (örneğin `C:\\Project\\ChromeDriver\\chromedriver.exe`).
4. **AccordionTest.java** sınıfını çalıştırın.
   - Tarayıcı açılacak ve akordeon bölümleriyle etkileşime girilecek, başlık ve içerik her bir bölüm için konsola yazdırılacaktır.

---


