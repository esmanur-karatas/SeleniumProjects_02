# CheckboxTest Selenium WebDriver Örneği

Bu proje, Selenium WebDriver kullanarak checkbox'lar ile nasıl etkileşimde bulunulacağını gösteren örnekler içermektedir. Proje, DemoQA web sitesindeki checkbox'lar üzerinde çeşitli işlemleri gerçekleştirir: checkbox'ı seçme, seçim durumunu kontrol etme ve checkbox'ın altındaki öğelere erişim sağlama.

## 📚 Proje İçeriği

### **ChecboxTest.java**
1. **Amaç:** Bu program, DemoQA web sitesindeki checkbox'ın seçili olup olmadığını kontrol eder ve eğer seçili değilse seçer, ardından "Test başarılı" mesajını yazdırır.
2. **İşlem Adımları:**
   - **https://demoqa.com/checkbox** adresine gidilir.
   - Checkbox kontrol edilir, eğer seçili değilse seçilir.
   - Test başarılı mesajı konsola yazdırılır.
3. **Ana Fonksiyonlar:**
   - **`driver.findElement(By.xpath(...))`**: Checkbox öğesini XPath ile bulur.
   - **`checbox.isSelected()`**: Checkbox'ın seçili olup olmadığını kontrol eder.
   - **`checbox.click()`**: Checkbox'ı seçer.

---

### **ChecboxTest_02.java**
1. **Amaç:** Bu program, DemoQA web sitesindeki checkbox'lar üzerinde daha karmaşık işlemler gerçekleştirir. İlk olarak bir menüyü açar, ardından "Desktop" checkbox'ını seçer, "Notes" checkbox'ının seçimini kaldırır.
2. **İşlem Adımları:**
   - **https://demoqa.com/checkbox** adresine gidilir.
   - Menü açılır ve "Desktop" checkbox'ı seçilir.
   - "Notes" checkbox'ı varsa, eğer seçili ise seçim kaldırılır.
3. **Ana Fonksiyonlar:**
   - **`driver.findElement(By.xpath(...))`**: Checkbox öğesini XPath ile bulur.
   - **`section.click()`**: Menü açmak için tıklanır.
   - **`desktop.click()`**: "Desktop" checkbox'ını seçer.
   - **`notes.click()`**: "Notes" checkbox'ının seçimini kaldırır.

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
4. **ChecboxTest.java** veya **ChecboxTest_02.java** sınıfını çalıştırın.
   - Tarayıcı açılacak ve belirtilen checkbox'lar üzerinde etkileşimde bulunulacaktır.
   - Sonuçlar konsolda yazdırılacaktır.

---

