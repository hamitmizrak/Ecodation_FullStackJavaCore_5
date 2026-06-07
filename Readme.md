# IBB Ecodation Java Core
[GitHub](https://github.com/hamitmizrak/Ecodation_FullStackJavaCore_5.git)
[JDK](https://www.oracle.com/tr/java/technologies/downloads/#jdk23-windows)
[Intellij Idea Community](https://www.jetbrains.com/idea/download/?section=windows)
[Git](https://git-scm.com/downloads)
[Java Tutorials](https://www.w3schools.com/java/default.asp)


## Git
```sh 
git init
git add .
git commit -m "add message"
git push -u origin master

git clone  https://github.com/hamitmizrak/Ecodation_FullStackJavaCore_5.git
```
---

## Java Common Rules ()
```sh 
Class isimleri PascalCase göre yazılır
Class isimleri: Fiil olarak kullanmayız (mak-mek)
Class : Java 1 tane public class vardır (inner class hariç)
Class : Java static class yoktur (inner class hariç)

Paket isimleri: Küçük harflerle yazılır.
Paket isimleri: fiil olarak kullanmayız (mak-mek)
Paket kısa net bir şekilde olması gerekiyor.

Javada Her biten kelime ; ile bitirmek zorundayız.
```
---


## Java Core Information
```sh 
Java case sensitive bir dildir. (Küçük büyük harfe duyarlı yüksek seviyede bir dildir.)
```
---

## Maven Nedir ?
```sh 

```
---
### **1. Maven Nedir?**
Maven, Java projelerini oluşturmak, yönetmek ve otomatikleştirmek için kullanılan bir **build automation** (inşa otomasyonu) aracıdır. Apache tarafından geliştirilmiştir ve özellikle Java projelerinde bağımlılık yönetimi, derleme, test etme ve dağıtım süreçlerini kolaylaştırır. Maven, XML tabanlı bir yapılandırma dosyası olan `pom.xml` kullanarak projenin yapılandırmasını ve bağımlılıklarını yönetir.

**Maven’in Sağladıkları:**
- **Bağımlılık Yönetimi:** Projeye eklenmesi gereken kütüphaneleri otomatik olarak indirir.
- **Proje Yapılandırması:** Projeyi standart bir yapıda düzenler.
- **Otomatik Derleme:** Projeyi derler (`mvn compile`).
- **Test Çalıştırma:** JUnit ve TestNG gibi test araçlarıyla testleri çalıştırır (`mvn test`).
- **Paketleme:** Projeyi `jar` veya `war` formatında paketler (`mvn package`).
- **Dağıtım Yönetimi:** Uygulamayı uzak sunuculara veya depolara gönderir (`mvn deploy`).

---

## pom.xml Nedir ?
```sh 

```
### **2. `pom.xml` Nedir?**
`pom.xml` (**Project Object Model**) dosyası, Maven projelerinin merkezi yapılandırma dosyasıdır. Projenin bağımlılıklarını, sürüm bilgilerini, eklentilerini ve yapılandırmalarını içerir.

Örnek bir `pom.xml` dosyası:
```xml
<project xmlns="http://maven.apache.org/POM/4.0.0"
         xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
         xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 http://maven.apache.org/xsd/maven-4.0.0.xsd">
    <modelVersion>4.0.0</modelVersion>

    <groupId>com.example</groupId>
    <artifactId>my-app</artifactId>
    <version>1.0-SNAPSHOT</version>
    <dependencies>
        <dependency>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-starter-web</artifactId>
            <version>2.7.4</version>
        </dependency>
    </dependencies>
</project>
```
Bu dosya:
- Projenin kimliğini (`groupId`, `artifactId`, `version`)
- Bağımlılıklarını (`dependencies`)
- Yapılandırmalarını içerir.

---


## JDK Nedir ?
```sh 

```
### **3. JDK (Java Development Kit) Nedir?**
**JDK (Java Development Kit)**, Java ile uygulama geliştirmek için kullanılan geliştirme ortamıdır. İçerisinde:
- **JRE (Java Runtime Environment)** (Çalışma zamanı ortamı)
- **JVM (Java Virtual Machine)** (Java Sanal Makinesi)
- **Java Compiler (javac)** (Java derleyicisi)
- **Java Debugger (jdb)** (Hata ayıklayıcı)
- **Java API ve kütüphaneleri** bulunur.

JDK olmadan Java kodu yazılamaz ve çalıştırılamaz.
---

## JRE Nedir ?
```sh 

```
### **4. JRE (Java Runtime Environment) Nedir?**
**JRE (Java Runtime Environment)**, Java uygulamalarını çalıştırmak için gereken ortamdır. İçerisinde:
- **JVM (Java Virtual Machine)** bulunur.
- **Java Kütüphaneleri** içerir.
- **Çalışma zamanı dosyaları** bulunur.

Eğer sadece Java programlarını çalıştırmak istiyorsanız, JDK yerine sadece JRE yükleyebilirsiniz. Ancak, JRE **Java kodu yazmak veya derlemek için yeterli değildir**.
---

### **5. JVM (Java Virtual Machine) Nedir?**
**JVM (Java Virtual Machine)**, Java programlarını çalıştıran sanal bir makinedir. JVM sayesinde Java platform bağımsızdır çünkü Java kodu her işletim sisteminde çalışabilecek **bayt koduna** (`.class` dosyalarına) çevrilir.

JVM’in Görevleri:
- **Bayt kodunu çalıştırır.**
- **Bellek yönetimini yapar (Garbage Collection).**
- **Çoklu iş parçacığını (multithreading) destekler.**
- **Platform bağımsızlığı sağlar.**
---

## Compiler Nedir ?
```sh 

```
### **5. Compiler (Derleyici) Nedir?**
**Compiler (Derleyici)**, insan tarafından yazılan yüksek seviyeli programlama dillerini makine koduna veya bayt koduna dönüştüren bir programdır. Java’da derleyici `javac` olarak adlandırılır.

**Java'da Çalışma Süreci:**
1. **Java kodu yazılır:** `MyClass.java`
2. **Derleyici (`javac`) çalıştırılır:** `javac MyClass.java`
3. **Bayt kodu (`.class` dosyası) oluşturulur:** `MyClass.class`
4. **JVM bayt kodunu çalıştırır.**
---


## Intepreter Nedir ?
```sh 

```
### **7. Interpreter (Yorumlayıcı) Nedir?**
**Interpreter (Yorumlayıcı),** programın satır satır çalıştırılmasını sağlayan bir programdır. 
Java’da **JVM içerisinde yer alan yorumlayıcı (interpreter)**, bayt kodlarını satır satır çalıştırır.

**Derleyici (Compiler) vs. Yorumlayıcı (Interpreter):**
- **Derleyici**: Tüm kodu derleyerek tek seferde çalıştırılabilir hale getirir.
- **Yorumlayıcı**: Kodu satır satır çalıştırır.

Java hem **derleyici (`javac`)** hem de **yorumlayıcı (JVM içinde)** kullanır.
---

### **8. Java Nedir?**
Java, **nesne yönelimli (OOP), platform bağımsız, güvenli, çok iş parçacıklı (multithreading) ve taşınabilir** bir programlama dilidir.

- **1995’te Sun Microsystems tarafından geliştirildi.**
- **"Bir kere yaz, her yerde çalıştır" (Write Once, Run Anywhere - WORA)** prensibiyle çalışır.
- **Mobil, web, masaüstü ve büyük ölçekli sistemlerde kullanılır.**
---

### **9. Java’nın Özellikleri Nelerdir?**
- **Platform Bağımsızdır.** (JVM sayesinde her yerde çalışır)
- **Nesne Yönelimli Programlama (OOP) Desteği** vardır.
- **Güvenlidir.** (Bellek yönetimi ve güvenlik mekanizmaları içerir)
- **Çok İş Parçacıklı (Multithreading)** çalışmayı destekler.
- **Otomatik Bellek Yönetimi (Garbage Collection)** yapar.
- **Dağıtık ve Ağ Tabanlı Uygulamaları Destekler.**
---

### **10. Data Types (Veri Tipleri) Nedir?**
Java'da değişkenlerin alabileceği veri türlerini ifade eder. İki ana kategoriye ayrılır:
1. **Primitive Types (İlkel Veri Tipleri)**
2. **Reference Types (Referans Tipleri)**
---

### **11. Primitive Types Nedir?**
Java'daki **ilkel veri tipleri (Primitive Types)** hafızada doğrudan değer saklayan basit veri türleridir.

| Veri Tipi  | Boyut | Varsayılan Değer | Aralık |
|------------|------|----------------|------------------|
| `byte`     | 1B  | 0              | -128 to 127 |
| `short`    | 2B  | 0              | -32,768 to 32,767 |
| `int`      | 4B  | 0              | -2^31 to 2^31-1 |
| `long`     | 8B  | 0L             | -2^63 to 2^63-1 |
| `float`    | 4B  | 0.0f           | ~7 basamak |
| `double`   | 8B  | 0.0d           | ~15 basamak |
| `char`     | 2B  | '\u0000'       | Unicode karakterler |
| `boolean`  | 1B  | `false`        | `true` veya `false` |
---

### **12. Wrapper Types Nedir?**
**Wrapper Class’lar,** primitive veri tiplerinin nesne olarak kullanılmasını sağlar.

Örneğin:
```java
int num = 10;
Integer obj = Integer.valueOf(num);
```

**Primitive -> Wrapper Dönüşümleri:**
- **`int -> Integer`**
- **`double -> Double`**
- **`char -> Character`**
- **`boolean -> Boolean`**

Wrapper class’lar **Java Collections API’lerinde** kullanılır çünkü koleksiyonlar yalnızca nesne saklayabilir.


## Java Core (Primitive Types)
```sh 

```
---

**`javac` (Java Compiler) ve bayt kodu (bytecode) süreci**, derleme süresi ve oluşturulan `.class` dosyasının boyutunu etkileyebilir. Aşağıda bunun nasıl gerçekleştiğine dair detaylı bir açıklama bulabilirsiniz.
---

## **1. `javac` Derleyici ve Derleme Süresi**
### **Derleme Süresini Etkileyen Faktörler**
- **Kodun Karmaşıklığı:**
    - Daha fazla **sınıf, metod ve kod satırı** içeren projeler daha uzun sürede derlenir.
    - Büyük projelerde, bağımlılıklar ve `import` edilen kütüphaneler derleme süresini uzatabilir.

- **Optimize Edilmiş Derleme (`javac` Seçenekleri)**:
    - **Incremental Compilation (Artımlı Derleme):**
        - Eğer sadece değişiklik yapılan sınıflar derlenirse, `javac` süresi kısalır.
    - **Hata Ayıklama Seçenekleri (`-g:none`)**:
        - `javac -g:none` komutu hata ayıklama bilgilerini içermeyen bir bytecode oluşturur ve derleme süresini kısaltabilir.
    - **Çoklu İş Parçacığı (Multithreading) Kullanımı:**
        - Büyük projelerde **Gradle** gibi derleme sistemleri çoklu iş parçacığı desteği sağlar, böylece derleme süresi azalır.

- **Donanım ve JVM Yapılandırması:**
    - Daha hızlı CPU ve SSD kullanan sistemlerde derleme süresi düşer.
    - Yetersiz RAM veya düşük işlem gücü derleme süresini artırır.

---

## **2. Bayt Kodu (Bytecode) ve Dosya Boyutu**
**Bytecode,** `javac` tarafından üretilen **platformdan bağımsız bir ara koddur** ve `.class` dosyalarında saklanır.

### **Bytecode Boyutunu Etkileyen Faktörler**
1. **Kodun İçeriği ve Karmaşıklığı:**
    - Uzun metotlar, fazla satır kod ve daha fazla `class` tanımlaması dosya boyutunu artırır.

2. **Yerel Değişkenler ve Sabit Havuzu (Constant Pool):**
    - Java’nın **String Constant Pool** ve diğer sabit değişkenleri yönetme mekanizması, **fazla sayıda string veya sabit tanımı içeren** kodlarda `.class` dosyasının boyutunu artırabilir.

3. **Kullanılan Optimizasyonlar:**
    - **JVM Optimizasyonları:**
        - JVM, bayt kodunu çalıştırırken **Just-In-Time (JIT) Compiler** gibi tekniklerle optimizasyon yapar.
    - **Inline Kod Kullanımı:**
        - `final` ve `static` değişkenlerin derleme zamanında yerine konulması, bytecode boyutunu artırabilir.

4. **Lombok, Annotation Processing ve Kütüphaneler:**
    - **Lombok, Spring gibi kütüphaneler** **otomatik kod üretme (code generation)** yapıyorsa, `.class` dosya boyutunu artırabilir.
    - **Annotation Processing**, derleme zamanında ek kodlar üreterek dosya boyutunu büyütebilir.

5. **Obfuscation (Kod Gizleme) ve Minifikasyon:**
    - Eğer kod **ProGuard veya R8 gibi optimizasyon araçlarıyla küçültülürse**, bytecode dosya boyutu azalır.
    - **Android projelerinde R8 ve ProGuard kullanımı**, bytecode boyutunu küçültmek için yaygın bir tekniktir.

---

## **3. Örnek Bir Kodun Derleme Süresi ve Bytecode Boyutu Üzerindeki Etkisi**
Aşağıdaki iki kodu karşılaştıralım:

### **Kod 1 – Basit Java Kodu**
```java
public class SimpleClass {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
    }
}
```
- **Derleme Süresi:** Çok kısa (~milisaniyeler)
- **Bytecode Boyutu:** Küçük (~1-2 KB)

---

### **Kod 2 – Daha Büyük ve Karmaşık Kod**
```java
import java.util.ArrayList;

public class ComplexClass {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < 100000; i++) {
            numbers.add(i);
        }
        System.out.println(numbers.size());
    }
}
```
- **Derleme Süresi:** Daha uzun (~milisaniyeler ile saniyeler arasında)
- **Bytecode Boyutu:** Daha büyük (~10-20 KB)

---

## **4. Sonuç**
- **Kodun karmaşıklığı ve kullanılan yapılar hem derleme süresini hem de bayt kodunun boyutunu etkiler.**
- **Optimize edilmiş derleme (`javac -g:none`, ProGuard gibi araçlar) bytecode boyutunu azaltabilir.**
- **Büyük projelerde derleme süresi donanıma ve çoklu iş parçacığı desteğine bağlı olarak değişebilir.**
- **Fazla sayıda sınıf, uzun metotlar ve büyük sabit havuzu derleme süresini ve bytecode boyutunu artırır.**

**Özet:** Daha fazla kod satırı, büyük sınıflar, fazladan kütüphane kullanımı ve karmaşık yapıların kullanımı hem derleme süresini uzatır hem de `.class` dosyalarının boyutunu artırır.


## Java Common Rules 
```sh 

```
---

### **Java Değişken İsimlendirme Kuralları ve En İyi Uygulamalar**
Java'da değişken isimlendirme kuralları **sözdizimsel (syntax)** kurallar ve **en iyi uygulamalar (best practices)** olarak ikiye ayrılır. Sözdizim kurallarına uyulmazsa derleme hatası alınır, en iyi uygulamalara uyulmaması ise okunabilirliği ve bakımı zorlaştırır.
---

## **1. Java'da Değişken İsimlendirme Kuralları (Syntax Kuralları)**
Java'da değişken isimlendirme aşağıdaki zorunlu kurallara tabidir:

### ✅ **Geçerli Değişken İsimlendirme Kuralları**
1. **Alfabede yer alan harfler (`a-z`, `A-Z`) kullanılabilir.**
2. **Rakamlar (`0-9`) kullanılabilir, ancak değişken ismi rakamla başlayamaz.**
3. **Alt çizgi `_` ve dolar işareti `$` kullanılabilir.**
4. **Java anahtar kelimeleri (reserved words) değişken adı olarak kullanılamaz.**  
   Örneğin, `int`, `class`, `static`, `for`, `if` gibi kelimeler değişken adı olamaz.

### ❌ **Geçersiz Değişken İsimlendirme Örnekleri**
| **Geçersiz Değişken** | **Hata Nedeni** |
|------------------------|-----------------|
| `1number`             | Rakamla başlayamaz |
| `int`                 | Java anahtar kelimesidir |
| `first-name`          | `-` işareti kullanılamaz |
| `@value`              | `@` özel karakteri kullanılamaz |
| `my variable`         | Boşluk içeremez |

---

## **2. Java Değişken İsimlendirme En İyi Uygulamaları (Best Practices)**
Geçerli değişken adları derleme hatası vermez, ancak bazı yazım standartlarına uyulması okunabilirliği artırır. En iyi uygulamalar şunlardır:

### ✅ **1. Camel Case Kullanımı (Önerilir)**
Java'da değişkenler için **camelCase** kullanılır:
- İlk kelime **küçük harfle başlar**, sonraki kelimeler **büyük harfle başlar**.

**Örnek:**
```java
int studentAge;
double accountBalance;
String firstName;
boolean isActive;
```

### ✅ **2. Anlamlı ve Açıklayıcı İsimler Seçin**
- Kısa ve anlamsız değişken adlarından kaçının.
- Değişkenin ne yaptığını veya hangi veriyi sakladığını anlatan isimler kullanın.

❌ Kötü Örnek:
```java
int x;
double y;
```

✅ İyi Örnek:
```java
int studentCount;
double totalSalary;
```

---

### ✅ **3. Değişken Adları Küçük Harfle Başlamalıdır**
- **Java'da değişkenler küçük harfle başlar**, ardından gelen kelimeler büyük harfle devam eder.

❌ Kötü Örnek:
```java
int StudentCount;
```
✅ İyi Örnek:
```java
int studentCount;
```

---

### ✅ **4. Sabit Değerler (Constants) İçin `UPPER_CASE` Kullanılmalı**
- `final` değişkenler **büyük harf** ve **alt çizgi (`_`)** ile yazılmalıdır.

✅ **İyi Örnek (Sabitler için)**:
```java
final double PI = 3.14159;
final int MAX_USERS = 100;
```

---

### ✅ **5. Boşluk ve Özel Karakterler Kullanılmamalıdır**
Değişken isimlerinde **boşluk (space) veya özel karakterler (`@`, `#`, `!`, `-`, `%`)** kullanılamaz.

❌ Geçersiz:
```java
int my variable;
String first-name;
```

✅ Geçerli:
```java
int myVariable;
String firstName;
```

---

### ✅ **6. `_` ve `$` Kullanımı (Genellikle Önerilmez)**
- **`_`** ve **`$`** kullanılabilir, ancak **genellikle değişken isimlerinde kullanılmaz**.
- **Özel durumlar:**
    - `_` genellikle **sabit değerlerde** (`final static`) kullanılır.
    - `$` genellikle **otomatik üretilen kodlarda** kullanılır (örneğin, Java'nın iç mekanizmalarında).

✅ Geçerli:
```java
String _privateVar;  // Genellikle kaçınılır
String $generatedCode;  // Kullanılabilir ama önerilmez
```

---

## **3. Özet**
| **Kural**                           | **Örnek (✅ Doğru)** | **Örnek (❌ Yanlış)** |
|--------------------------------------|---------------------|---------------------|
| **Harf, rakam, `_`, `$` kullanılabilir** | `age`, `userName`, `account_balance` | `user-name`, `1stName`, `my var` |
| **Rakamla başlayamaz**               | `name1`            | `1name` |
| **Anahtar kelimeler kullanılamaz**    | `totalAmount`      | `class`, `int` |
| **Camel case kullanılmalı**          | `studentCount`     | `Studentcount`, `student_count` |
| **Sabit değişkenler büyük harfle yazılmalı** | `MAX_USERS`, `PI`  | `MaxUsers`, `piValue` |
| **Boşluk içeremez**                   | `fullName`         | `full name` |

---

## **4. Örnek Kullanımlar**
### ✅ **İyi Uygulama Örnekleri**
```java
public class NamingExample {
    public static void main(String[] args) {
        int studentCount = 25;
        double accountBalance = 1050.75;
        final double PI = 3.14159;
        boolean isAvailable = true;

        System.out.println("Student Count: " + studentCount);
        System.out.println("Account Balance: $" + accountBalance);
        System.out.println("PI: " + PI);
        System.out.println("Available: " + isAvailable);
    }
}
```
---

### **Sonuç**
- Java değişken isimlendirme kurallarına uymak kodun **okunabilirliğini, bakımını ve standartlarını artırır**.
- **Camel Case** kullanımı önerilir: `myVariable`
- **Sabitler (`final`) büyük harfle yazılır**: `MAX_VALUE`
- **Değişken isimleri anlamlı olmalı**: `userName`, `totalAmount`
- **Java anahtar kelimeleri değişken adı olarak kullanılamaz**.

Bu kurallara uymak, kodunuzu daha **anlaşılır, düzenli ve sürdürülebilir** hale getirecektir. 🚀


## Primitive Types
```sh 

```
---

# **Java'da Primitive Type (İlkel Veri Tipleri) - Detaylı Açıklama**

Java'da **Primitive Types (İlkel Veri Tipleri)**, temel ve hafif veri tipleridir. Java'nın **hafıza yönetimi**, **hızlı işlem yapabilme** ve **düşük bellek tüketimi** sağlaması için kullanılırlar. Primitive türler, doğrudan bellekte saklanır ve nesne (`Object`) değildirler.

Java’da **8 adet** primitive type vardır:
- **Tam sayı tipleri:** `byte`, `short`, `int`, `long`
- **Ondalıklı sayılar:** `float`, `double`
- **Karakter tipi:** `char`
- **Mantıksal tip:** `boolean`

---

## **1. Java'da Primitive Veri Tiplerinin Genel Özellikleri**
1. **Nesne Değildir:**
    - Primitive değişkenler doğrudan bellekte saklanır.
    - `Integer`, `Double` gibi **Wrapper Class’lar** nesne iken, `int`, `double` gibi **primitive türler** nesne değildir.

2. **Daha Verimlidir:**
    - Nesne yerine doğrudan hafızada saklandıkları için işlemler daha hızlı gerçekleştirilir.
    - Örneğin, `int` yerine `Integer` kullanılırsa **heap bellekte fazladan bir nesne oluşur**.

3. **Varsayılan Değerleri Vardır:**
    - Primitive değişkenler **başlangıç değerleriyle** başlar (örneğin `int` için `0`, `boolean` için `false`).

4. **Değer Tutarlar, Referans Değil:**
    - Primitive türler **değer bazlıdır**, yani doğrudan değişkenin içinde tutulur.
    - `int x = 10;` yazıldığında, `x` değişkeninin içinde `10` değeri saklanır.

---

# **2. Java Primitive Veri Tipleri**
Aşağıda **Java'nın 8 primitive veri tipi** detaylı bir şekilde açıklanmaktadır.

## **A. Tam Sayı Türleri (Integer Types)**
Bu veri tipleri **ondalıklı olmayan** sayıları saklamak için kullanılır.

| **Tip**    | **Boyut** | **Aralık**                 | **Varsayılan Değer** |
|------------|---------|---------------------------|-----------------|
| `byte`     | 1 byte  | -128 to 127               | 0               |
| `short`    | 2 byte  | -32,768 to 32,767         | 0               |
| `int`      | 4 byte  | -2³¹ to (2³¹-1)           | 0               |
| `long`     | 8 byte  | -2⁶³ to (2⁶³-1)           | 0L              |

### **1. `byte` (1 Byte - Küçük Tam Sayılar)**
- **Bellek tasarrufu** sağlamak için kullanılır.
- **Sık kullanılan küçük değerler** için uygundur.
- Örneğin **100 kişilik öğrenci listesi** tutarken kullanışlıdır.

```java
byte smallNumber = 100;
byte minByte = -128;
byte maxByte = 127;
```

### **2. `short` (2 Byte - Orta Büyüklükte Tam Sayılar)**
- `byte`'tan büyük, `int`'ten küçük değerler için kullanılır.
- **Bellek kullanımını optimize etmek** için uygundur.

```java
short shortNumber = 32000;
short minShort = -32768;
short maxShort = 32767;
```

### **3. `int` (4 Byte - Standart Tam Sayılar)**
- Java'da **en çok kullanılan** tam sayı tipidir.
- Varsayılan olarak **tamsayı değerleri `int` türündedir**.

```java
int myAge = 25;
int totalUsers = 500000;
int minInt = -2147483648;
int maxInt = 2147483647;
```

### **4. `long` (8 Byte - Büyük Tam Sayılar)**
- Büyük sayılar için kullanılır.
- Sayının sonuna **`L` harfi** eklenmelidir (`long number = 10000000000L;`).

```java
long population = 7800000000L; // Dünya nüfusu
long distanceToSun = 149600000000L; // Güneşe olan mesafe (km)
```

---

## **B. Ondalıklı Sayılar (Floating Point Types)**
Ondalıklı sayılar için kullanılan **kayan nokta tipleridir**.

| **Tip**    | **Boyut** | **Yaklaşık Hassasiyet** | **Varsayılan Değer** |
|------------|---------|---------------------|-----------------|
| `float`    | 4 byte  | ~7 basamak          | 0.0f            |
| `double`   | 8 byte  | ~15 basamak         | 0.0d            |

### **1. `float` (4 Byte - Daha Az Hassas)**
- Daha az yer kaplar ama **kesinlik kaybı olabilir**.
- Sayının sonuna **`f` eklenmelidir** (`float pi = 3.14f;`).

```java
float pi = 3.14159f;
float gravity = 9.81f;
```

### **2. `double` (8 Byte - Daha Hassas)**
- **Hassas matematiksel işlemler** için kullanılır.
- **Varsayılan ondalıklı veri tipidir.**

```java
double precisePi = 3.141592653589793;
double speedOfLight = 299792458.0;
```

---

## **C. `char` (Karakter Tipi)**
- **Tek bir karakter saklar.**
- **Unicode destekler**, yani her dili ve sembolü içerebilir.

```java
char letter = 'A';
char digit = '5';
char symbol = '@';
char smiley = '\u263A'; // ☺ Unicode karakter
```

---

## **D. `boolean` (Mantıksal Veri Tipi)**
- **İki olası değer alır:** `true` veya `false`
- **Kontrol yapılarında (if, while, for)** yaygın kullanılır.

```java
boolean isJavaFun = true;
boolean isRaining = false;
```

---

# **3. Primitive Türler İçin Varsayılan Değerler**
Java'da bir primitive değişken **başlangıç değeri atanmazsa**, şu varsayılan değerleri alır:

| **Veri Tipi** | **Varsayılan Değer** |
|--------------|-----------------|
| `byte`       | 0               |
| `short`      | 0               |
| `int`        | 0               |
| `long`       | 0L              |
| `float`      | 0.0f            |
| `double`     | 0.0d            |
| `char`       | '\u0000' (Boş karakter) |
| `boolean`    | false           |

---

# **4. Primitive ve Wrapper Class Arasındaki Fark**
Java, primitive türlerin nesne olarak kullanılmasını sağlayan **Wrapper Class’ları** içerir.

| **Primitive Type** | **Wrapper Class** |
|-------------------|-----------------|
| `byte`           | `Byte`           |
| `short`          | `Short`          |
| `int`            | `Integer`        |
| `long`           | `Long`           |
| `float`          | `Float`          |
| `double`         | `Double`         |
| `char`           | `Character`      |
| `boolean`        | `Boolean`        |

Örneğin:
```java
int x = 10;
Integer y = Integer.valueOf(x); // Primitive -> Wrapper (Boxing)
int z = y.intValue(); // Wrapper -> Primitive (Unboxing)
```

---


## Primitive type - Wrapper Type
```sh 

```
---
Java'da **primitive types** (ilkel türler) ve **wrapper types** (sarmalayıcı türler) arasındaki farkları detaylı bir şekilde inceleyelim.

---

## 1. **Primitive Type ve Wrapper Type Nedir?**
- **Primitive Types**: Java'daki en temel veri türleridir. Bellekte doğrudan değerleri saklarlar ve **hafıza açısından daha verimli** çalışırlar.
- **Wrapper Types**: Primitive türlerin nesne (object) olarak kullanılabilmesini sağlayan Java sınıflarıdır. Java'da **koleksiyonlar (List, Set, Map gibi)** nesnelerle çalıştığından, primitive türlerin nesne versiyonları (wrapper types) kullanılır.

---

## 2. **Primitive Types ve Wrapper Types Karşılaştırması**
| **Özellik**            | **Primitive Types**         | **Wrapper Types**          |
|----------------------|------------------------|------------------------|
| **Tanım**            | Doğrudan değeri saklayan türlerdir. | Primitive türleri sarmalayan sınıflardır. |
| **Hafıza Kullanımı**  | Daha az bellek kullanır, daha verimlidir. | Daha fazla bellek tüketir (ekstra nesne oluşturur). |
| **Depolama**         | Stack bellekte saklanır. | Heap bellekte saklanır (Nesne olarak oluşturulduğu için). |
| **Değer Tipi**       | Değer (value) tipindedir. | Referans (object) tipindedir. |
| **Null Olabilir mi?** | **Hayır** (null olamaz). | **Evet** (null olabilir). |
| **Varsayılan Değer**  | int → 0, double → 0.0, boolean → false vb. | null (eğer nesne oluşturulmamışsa). |
| **Nesne Davranışı**  | Nesne değildir, direkt hesaplama yapar. | Nesnedir, metodları vardır. |
| **Koleksiyonlarda Kullanım** | **Doğrudan kullanılamaz** (List<int> gibi bir şey yazamayız). | **Kullanılabilir** (List<Integer> mümkündür). |
| **Dönüştürme İşlemi** | Boxing & Unboxing gerektirir. | Boxing & Unboxing ile primitive türlere dönüşebilir. |

---

## 3. **Primitive Türler ve Karşılık Gelen Wrapper Türler**
| **Primitive Type** | **Wrapper Class** |
|-------------------|-----------------|
| `byte`           | `Byte`          |
| `short`          | `Short`         |
| `int`            | `Integer`       |
| `long`           | `Long`          |
| `float`          | `Float`         |
| `double`         | `Double`        |
| `char`           | `Character`     |
| `boolean`        | `Boolean`       |

---

## 4. **Örneklerle Açıklamalar**

### 4.1 **Primitive Type Kullanımı**
```java
public class PrimitiveExample {
    public static void main(String[] args) {
        int x = 10;
        double y = 20.5;
        boolean isJavaFun = true;

        System.out.println("x: " + x);
        System.out.println("y: " + y);
        System.out.println("Java eğlenceli mi? " + isJavaFun);
    }
}
```
📌 **Burada `x`, `y` ve `isJavaFun` değişkenleri doğrudan bellekte saklanır, nesne oluşturulmaz.**

---

### 4.2 **Wrapper Type Kullanımı**
```java
public class WrapperExample {
    public static void main(String[] args) {
        Integer x = Integer.valueOf(10);
        Double y = Double.valueOf(20.5);
        Boolean isJavaFun = Boolean.TRUE; // veya new Boolean(true) (Eski kullanım)

        System.out.println("x: " + x);
        System.out.println("y: " + y);
        System.out.println("Java eğlenceli mi? " + isJavaFun);
    }
}
```
📌 **Burada `x`, `y` ve `isJavaFun` nesne olarak saklanır, heap bellekte yer kaplar.**

---

## 5. **Autoboxing ve Unboxing (Primitive ile Wrapper Arasındaki Dönüşüm)**
Java 5 ile gelen **Autoboxing** ve **Unboxing**, primitive ve wrapper türleri arasında otomatik dönüşüm yapılmasını sağlar.

### 5.1 **Autoboxing (Primitive → Wrapper)**
**Primitive türler, otomatik olarak wrapper nesnelere dönüşür.**
```java
public class AutoboxingExample {
    public static void main(String[] args) {
        int primitiveValue = 100;
        Integer wrapperValue = primitiveValue; // Autoboxing

        System.out.println("Wrapper Integer: " + wrapperValue);
    }
}
```
**Bu kod,** `Integer wrapperValue = Integer.valueOf(primitiveValue);` **ile aynıdır.**

---

### 5.2 **Unboxing (Wrapper → Primitive)**
**Wrapper türler, otomatik olarak primitive değerlere dönüşür.**
```java
public class UnboxingExample {
    public static void main(String[] args) {
        Integer wrapperValue = 200;
        int primitiveValue = wrapperValue; // Unboxing

        System.out.println("Primitive int: " + primitiveValue);
    }
}
```
**Bu kod,** `int primitiveValue = wrapperValue.intValue();` **ile aynıdır.**

---

## 6. **Primitive Type vs. Wrapper Type Kullanım Senaryoları**

| **Senaryo** | **Primitive Kullanımı** | **Wrapper Kullanımı** |
|------------|--------------------|--------------------|
| **Hız & Performans Önemli** | ✅ Daha hızlı | ❌ Yavaş |
| **Bellek Verimliliği** | ✅ Az bellek kullanır | ❌ Fazla bellek harcar |
| **Koleksiyonlarda Kullanım (List, Set, Map)** | ❌ Kullanılamaz | ✅ Kullanılabilir |
| **Null Değer Atama** | ❌ Mümkün değil | ✅ Mümkün |
| **Nesne Yönelimli Programlama Gerekirse** | ❌ Uygun değil | ✅ Nesne olarak kullanılabilir |
| **Metodlarla Çalışma** | ❌ Metod içermez | ✅ `Integer.parseInt()`, `Double.valueOf()` gibi metodlar kullanılabilir |

---

## 7. **Ne Zaman Hangi Tür Kullanılmalı?**
- **Performans kritikse ve koleksiyonlarla çalışılmıyorsa → Primitive types kullanılmalı.**
- **Koleksiyonlar (List, Map, Set) veya nesne yönelimli bir yapı gerekiyorsa → Wrapper types kullanılmalı.**
- **Null değerler gerekliliği varsa → Wrapper types tercih edilmeli.**
- **Hesaplamalar yapılıyorsa → Primitive types daha hızlı ve verimli çalışır.**

---

## 8. **Sonuç**
| **Konu** | **Primitive Type** | **Wrapper Type** |
|---------|-----------------|-----------------|
| Hafıza Kullanımı | Az bellek harcar | Daha fazla bellek tüketir |
| Hız | Daha hızlıdır | Daha yavaştır |
| Null Olabilir mi? | ❌ Hayır | ✅ Evet |
| Nesne mi? | ❌ Hayır | ✅ Evet |
| Koleksiyonlarda Kullanılabilir mi? | ❌ Hayır | ✅ Evet |

📌 **Özetle**, performans gereken durumlarda **primitive types** kullanılır, nesne yönelimli işlemler ve koleksiyonlar için **wrapper types** gereklidir.

💡 **Soru:** `List<int> list = new ArrayList<>();` neden hatalıdır?
📌 Çünkü **primitive types koleksiyonlarda kullanılamaz.** `List<Integer> list = new ArrayList<>();` şeklinde **wrapper type** kullanmalıyız.

Bu detaylı açıklamalar, primitive ve wrapper türleri arasındaki farkları net bir şekilde anlamanıza yardımcı olacaktır! 🚀



# **Sonuç**
- **Primitive türler** doğrudan bellekte saklanır, nesne değildir.
- **Daha hızlıdır ve daha az bellek tüketir**.
- **8 temel tür vardır:** `byte`, `short`, `int`, `long`, `float`, `double`, `char`, `boolean`.
- **Matematik işlemleri ve kontrollerde en verimli yöntemleri sunar**.

**Primitive türler Java'nın temelini oluşturur ve performans açısından büyük avantaj sağlar! 🚀**

## Wrapper new kullanımı()
```sh 

```
---
Eğer **wrapper sınıflarını** `new` anahtar kelimesiyle oluşturmak istiyorsak, her bir primitive türünün **wrapper sınıfını** kullanarak aşağıdaki gibi yazabiliriz:

```java
public class WrapperExample {
    public static void main(String[] args) {
        Byte wrapperTypeByte = new Byte((byte) 127);
        wrapperTypeByte = null; // Wrapper sınıflar null alabilir
        System.out.println(wrapperTypeByte);

        Short wrapperTypeShort = new Short((short) 32767);
        Integer wrapperTypeInt = new Integer(2147483647);
        Long wrapperTypeLong = new Long(9223372036854775807L);

        Float wrapperTypeFloat = new Float(14.23f);
        Double wrapperTypeDouble = new Double(14.23);

        Boolean wrapperTypeBoolean = new Boolean(true);
        Character wrapperTypeChar = new Character('a');

        System.out.println("Short: " + wrapperTypeShort);
        System.out.println("Integer: " + wrapperTypeInt);
        System.out.println("Long: " + wrapperTypeLong);
        System.out.println("Float: " + wrapperTypeFloat);
        System.out.println("Double: " + wrapperTypeDouble);
        System.out.println("Boolean: " + wrapperTypeBoolean);
        System.out.println("Character: " + wrapperTypeChar);
    }
}
```

### **Önemli Notlar**
1. **Java 9 ve Sonrasında `new` Kullanımı Önerilmez**
    - Java 9'dan itibaren `new Byte()`, `new Integer()` gibi kullanımlar **depreceated (kullanım dışı)** olarak işaretlenmiştir.
    - Bunun yerine **doğrudan atama** yapılmalıdır:
      ```java
      Byte wrapperTypeByte = 127;  // Önerilen kullanım
      ```
    - **Çünkü:** Java **autoboxing** mekanizması sayesinde `new` kullanmadan da bu türleri otomatik olarak wrapper class'lara çevirebilir.

2. **Performans ve Bellek Yönetimi**
    - `new` kullanımı **gereksiz nesne oluşturduğu için heap belleği gereksiz yere doldurur**.
    - Örneğin:
      ```java
      Integer a = 100;  // Autoboxing (Önerilen kullanım)
      Integer b = new Integer(100); // Heap bellekte yeni nesne oluşturur
      ```
    - **`new Integer(100)` kullanırsanız heap’te yeni bir nesne oluşturulur ve gereksiz hafıza tüketilir.**

### **Sonuç**
- **Eğer eski sürümlerle çalışmıyorsanız** ve özel bir nedeniniz yoksa, `new` kullanmadan **autoboxing** yöntemini tercih etmelisiniz.
- **Java 9+ ile çalışıyorsanız**, `new` kullanmaktan kaçının ve doğrudan atamaları kullanın. 🚀

## Stack Memory(Primitive) Heap Memory Memory()
```sh 

```
---
### **Java'da Primitive Stack Hafıza ve Wrapper Heap Hafıza Arasındaki Farklar**

Java'da **primitive veri tipleri** (**int, double, boolean, char, float, long, short, byte**) ve **wrapper sınıfları** (**Integer, Double, Boolean, Character, Float, Long, Short, Byte**) bellek yönetimi açısından farklı yerlerde saklanır. Bu iki veri tipi arasındaki en büyük fark, **stack ve heap bellek yönetimi** ile ilgilidir. Şimdi bu farkları **çok detaylı** şekilde inceleyelim.

---

## **1. Stack ve Heap Hafızasının Tanımı**
Java bellek yönetiminde **iki temel bölge** vardır:
- **Stack (Yığın Hafıza):** Küçük, hızlı ve yönetimi kolaydır. **Primitive veri tipleri burada saklanır.**
- **Heap (Yığın Hafıza):** Daha büyük, daha yavaş ama esnek bir yapıya sahiptir. **Wrapper sınıfları (nesne olarak kullanılan veriler) burada saklanır.**

---

## **2. Stack ve Heap Hafızasının Karşılaştırılması**

| **Özellik**        | **Stack (Yığın Hafıza)** | **Heap (Yığın Hafıza)** |
|--------------------|-----------------------|-----------------------|
| **Saklanan Veri Tipleri** | Primitive değişkenler (`int, double, char`) | Nesneler ve Wrapper sınıfları (`Integer, Double, Character`) |
| **Bellek Yönetimi** | LIFO (Last In First Out – Son giren, ilk çıkar) | Garbage Collector tarafından yönetilir |
| **Hız** | Çok hızlı | Görece daha yavaş |
| **Erişim Süresi** | Stack değişkenlerine erişim **daha hızlıdır** | Heap değişkenlerine erişim **daha yavaştır** |
| **Ömür** | Bir metodun çalışma süresi boyunca var olur | Program çalıştığı sürece var olabilir |
| **Bellek Alanı** | Küçüktür | Daha büyüktür |
| **Çoklu Thread Kullanımı** | Thread'e özeldir (Her thread'in kendi stack’i vardır) | Heap bellek **tüm thread’ler tarafından paylaşılır** |
| **Otomatik Temizleme** | Otomatik temizlenir, Garbage Collector çalışmasına gerek yoktur | Garbage Collector tarafından yönetilir, bellek temizliği gerektiğinde yapılır |

---

## **3. Primitive ve Wrapper Arasındaki Bellek Kullanım Farkı**

### **A) Primitive Veri Tipleri (Stack)**
Primitive veri tipleri **hafızada doğrudan değer olarak saklanır**. Örneğin:

```java
int x = 10;
```
- `x` değişkeni **stack hafızada** saklanır.
- Stack, değişkenleri hızlı bir şekilde yönetir ve **fonksiyon bittiğinde** otomatik olarak temizler.

Stack'teki bellek organizasyonu şu şekildedir:

```
Stack Memory:
+----------------------+
| int x = 10          |
+----------------------+
```

---

### **B) Wrapper Sınıfları (Heap)**
Eğer primitive yerine bir **wrapper class** (nesne) kullanırsak:

```java
Integer y = new Integer(10);
```

Bu durumda, bellek yapısı şu şekilde olur:
- `y` değişkeni **stack içinde bir referans** olarak saklanır.
- `new Integer(10)` ifadesiyle oluşturulan nesne **heap hafızada** saklanır.
- Heap’te saklanan nesneye erişmek için stack’te bir referans (adres) tutulur.

```
Stack Memory:
+----------------------+
| Integer y (ref: 0xA) |
+----------------------+

Heap Memory:
+----------------------+
| [Integer: 10] (0xA) |
+----------------------+
```

Yani, **primitive bir değişken doğrudan değeri içerirken**, wrapper class'lar **referansları saklar ve asıl veri heap içinde tutulur**.

---

## **4. Detaylı Örnek: Stack ve Heap Karşılaştırması**

Şimdi stack ve heap farkını anlamak için aşağıdaki kodu inceleyelim:

```java
public class MemoryTest {
    public static void main(String[] args) {
        int a = 5;
        Integer b = new Integer(5);
        
        modify(a, b);
        
        System.out.println("a: " + a);  // 5
        System.out.println("b: " + b);  // 5
    }
    
    public static void modify(int x, Integer y) {
        x = 10;       // Stack içindeki x değişir
        y = new Integer(10); // Yeni bir nesne oluşturulur (Heap)
    }
}
```

### **Kod Çalışma Mantığı**
1. `int a = 5;`  → **Stack'te doğrudan 5 değeri saklanır.**
2. `Integer b = new Integer(5);`  → **Heap’te yeni bir Integer nesnesi oluşturulur. Stack'te referansı tutulur.**
3. `modify(a, b);` metoduna çağrılırken:
    - `x` → yeni bir stack değişkeni olarak **5 değerini kopyalar** (pass by value).
    - `y` → referans olarak **yeni bir Integer nesnesi alır**.
4. `x = 10;` → **Stack içinde yeni bir değişken oluşturulur ve değer değiştirilir.**
5. `y = new Integer(10);` → **Heap’te yeni bir Integer nesnesi oluşturulur, ancak bu `modify` metodu içinde kalır ve main metodundaki `b` değişkenini etkilemez.**
6. `main` metodu bittiğinde, `a` hâlâ `5`, `b` hâlâ `5` olarak kalır.

Bu durum, **primitive’lerin değiştirilememesi (pass-by-value) ve wrapper nesnelerinin yeni bir nesne oluşturduğunda eski referanslarını kaybetmesi nedeniyle** oluşur.

---

## **5. Wrapper Sınıfları ve Otomatik Boxing / Unboxing**
Java, primitive ve wrapper sınıfları arasında otomatik dönüşüm sağlar. Buna **Autoboxing ve Unboxing** denir.

### **Autoboxing (Primitive → Wrapper)**
```java
int primitiveValue = 100;
Integer wrapperValue = primitiveValue; // Autoboxing
```
- Burada **`primitiveValue`**, otomatik olarak `Integer` nesnesine dönüştürülür ve heap’te saklanır.

### **Unboxing (Wrapper → Primitive)**
```java
Integer wrapperValue = 200;
int primitiveValue = wrapperValue; // Unboxing
```
- `wrapperValue`, heap’ten alınıp stack’te saklanan `primitiveValue` değişkenine atanır.

Bu dönüşümler bazı **performans kayıplarına** neden olabilir, çünkü primitive tiplerde heap erişimi olmadığı için daha hızlı işlem yapılır.

---

## **6. Ne Zaman Primitive, Ne Zaman Wrapper Kullanmalıyız?**
| Kullanım Durumu | Primitive Kullan (Stack) | Wrapper Kullan (Heap) |
|----------------|------------------------|----------------------|
| **Hafıza Verimliliği** | ✅ | ❌ (Heap daha fazla bellek kullanır) |
| **Performans (Hızlı Erişim)** | ✅ | ❌ (Heap erişimi daha yavaş) |
| **Nesne Odaklı Programlama (OOP)** | ❌ | ✅ (Nesne özellikleri ile kullanılabilir) |
| **Nullable Değerler (Null Atama)** | ❌ | ✅ (Primitive null olamaz, wrapper olabilir) |
| **Collection (List, Set, Map)** | ❌ | ✅ (Primitive veri tipleri Collection ile kullanılamaz) |

Eğer **hafıza ve hız önemliyse**, **primitive tipleri** kullanmalıyız.  
Eğer **nesne tabanlı programlama, null değeri saklama veya koleksiyonlar (List, Set, Map) ile çalışma gerekiyorsa**, **wrapper sınıfları** kullanmalıyız.

---

## **Sonuç**
- **Primitive değişkenler stack hafızada tutulur, doğrudan değeri içerir ve daha hızlıdır.**
- **Wrapper sınıfları heap hafızada saklanır, referans üzerinden erişilir ve daha fazla bellek kullanır.**
- **Otomatik Boxing/Unboxing sayesinde dönüşümler mümkündür, ancak performansa dikkat edilmelidir.**

Bu bilgiler doğrultusunda, projenin gereksinimlerine göre en uygun bellek kullanım stratejisini belirlemek gerekir. 🚀

## Wrapper new kullanımı
```sh 
Short wrapperTypeShort = new Short((short) 32767); 
bununla Short wrapperTypeShort 2=32767 arasındaki far nedir ?
```
---

Java'da aşağıdaki iki satır arasındaki farkı inceleyelim:

```java
Short wrapperTypeShort1 = new Short((short) 32767); // 1. Yöntem (Explicit Object Creation - new kullanımı)
Short wrapperTypeShort2 = 32767; // 2. Yöntem (Autoboxing)
```

Bu iki yaklaşımın arasındaki temel farklar şunlardır:

---

## **1. `new Short((short) 32767)` Kullanımı (Heap Bellekte Yeni Nesne Oluşturur)**
```java
Short wrapperTypeShort1 = new Short((short) 32767);
```
- `new` anahtar kelimesi kullanıldığı için **her çağrıldığında yeni bir nesne oluşturulur**.
- **Heap bellekte ayrı bir nesne** oluşturılır.
- **Garbage Collector (GC)** tarafından temizlenmesi gerekir.
- **Bellek tüketimi ve performans açısından dezavantajlıdır.**
- **`==` operatörü ile karşılaştırıldığında farklı nesneler olduğu için false dönebilir.**
- Java 9 ve sonraki sürümlerde bu yöntem **depreceated (kullanım dışı)** hale gelmiştir.

---

## **2. `Short wrapperTypeShort2 = 32767;` Kullanımı (Autoboxing - Cached Object Kullanımı)**
```java
Short wrapperTypeShort2 = 32767;
```
- **Autoboxing** sayesinde primitive `short` değeri otomatik olarak `Short` nesnesine dönüştürülür.
- **Java'nın Integer ve Short için cache mekanizmasını kullanır.**
- Küçük sayı aralıklarında (`-128` ile `127` arasında) **önbellekten (cache) alınan nesneleri kullanabilir.**
- **Daha performanslıdır**, çünkü her seferinde yeni bir nesne oluşturmaz.

---

## **Farklılıkların Kanıtı: Karşılaştırma Testi**
Aşağıdaki kodu çalıştırarak farkı gözlemleyebiliriz:

```java
public class ShortComparison {
    public static void main(String[] args) {
        Short wrapperTypeShort1 = new Short((short) 127);
        Short wrapperTypeShort2 = 127; // Autoboxing
        
        Short wrapperTypeShort3 = new Short((short) 127);
        Short wrapperTypeShort4 = 127; // Autoboxing
        
        System.out.println(wrapperTypeShort1 == wrapperTypeShort3); // false (Heap'te farklı nesneler)
        System.out.println(wrapperTypeShort2 == wrapperTypeShort4); // true (Cache mekanizması sayesinde aynı nesne)
        
        Short wrapperTypeShort5 = 32767;
        Short wrapperTypeShort6 = 32767;

        System.out.println(wrapperTypeShort5 == wrapperTypeShort6); // false (Çünkü cache dışında)
    }
}
```

---

## **Sonuçlar**
1. **Eğer `new` kullanırsanız**, heap bellekte **yeni bir nesne** oluşur ve `==` operatörü farklı nesneler döndürdüğü için `false` olur.
2. **Eğer `Short wrapperTypeShort2 = 32767;` şeklinde yazarsanız**, Java **autoboxing kullanır**.
3. **Java `-128` ile `127` arasındaki değerleri cache olarak tuttuğu için** bu aralıkta `==` karşılaştırması true dönebilir. Ancak `32767` gibi büyük değerler cache dışında olduğu için farklı nesneler oluşturulur.

---

## **Hangi Kullanımı Tercih Etmeliyiz?**
✔ **Performans açısından `Short wrapperTypeShort = 32767;` (Autoboxing) tercih edilmelidir.**  
❌ **`new Short((short) 32767)` kullanımı gereksiz bellek tüketimine neden olur ve önerilmez.**

Bu yüzden **`new` ile nesne oluşturmaktan kaçınılmalı ve autoboxing kullanımı tercih edilmelidir.** 🚀

## Java Life-Cycles
```sh 

```
---
### **Java'da Compiler mı Önce, Interpreter mı?**
Java programlarının çalışma süreci **hem compiler (derleyici) hem de interpreter (yorumlayıcı)** içerir, ancak **önce compiler çalışır, sonra interpreter devreye girer**.

1. **Compiler (Derleyici) İlk Çalışır:**
    - Java kaynak kodu (`.java` dosyaları) **Javac (Java Compiler)** tarafından **Bytecode**’a (`.class` dosyaları) dönüştürülür.
    - Bytecode **işletim sistemine bağımsızdır**, yani her ortamda çalışabilir.

2. **Interpreter (Yorumlayıcı) Sonra Çalışır:**
    - **Java Virtual Machine (JVM)**, Bytecode’u alır ve **Just-In-Time (JIT) Compiler** ile çalıştırılabilir makine koduna dönüştürür.
    - JVM, Bytecode'u **satır satır yorumlar ve çalıştırır**.

### **Java Programının Life-Cycle (Yaşam Döngüsü)**
Java'daki bir programın baştan sona yaşam döngüsünü adım adım açıklayalım:

---

## **1. Yazılım Aşaması (Source Code - `.java` Dosyası)**
Geliştirici, **Java kaynak kodunu** (`.java` dosyalarını) yazar.  
Örneğin:

```java
public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
    }
}
```

---

## **2. Compilation (Derleme) Aşaması**
Java **compiler** (`javac`), kaynak kodunu **Bytecode**’a çevirir.

### **Bu aşamada şunlar olur:**
- **Syntax kontrolü yapılır:** Derleyici (`javac`), kodun sözdizimi hatalarını kontrol eder.
- **Optimizasyon yapılır:** Kod en verimli hale getirilir.
- **Bytecode üretilir:** **Makineye bağımsız** `.class` dosyası oluşturulur.

### **Kompilasyon (Derleme) Komutu:**
```sh
javac HelloWorld.java
```

Bu komut sonucunda, aşağıdaki dosya oluşur:

```
HelloWorld.class
```

Bu `.class` dosyası **Java Bytecode** içerir.

---

## **3. ClassLoader Aşaması**
Java **ClassLoader**, `.class` dosyalarını JVM’ye yükler.

- **Bootstrap ClassLoader:** Java’nın temel sınıflarını (`java.lang.*`) yükler.
- **Extensions ClassLoader:** Ekstra kütüphaneleri (`lib/ext` dizinindekileri) yükler.
- **Application ClassLoader:** Kullanıcının kendi yazdığı sınıfları yükler.

---

## **4. Bytecode Verification (Bytecode Doğrulama)**
- **JVM, Bytecode’un güvenliğini kontrol eder.**
- **Hatalı veya zararlı kodların çalışmasını önler.**
- **Bellek aşımı veya yasadışı bellek erişimlerini engeller.**

---

## **5. Interpreter (Yorumlayıcı) Aşaması**
- **Java Interpreter**, Bytecode’u **satır satır okur ve çalıştırır**.
- Ancak, **sürekli yorumlama yavaş olabilir**, bu yüzden **JIT (Just-In-Time) Compiler** devreye girer.

---

## **6. Just-In-Time (JIT) Compiler Aşaması**
- JIT Compiler, **tekrar eden kodları alır ve doğrudan makine koduna çevirir**.
- **JVM’nin performansını artırır**, çünkü aynı kodun sürekli yorumlanmasını önler.

---

## **7. Runtime (Çalışma Zamanı)**
- **Garbage Collector (GC):** Kullanılmayan nesneleri bellekten temizler.
- **Thread Management:** Çoklu işlemler arasında zamanlamayı yönetir.
- **Exception Handling:** Çalışma sırasında oluşan hataları yakalar.

---

## **8. Programın Çıkışı**
Eğer her şey doğru giderse, programın çıktısı ekrana yazdırılır:

```sh
Hello, World!
```

---

### **Genel Özet: Java Çalışma Döngüsü**
1. **Source Code (`.java`) yazılır.**
2. **Java Compiler (`javac`) kodu Bytecode (`.class`) haline getirir.**
3. **ClassLoader**, `.class` dosyasını JVM’ye yükler.
4. **Bytecode Verification** aşaması güvenlik kontrolü yapar.
5. **Interpreter**, Bytecode’u **satır satır yorumlar** ve çalıştırır.
6. **JIT Compiler**, sık kullanılan kodları **makine koduna** çevirir (performans artırır).
7. **Garbage Collector**, kullanılmayan bellekleri temizler.
8. **Program sonucu ekrana yazdırılır.**

---

### **Compiler vs. Interpreter: Hangisi Önce?**
✅ **Önce Compiler (`javac`) çalışır → Sonra Interpreter (`JVM`) çalışır.**  
🚀 **Sonuç:** Java hem **compiled** (derlenen) hem de **interpreted** (yorumlanan) bir dildir.


# **Java Wrapper Type Nedir? – Detaylı Açıklama**

## **1. Wrapper Type (Sarmalayıcı Tür) Nedir?**
Java'da **Wrapper Type**, **primitive type (ilkel veri türleri)** ile çalışırken nesneye (Object) ihtiyaç duyduğumuz durumlarda kullanılan **sarmalayıcı (wrapper) sınıflardır**.

### **Neden Wrapper Type Kullanılır?**
Java’daki **primitive veri türleri (`int`, `double`, `boolean` vb.) nesne değildir.** Ancak, Java’da birçok yapı (Koleksiyonlar `List`, `Set`, `Map` vb.) **nesnelerle çalışır**. Bu nedenle **primitive türleri nesnelere dönüştürmek için** Wrapper Type kullanılır.

**Örnek:**
```java
int x = 10;          // Primitive type
Integer y = 10;      // Wrapper type (Nesne)
```
Burada:
- `x` bir **primitive** int türüdür.
- `y` ise **Integer sınıfından bir nesnedir**.

---

## **2. Primitive Type ve Wrapper Type Karşılaştırması**
| **Primitive Type** | **Karşılık Gelen Wrapper Type** |
|-------------------|--------------------------------|
| `byte`           | `Byte`                         |
| `short`          | `Short`                        |
| `int`            | `Integer`                      |
| `long`           | `Long`                         |
| `float`          | `Float`                        |
| `double`         | `Double`                       |
| `char`           | `Character`                    |
| `boolean`        | `Boolean`                      |

💡 **Wrapper sınıflar, primitive türlerin büyük harfle başlayan ve nesne olarak kullanılabilen versiyonlarıdır.**

---

## **3. Wrapper Type Kullanımı**
Wrapper sınıfları genellikle **koleksiyonlarla çalışma, null değer atama, veri türleri arasında dönüşüm yapma** gibi işlemler için kullanılır.

### **Örnek Kullanım:**
```java
import java.util.ArrayList;
import java.util.List;

public class WrapperExample {
    public static void main(String[] args) {
        List<Integer> sayilar = new ArrayList<>();
        sayilar.add(10);  // int → Integer (Autoboxing)
        sayilar.add(20);
        System.out.println(sayilar); // [10, 20]
    }
}
```
📌 **List<int> kullanılamaz!** Java Koleksiyonları nesnelerle çalıştığından, **List<Integer>** kullanmalıyız.

---

## **4. Autoboxing ve Unboxing**
Java 5 ile gelen **Autoboxing ve Unboxing**, primitive türler ile Wrapper türler arasında **otomatik dönüşüm sağlar**.

### **4.1. Autoboxing (Primitive → Wrapper)**
Java, **primitive türleri otomatik olarak nesneye çevirir**.

```java
public class AutoboxingExample {
    public static void main(String[] args) {
        int primitiveValue = 100;
        Integer wrapperValue = primitiveValue; // Autoboxing (int → Integer)

        System.out.println(wrapperValue); // 100
    }
}
```
**Arka planda şuna dönüşür:**
```java
Integer wrapperValue = Integer.valueOf(primitiveValue);
```

---

### **4.2. Unboxing (Wrapper → Primitive)**
Wrapper türleri, **otomatik olarak primitive türlerine dönüştürülür**.

```java
public class UnboxingExample {
    public static void main(String[] args) {
        Integer wrapperValue = 200;
        int primitiveValue = wrapperValue; // Unboxing (Integer → int)

        System.out.println(primitiveValue); // 200
    }
}
```
**Arka planda şuna dönüşür:**
```java
int primitiveValue = wrapperValue.intValue();
```

---

## **5. Wrapper Type Metotları**
Wrapper sınıfları, **primitive türlerde olmayan bazı metotlara sahiptir**.

### **5.1. `valueOf()` – Primitive’den Wrapper’a Dönüştürme**
```java
Integer intObj = Integer.valueOf(10);
Double doubleObj = Double.valueOf(5.5);
Boolean boolObj = Boolean.valueOf(true);

System.out.println(intObj);   // 10
System.out.println(doubleObj); // 5.5
System.out.println(boolObj);  // true
```

---

### **5.2. `xxxValue()` – Wrapper’dan Primitive’e Dönüştürme**
```java
Integer intObj = Integer.valueOf(100);
int primitiveInt = intObj.intValue(); // Wrapper → Primitive

Double doubleObj = Double.valueOf(55.5);
double primitiveDouble = doubleObj.doubleValue(); // Wrapper → Primitive

System.out.println(primitiveInt);  // 100
System.out.println(primitiveDouble); // 55.5
```

---

### **5.3. `parseXXX()` – String’den Primitive’e Dönüştürme**
```java
int sayi = Integer.parseInt("123");
double ondalik = Double.parseDouble("12.34");
boolean dogruMu = Boolean.parseBoolean("true");

System.out.println(sayi);      // 123
System.out.println(ondalik);   // 12.34
System.out.println(dogruMu);   // true
```
📌 **Eğer String geçersizse `NumberFormatException` hatası alınır!**

---

### **5.4. `toString()` – Primitive’den String’e Dönüştürme**
```java
int sayi = 456;
String str = Integer.toString(sayi);
System.out.println(str); // "456"
```

Aynı işlem `String.valueOf()` ile de yapılabilir:
```java
String str2 = String.valueOf(sayi);
System.out.println(str2); // "456"
```

---

## **6. Wrapper Type Kullanım Senaryoları**
| **Senaryo** | **Primitive Kullanımı** | **Wrapper Kullanımı** |
|------------|--------------------|--------------------|
| **Performans & Bellek** | ✅ Daha hızlı, az bellek kullanır. | ❌ Daha fazla bellek kullanır. |
| **Koleksiyonlarla Kullanım** | ❌ Kullanılamaz. (`List<int>` hata verir) | ✅ Kullanılabilir. (`List<Integer>`) |
| **Null Değer Atama** | ❌ Mümkün değil. | ✅ Mümkün (`Integer x = null;`) |
| **Metot Kullanımı** | ❌ Metotları yoktur. | ✅ `valueOf()`, `parseInt()` gibi metotlar içerir. |
| **Generics (Jenerik Türler)** | ❌ Kullanılamaz (`T extends int` olmaz). | ✅ Kullanılabilir (`T extends Number`). |

---

## **7. Ne Zaman Hangi Tür Kullanılmalı?**
- **Performans ve bellek önemliyse → `primitive type` kullanın.**
- **Koleksiyonlar ve nesne yönelimli programlama gerekiyorsa → `wrapper type` kullanın.**
- **Null değeri gerekliyse → `wrapper type` kullanın.**
- **Matematiksel hesaplamalar için → `primitive type` daha hızlıdır.**

---

## **8. Özet**
| **Özellik** | **Primitive Type** | **Wrapper Type** |
|------------|----------------|----------------|
| **Bellek Kullanımı** | Az bellek tüketir. | Daha fazla bellek tüketir. |
| **Hız** | Daha hızlıdır. | Daha yavaştır. |
| **Null Değer** | ❌ Null olamaz. | ✅ Null olabilir. |
| **Nesne mi?** | ❌ Hayır. | ✅ Evet. |
| **Metotları Var mı?** | ❌ Hayır. | ✅ `parseInt()`, `valueOf()` gibi metotları vardır. |
| **Koleksiyonlarla Kullanılabilir mi?** | ❌ Hayır. | ✅ Evet. |

📌 **Özetle:** **Wrapper Type**, nesne yönelimli programlama ve koleksiyonlarla çalışırken kullanılır. Ancak, **performans ve bellek yönetimi açısından primitive type daha avantajlıdır**.

💡 **Soru:** `List<int> list = new ArrayList<>();` neden hata verir?
📌 **Cevap:** Java koleksiyonları nesne tutar. `int` bir nesne değildir, bu yüzden **`List<Integer>`** kullanmalıyız. 🚀


## Cast-1
```sh 

```
---
# **📌 Java'da Cast (Tür Dönüştürme) Nedir? (Detaylı Açıklama)**

## **🔹 1. Cast (Tür Dönüştürme) Nedir?**
Java'da **Cast (Tür Dönüştürme)**, bir değişkenin veya nesnenin **bir veri tipinden başka bir veri tipine dönüştürülmesi işlemidir**.

Tür dönüştürme (casting) **iki ana kategoriye ayrılır:**
1. **Primitive (İlkel) Türler Arasında Dönüştürme**
    - **Genişletilmiş Dönüştürme (Widening Cast - Implicit Cast)**
    - **Daraltılmış Dönüştürme (Narrowing Cast - Explicit Cast)**

2. **Referans Türleri (Object) Arasında Dönüştürme**
    - **Upcasting (Yukarı Dönüştürme)**
    - **Downcasting (Aşağı Dönüştürme)**

---

# **🔹 2. Primitive (İlkel) Türler Arasında Dönüştürme**
## **✅ 2.1 Genişletilmiş Dönüştürme (Widening Cast - Implicit Cast)**
- **Küçük bir veri türü, otomatik olarak daha büyük bir veri türüne atanabilir.**
- **Veri kaybı yaşanmaz.**
- **Bu dönüşüm otomatik (implicit) olarak yapılır.**

### **📌 Örnek**
```java
public class WideningExample {
    public static void main(String[] args) {
        int sayi = 100;
        double genisSayi = sayi; // Otomatik dönüşüm (int → double)
        
        System.out.println("int değer: " + sayi);
        System.out.println("double değere dönüştü: " + genisSayi);
    }
}
```
**Çıktı:**
```
int değer: 100
double değere dönüştü: 100.0
```
📌 **Önemli Notlar:**
- **`byte → short → int → long → float → double` dönüşümleri otomatiktir.**
- **Veri kaybı yoktur, çünkü genişleyen tür daha fazla veri saklayabilir.**

---

## **✅ 2.2 Daraltılmış Dönüştürme (Narrowing Cast - Explicit Cast)**
- **Büyük bir veri türü, daha küçük bir veri türüne dönüştürülür.**
- **Veri kaybı veya hassasiyet kaybı olabilir.**
- **Manuel olarak yapılmalıdır (Explicit Cast).**

### **📌 Örnek**
```java
public class NarrowingExample {
    public static void main(String[] args) {
        double buyukSayi = 9.78;
        int kucukSayi = (int) buyukSayi; // Açık dönüşüm (double → int)

        System.out.println("double değer: " + buyukSayi);
        System.out.println("int değere dönüştü: " + kucukSayi);
    }
}
```
**Çıktı:**
```
double değer: 9.78
int değere dönüştü: 9
```
📌 **Önemli Notlar:**
- **`double → float → long → int → short → byte` dönüşümlerinde veri kaybı olabilir.**
- **Kesirli sayılar `int` gibi tam sayı türlerine dönüştürülürken küsurat kaybolur.**

---

## **✅ 2.3 `char` ve `int` Dönüştürme**
📌 **`char` ve `int` türleri ASCII değerlerine göre birbirine dönüştürülebilir.**

```java
public class CharToIntExample {
    public static void main(String[] args) {
        char karakter = 'A';
        int ascii = karakter; // 'A' karakterinin ASCII kodu

        System.out.println("Karakter: " + karakter);
        System.out.println("ASCII Kodu: " + ascii);
    }
}
```
**Çıktı:**
```
Karakter: A
ASCII Kodu: 65
```

**Tam tersi dönüşüm:**
```java
int kod = 97;
char karakter = (char) kod; // ASCII 97 → 'a'

System.out.println("ASCII Kodu: " + kod);
System.out.println("Karakter: " + karakter);
```
**Çıktı:**
```
ASCII Kodu: 97
Karakter: a
```

---

# **🔹 3. Referans Türleri (Nesne) Arasında Dönüştürme**
Java'da **nesne dönüşümleri (Object Casting), `Object` ve `Class` hiyerarşisine dayanır**.

## **✅ 3.1 Upcasting (Yukarı Dönüştürme)**
- **Alt sınıf nesnesi, üst sınıf türüne çevrilebilir.**
- **Otomatik olarak (Implicit Cast) yapılır.**
- **Metotlar sadece üst sınıf türüne ait olanlarla sınırlıdır.**

### **📌 Örnek**
```java
class Hayvan {
    void sesCikar() {
        System.out.println("Hayvan ses çıkarıyor...");
    }
}

class Kedi extends Hayvan {
    void miyavla() {
        System.out.println("Kedi miyavlıyor!");
    }
}

public class UpcastingExample {
    public static void main(String[] args) {
        Hayvan hayvan = new Kedi(); // Upcasting (Otomatik)
        hayvan.sesCikar(); // Üst sınıf metodu çağrılabilir
        // hayvan.miyavla(); // HATA! Çünkü hayvan referansı Kedi'nin metodunu göremez.
    }
}
```
**Çıktı:**
```
Hayvan ses çıkarıyor...
```
📌 **Alt sınıf nesnesi üst sınıfa dönüştüğünde, sadece üst sınıfa ait metotlar kullanılabilir.**

---

## **✅ 3.2 Downcasting (Aşağı Dönüştürme)**
- **Üst sınıf nesnesini, alt sınıf türüne dönüştürmek için yapılır.**
- **Explicit Cast (Manuel) gereklidir.**
- **Eğer nesne gerçekten alt sınıftan türemediyse, `ClassCastException` hatası oluşur.**

### **📌 Örnek**
```java
class Hayvan {
    void sesCikar() {
        System.out.println("Hayvan ses çıkarıyor...");
    }
}

class Kedi extends Hayvan {
    void miyavla() {
        System.out.println("Kedi miyavlıyor!");
    }
}

public class DowncastingExample {
    public static void main(String[] args) {
        Hayvan hayvan = new Kedi(); // Upcasting
        Kedi kedi = (Kedi) hayvan; // Downcasting (Manuel)
        kedi.miyavla(); // Artık Kedi'ye ait metotlara erişebiliriz
    }
}
```
**Çıktı:**
```
Kedi miyavlıyor!
```

🚨 **Ancak, yanlış tür dönüşümü yaparsak hata alırız!**
```java
Hayvan hayvan = new Hayvan();
Kedi kedi = (Kedi) hayvan; // HATA! hayvan nesnesi aslında bir Kedi değil.
```
📌 **Bu hatayı önlemek için `instanceof` operatörü kullanılabilir.**

---

## **✅ 3.3 `instanceof` ile Güvenli Downcasting**
📌 **`instanceof` operatörü, bir nesnenin belirli bir sınıfa ait olup olmadığını kontrol eder.**

```java
if (hayvan instanceof Kedi) {
    Kedi kedi = (Kedi) hayvan;
    kedi.miyavla();
} else {
    System.out.println("Nesne Kedi türüne ait değil.");
}
```

---

# **📌 4. Özet**
| **Dönüştürme Türü** | **Otomatik mi?** | **Veri Kaybı Var mı?** | **Örnek** |
|---------------------|-----------------|----------------------|----------------------|
| **Genişletilmiş Dönüşüm (Widening)** | ✅ Evet | ❌ Hayır | `int → double` |
| **Daraltılmış Dönüşüm (Narrowing)** | ❌ Hayır | ✅ Evet | `double → int` |
| **Upcasting (Yukarı Dönüştürme)** | ✅ Evet | ❌ Hayır | `Kedi → Hayvan` |
| **Downcasting (Aşağı Dönüştürme)** | ❌ Hayır | ✅ Hata Oluşabilir | `Hayvan → Kedi` |

📌 **Tür dönüşümleri (Casting) sayesinde Java'da veri türleri arasında geçiş yapabiliriz.**  
Ancak **veri kaybını ve hataları önlemek için dikkatli olunmalıdır! 🚀**


## Cast-2
```sh 

```
---

# **📌 Java'da String ⇄ int Dönüştürme (Cast İşlemi)**
Java'da **`String` ⇄ `int` dönüşümü**, farklı yöntemlerle gerçekleştirilebilir.

---

## **✅ 1. `String` → `int` Çevirme**
📌 **`Integer.parseInt(String)`** ve **`Integer.valueOf(String)`** kullanılır.

### **📌 Örnek 1: `parseInt()` ile String'i int'e Çevirme**
```java
public class StringToIntExample {
    public static void main(String[] args) {
        String sayiStr = "123"; // String veri
        int sayi = Integer.parseInt(sayiStr); // String → int dönüşümü
        
        System.out.println("String: " + sayiStr);
        System.out.println("int: " + sayi);
    }
}
```
**Çıktı:**
```
String: 123
int: 123
```
📌 **Önemli:**
- `parseInt()` sadece **tam sayı (integer) içeren stringleri** dönüştürebilir.
- `"123abc"` gibi hatalı stringler `NumberFormatException` hatası verir.

🚨 **Hatalı Kullanım:**
```java
String hataliStr = "123abc";
int sayi = Integer.parseInt(hataliStr); // HATA! NumberFormatException
```

---

### **📌 Örnek 2: `valueOf()` ile String'i int'e Çevirme**
📌 **`Integer.valueOf(String)`**, `int` yerine **`Integer` (Wrapper Class)** döndürür.
```java
public class ValueOfExample {
    public static void main(String[] args) {
        String sayiStr = "456";
        int sayi = Integer.valueOf(sayiStr); // String → Integer
        
        System.out.println("int değeri: " + sayi);
    }
}
```
📌 **`parseInt()` ve `valueOf()` arasındaki fark:**
- **`parseInt()`** → `int` döndürür.
- **`valueOf()`** → `Integer` döndürür.

---

## **✅ 2. `int` → `String` Çevirme**
📌 **`String.valueOf(int)`** ve **`Integer.toString(int)`** kullanılır.

### **📌 Örnek 3: `String.valueOf(int)` ile int'i String'e Çevirme**
```java
public class IntToStringExample {
    public static void main(String[] args) {
        int sayi = 789;
        String sayiStr = String.valueOf(sayi); // int → String
        
        System.out.println("int: " + sayi);
        System.out.println("String: " + sayiStr);
    }
}
```
📌 **Bu yöntem, `double`, `float`, `boolean` gibi türleri de `String`e çevirebilir.**

---

### **📌 Örnek 4: `Integer.toString(int)` ile int'i String'e Çevirme**
```java
public class IntToStringExample2 {
    public static void main(String[] args) {
        int sayi = 1234;
        String sayiStr = Integer.toString(sayi); // int → String
        
        System.out.println("String değeri: " + sayiStr);
    }
}
```
📌 **`String.valueOf()` ve `Integer.toString()` arasındaki fark:**
- **`String.valueOf(int)`** → Tüm veri tipleri için çalışır (`boolean`, `double`, vb.).
- **`Integer.toString(int)`** → Sadece `int` türü için kullanılır.

---

## **✅ 3. Alternatif: `+ ""` Kullanımı**
📌 **`int` türündeki sayıyı `String` yapmak için `+ ""` kullanabiliriz.**
```java
public class PlusStringExample {
    public static void main(String[] args) {
        int sayi = 500;
        String sayiStr = sayi + ""; // int → String
        
        System.out.println("String değeri: " + sayiStr);
    }
}
```
📌 **Bu yöntem daha az performanslıdır ve `toString()` veya `valueOf()` kullanılması önerilir.**

---

# **📌 4. Özet**
| **Dönüşüm** | **Yöntem** | **Örnek Kullanım** |
|------------|------------|--------------------|
| **`String` → `int`** | `Integer.parseInt(String)` | `int sayi = Integer.parseInt("123");` |
| **`String` → `Integer`** | `Integer.valueOf(String)` | `Integer sayi = Integer.valueOf("456");` |
| **`int` → `String`** | `String.valueOf(int)` | `String str = String.valueOf(789);` |
| **`int` → `String`** | `Integer.toString(int)` | `String str = Integer.toString(1234);` |
| **`int` → `String`** | `+ ""` yöntemi | `String str = 500 + "";` |

📌 **Bu yöntemleri kullanarak, Java'da `String` ve `int` arasında güvenli dönüşümler yapabilirsiniz! 🚀**

## Java Math
```sh 

```
---

# **Java Math (Matematiksel İşlemler) - Detaylı Açıklama**

Java'da **matematiksel işlemleri gerçekleştirmek** için kullanılan **Math** sınıfı (`java.lang.Math`), birçok hazır **matematik fonksiyonu** sunar. Bu fonksiyonlar sayesinde **üstel, logaritmik, trigonometrik ve yuvarlama işlemleri** gibi birçok işlemi gerçekleştirebiliriz.

---

# **1. `Math` Sınıfının Genel Özellikleri**
✅ **Math sınıfı `java.lang` paketinin bir parçasıdır**  
✅ **Statik metotlar içerir, bu yüzden nesne oluşturmaya gerek yoktur**  
✅ **Performans açısından optimize edilmiştir**  
✅ **Temel aritmetik, yuvarlama, üstel işlemler, trigonometri fonksiyonları içerir**

Örneğin:
```java
double sqrtValue = Math.sqrt(25); // 5.0
double powerValue = Math.pow(2, 3); // 8.0
double randomValue = Math.random(); // 0 ile 1 arasında rastgele sayı
```

---

# **2. Java Math Sınıfının Kullanımı**

### **A. Temel Matematiksel İşlemler**
Math sınıfı **mutlak değer, maksimum, minimum gibi işlemleri** kolayca yapar.

| **Metot**               | **Açıklama** | **Örnek Kullanım** |
|-------------------------|-------------|---------------------|
| `Math.abs(x)`          | x’in mutlak değerini döndürür. | `Math.abs(-10) → 10` |
| `Math.max(a, b)`       | a ve b’nin maksimumunu bulur. | `Math.max(5, 8) → 8` |
| `Math.min(a, b)`       | a ve b’nin minimumunu bulur. | `Math.min(5, 8) → 5` |

```java
System.out.println(Math.abs(-15)); // 15
System.out.println(Math.max(100, 200)); // 200
System.out.println(Math.min(50, 30)); // 30
```

---

### **B. Üstel ve Logaritmik İşlemler**
| **Metot**                | **Açıklama** | **Örnek Kullanım** |
|-------------------------|-------------|---------------------|
| `Math.sqrt(x)`         | x’in karekökünü döndürür. | `Math.sqrt(9) → 3.0` |
| `Math.pow(x, y)`       | x’in y. kuvvetini hesaplar. | `Math.pow(2, 3) → 8.0` |
| `Math.exp(x)`          | e^x hesaplar. | `Math.exp(2) → 7.389` |
| `Math.log(x)`          | x’in doğal logaritmasını hesaplar (ln x). | `Math.log(2.718)` |
| `Math.log10(x)`        | x’in 10 tabanında logaritmasını hesaplar. | `Math.log10(100) → 2.0` |

```java
System.out.println(Math.sqrt(16)); // 4.0
System.out.println(Math.pow(2, 5)); // 32.0
System.out.println(Math.exp(1)); // 2.718
System.out.println(Math.log(Math.E)); // 1.0
System.out.println(Math.log10(1000)); // 3.0
```

---

### **C. Yuvarlama İşlemleri**
Java Math sınıfı **yuvarlama işlemleri için** farklı fonksiyonlar sunar.

| **Metot**             | **Açıklama** | **Örnek Kullanım** |
|----------------------|-------------|---------------------|
| `Math.round(x)`     | En yakın tam sayıya yuvarlar. | `Math.round(5.7) → 6` |
| `Math.ceil(x)`      | Yukarı yuvarlar. | `Math.ceil(3.2) → 4.0` |
| `Math.floor(x)`     | Aşağı yuvarlar. | `Math.floor(3.9) → 3.0` |

```java
System.out.println(Math.round(4.5)); // 5
System.out.println(Math.ceil(3.2)); // 4.0
System.out.println(Math.floor(6.8)); // 6.0
```
---

### **D. Trigonometri Fonksiyonları**
Trigonometri fonksiyonları **radyan cinsinden** hesaplama yapar.

| **Metot**            | **Açıklama** | **Örnek Kullanım** |
|----------------------|-------------|---------------------|
| `Math.sin(x)`      | x’in sinüsünü hesaplar. | `Math.sin(Math.PI/2) → 1.0` |
| `Math.cos(x)`      | x’in kosinüsünü hesaplar. | `Math.cos(0) → 1.0` |
| `Math.tan(x)`      | x’in tanjantını hesaplar. | `Math.tan(Math.PI/4) → 1.0` |
| `Math.asin(x)`     | x’in ters sinüsünü hesaplar. | `Math.asin(0.5)` |
| `Math.acos(x)`     | x’in ters kosinüsünü hesaplar. | `Math.acos(1)` |
| `Math.atan(x)`     | x’in ters tanjantını hesaplar. | `Math.atan(1)` |

```java
System.out.println(Math.sin(Math.PI/2)); // 1.0
System.out.println(Math.cos(0)); // 1.0
System.out.println(Math.tan(Math.PI/4)); // 1.0
```

---

### **E. Rastgele Sayı Üretme**
`Math.random()` metodu **0.0 ile 1.0 arasında rastgele bir sayı döndürür**.

**Örnek Kullanımlar:**
```java
System.out.println(Math.random()); // 0.0 ile 1.0 arasında rastgele sayı
System.out.println((int)(Math.random() * 100)); // 0-99 arası sayı
System.out.println((int)(Math.random() * 50) + 1); // 1-50 arası sayı
```

---

### **F. Sabitler**
Math sınıfı **matematiksel sabitleri** de içerir.

| **Sabit** | **Açıklama** | **Örnek Kullanım** |
|----------|-------------|---------------------|
| `Math.PI` | π değeri (3.141592653589793) | `Math.PI * r * r` (Daire Alanı) |
| `Math.E` | Euler sabiti (2.718281828459045) | `Math.exp(1) → 2.718` |

```java
System.out.println(Math.PI); // 3.141592653589793
System.out.println(Math.E); // 2.718281828459045
```
---

# **3. Java Math Kullanımına Örnek**
Aşağıdaki Java programı, **Math sınıfının en önemli metodlarını** içeren bir örnektir.

```java
public class MathExample {
    public static void main(String[] args) {
        // Mutlak Değer
        System.out.println("Mutlak Değer: " + Math.abs(-25));

        // Karekök ve Üstel İşlemler
        System.out.println("Karekök: " + Math.sqrt(64));
        System.out.println("Üs Al: " + Math.pow(2, 5));

        // Yuvarlama İşlemleri
        System.out.println("Yuvarla (Round): " + Math.round(4.6));
        System.out.println("Yukarı Yuvarla (Ceil): " + Math.ceil(4.2));
        System.out.println("Aşağı Yuvarla (Floor): " + Math.floor(4.9));

        // Rastgele Sayı
        System.out.println("Rastgele Sayı (0-100): " + (int)(Math.random() * 100));

        // Trigonometri
        System.out.println("Sinüs: " + Math.sin(Math.toRadians(90)));
        System.out.println("Kosinüs: " + Math.cos(Math.toRadians(0)));

        // Matematiksel Sabitler
        System.out.println("PI Sayısı: " + Math.PI);
    }
}
```

---

# **Sonuç**
- **Java Math sınıfı**, temel ve ileri matematik işlemlerini hızlı ve optimize bir şekilde yapar.
- **Math metotları `static` olduğu için nesne oluşturmaya gerek yoktur.**
- **Yuvarlama, üstel işlemler, logaritma, trigonometrik fonksiyonlar gibi birçok fonksiyon içerir.**

🚀 **Java'da matematik işlemleri için `Math` sınıfını öğrenmek, sayısal işlemleri hızlı ve verimli yapmanızı sağlar!** 🚀


## Java Core
```sh 

```
---

### **Java Core Escape (Kaçış Dizileri) Nedir?**
Java'da **escape sequences (kaçış dizileri)**, özel karakterleri String içinde kullanmamızı sağlayan ters eğik çizgi (`\`) ile başlayan özel karakterlerdir. Normalde doğrudan yazılamayan karakterleri temsil ederler.

💡 **Örneğin:**
- `"` çift tırnak işareti bir String içinde doğrudan yazılamaz. (`"Bu bir "örnek" metin"`) → Hatalı
- Çözüm: `\"` kaçış dizisi kullanılır. (`"Bu bir \"örnek\" metin"`) → Doğru

---

## **Java'daki Kaçış Dizileri (Escape Sequences)**
| **Kaçış Dizisi** | **Anlamı** | **Örnek Kullanımı** |
|----------------|----------|----------------|
| `\n` | Yeni satır (Newline) | `"Satır 1\nSatır 2"` |
| `\t` | Sekme (Tab) | `"İsim:\tMehmet"` |
| `\'` | Tek tırnak (Single quote) | `char c = '\'';` |
| `\"` | Çift tırnak (Double quote) | `"Bu bir \"örnek\" metin"` |
| `\\` | Ters eğik çizgi (Backslash) | `"C:\\Users\\Documents"` |
| `\r` | Satır başı (Carriage return) | `"Merhaba\rDünya"` |
| `\b` | Geri al (Backspace) | `"ABC\bD"` (Sonuç: "ABD") |
| `\f` | Form feed (Sayfa sonu) | `"Sayfa sonu\fYeni Sayfa"` |
| `\uXXXX` | Unicode karakteri | `"\u00E7"` (ç harfi) |

---

## **Kaçış Dizileriyle Örnekler**
### **1. `\n` → Yeni Satır**
```java
public class EscapeExample {
    public static void main(String[] args) {
        System.out.println("Merhaba Dünya!\nBu bir alt satıra geçti.");
    }
}
```
**Çıktı:**
```
Merhaba Dünya!
Bu bir alt satıra geçti.
```

---

### **2. `\t` → Sekme (Tab)**
```java
public class EscapeExample {
    public static void main(String[] args) {
        System.out.println("İsim:\tHamit");
        System.out.println("Soyisim:\tYılmaz");
    }
}
```
**Çıktı:**
```
İsim:     Hamit
Soyisim:  Yılmaz
```

---

### **3. `\'` ve `\"` → Tek ve Çift Tırnak**
```java
public class EscapeExample {
    public static void main(String[] args) {
        System.out.println("Bu bir \"Java\" programıdır.");
        System.out.println("Tek tırnak: \'A\' karakteri");
    }
}
```
**Çıktı:**
```
Bu bir "Java" programıdır.
Tek tırnak: 'A' karakteri
```

---

### **4. `\\` → Ters Eğik Çizgi**
```java
public class EscapeExample {
    public static void main(String[] args) {
        System.out.println("Dosya yolu: C:\\Users\\Documents\\file.txt");
    }
}
```
**Çıktı:**
```
Dosya yolu: C:\Users\Documents\file.txt
```

---

### **5. `\r` → Satır Başı**
```java
public class EscapeExample {
    public static void main(String[] args) {
        System.out.println("Merhaba\rDünya!");
    }
}
```
**Çıktı (bazı sistemlerde farklı olabilir):**
```
Dünya!
```
📌 `\r`, satır başına döner ve **"Dünya!"**, "Merhaba"nın üzerine yazılır.

---

### **6. `\b` → Geri Al (Backspace)**
```java
public class EscapeExample {
    public static void main(String[] args) {
        System.out.println("ABC\bD");
    }
}
```
**Çıktı:**
```
ABD
```
📌 `\b` ifadesi, **son karakteri siler**. `"ABC\bD"` → `C` silinir, sonuç `"ABD"` olur.

---

### **7. `\f` → Form Feed (Sayfa Sonu)**
```java
public class EscapeExample {
    public static void main(String[] args) {
        System.out.println("Sayfa sonu\fYeni Sayfa");
    }
}
```
📌 Çoğu modern sistemde görünmezdir ama yazıcı ve eski terminallerde **sayfa sonu karakteri** olarak kullanılır.

---

### **8. `\uXXXX` → Unicode Kullanımı**
```java
public class EscapeExample {
    public static void main(String[] args) {
        System.out.println("Türkçe karakter: \u00E7, \u011F, \u015F");
    }
}
```
**Çıktı:**
```
Türkçe karakter: ç, ğ, ş
```
📌 **Unicode** ile tüm dillerde özel karakterler kullanılabilir.

---

## **Sonuç**
- Java'da **kaçış dizileri**, String içinde özel karakterleri kullanmamızı sağlar.
- En sık kullanılanlar: `\n` (yeni satır), `\t` (sekme), `\"` (çift tırnak), `\\` (ters eğik çizgi).
- **Gelişmiş kullanım:** Unicode (`\uXXXX`) ile özel karakterleri String içinde yazabiliriz.

📌 **Özetle:** Eğer bir metin içinde özel karakterler yazmak istiyorsanız, **escape sequences** kullanmanız gereklidir! 🚀


# **Java Scanner Sınıfı (java.util.Scanner) – Detaylı Açıklama**
## **1. Scanner Nedir?**
**Scanner**, Java’da **kullanıcıdan giriş almak**, **dosyalardan veri okumak** ve **stringleri ayrıştırmak (parsing)** için kullanılan bir sınıftır. **java.util.Scanner** paketinde bulunur.

Java’da veri girişlerini almak için **System.in (klavyeden giriş), dosyalardan okuma (File), Stringlerden okuma** gibi işlemler için kullanılır.

---

## **2. Scanner Sınıfının Kullanım Alanları**
| **Kullanım Alanı** | **Açıklama** |
|-----------------|--------------|
| **Kullanıcıdan veri almak** | `Scanner` ile klavyeden giriş alabiliriz. |
| **Dosya okumak** | Dosyalardan satır satır veya kelime kelime veri okuyabiliriz. |
| **String parçalama** | String ifadeleri belirli bir ayraç ile bölebiliriz. |
| **Veri türlerine dönüştürme** | String değerleri `int`, `double`, `boolean` gibi tiplere çevirebiliriz. |

---

## **3. Scanner Sınıfının Import Edilmesi**
Scanner sınıfı **java.util** paketinde bulunduğu için kullanmadan önce **import edilmesi gerekir**:

```java
import java.util.Scanner;
```

💡 **Eğer `import java.util.Scanner;` yazmazsak, Java bu sınıfı tanımaz ve hata verir!**

---

## **4. Scanner ile Kullanıcıdan Veri Alma**
Scanner sınıfı ile **farklı türlerde** veri alabiliriz:

### **4.1. String Veri Okuma (`next()` ve `nextLine()`)**
```java
import java.util.Scanner;

public class ScannerExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Adınızı girin: ");
        String ad = scanner.next();  // Tek kelime okur

        System.out.print("Soyadınızı girin: ");
        String soyad = scanner.next();  // Tek kelime okur

        System.out.print("Cümlenizi girin: ");
        scanner.nextLine(); // Önceki enter'ı temizler
        String cumle = scanner.nextLine(); // Bütün satırı okur

        System.out.println("Adınız: " + ad);
        System.out.println("Soyadınız: " + soyad);
        System.out.println("Girdiğiniz cümle: " + cumle);

        scanner.close();
    }
}
```
### **Farklar:**
| **Metot** | **Açıklama** |
|----------|--------------|
| `next()` | **Tek bir kelime** okur. Boşluk görünce okuma işlemi durur. |
| `nextLine()` | **Bütün satırı** okur. Enter tuşuna basılana kadar bekler. |

💡 **Not:** `nextLine()` kullanmadan önce `next()` veya `nextInt()` gibi metotlar çalıştırılırsa, enter karakterini temizlemek için bir `scanner.nextLine();` satırı eklenmelidir.

---

### **4.2. Sayısal Veri Okuma (`nextInt()`, `nextDouble()`, `nextFloat()`, `nextLong()`)**
```java
import java.util.Scanner;

public class ScannerExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Yaşınızı girin: ");
        int yas = scanner.nextInt();

        System.out.print("Boyunuzu girin: ");
        double boy = scanner.nextDouble();

        System.out.print("Ağırlığınızı girin: ");
        float agirlik = scanner.nextFloat();

        System.out.println("Yaşınız: " + yas);
        System.out.println("Boyunuz: " + boy);
        System.out.println("Kilonuz: " + agirlik);

        scanner.close();
    }
}
```

### **Metotlar ve Veri Türleri**
| **Metot** | **Aldığı Veri Türü** |
|---------|--------------|
| `nextInt()` | `int` (Tamsayı) |
| `nextDouble()` | `double` (Ondalıklı sayı) |
| `nextFloat()` | `float` (Küçük ondalıklı sayı) |
| `nextLong()` | `long` (Büyük tamsayı) |
| `nextShort()` | `short` (Küçük tamsayı) |
| `nextByte()` | `byte` (Çok küçük tamsayı) |
| `nextBoolean()` | `boolean` (true/false) |

📌 **Dikkat:** Kullanıcı eğer yanlış türde giriş yaparsa (`nextInt()` beklerken `a` girerse), hata (`InputMismatchException`) oluşur.

---

## **5. Scanner ile Dosya Okuma**
Scanner sınıfı sadece **klavyeden giriş almak için değil**, **dosyalardan veri okumak için de** kullanılır.

```java
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileScannerExample {
    public static void main(String[] args) {
        try {
            File file = new File("veri.txt");
            Scanner scanner = new Scanner(file);

            while (scanner.hasNextLine()) {
                String satir = scanner.nextLine();
                System.out.println(satir);
            }

            scanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("Dosya bulunamadı!");
        }
    }
}
```
### **Açıklamalar:**
- `new File("veri.txt")` → `"veri.txt"` dosyasını açar.
- `hasNextLine()` → **Dosyada satır kaldığı sürece okumaya devam eder.**
- `nextLine()` → **Satır satır okur.**
- **Dosya yoksa** `FileNotFoundException` fırlatılır.

---

## **6. Scanner ile Belirli Bir Ayraca Göre String Parçalama**
Scanner, **virgül, boşluk veya özel karakterlere** göre string parçalamak için kullanılabilir.

```java
import java.util.Scanner;

public class ScannerDelimiterExample {
    public static void main(String[] args) {
        String veri = "Hamit,Mehmet,Ayşe,Fatma";
        Scanner scanner = new Scanner(veri);
        scanner.useDelimiter(",");

        while (scanner.hasNext()) {
            System.out.println(scanner.next());
        }

        scanner.close();
    }
}
```
### **Çıktı:**
```
Hamit
Mehmet
Ayşe
Fatma
```

📌 **Özet:** `scanner.useDelimiter(",")` ile **virgülü** ayırıcı olarak belirledik.

---

## **7. Scanner’ın Kapatılması (`close()`)**
Scanner nesnesi **kullanıldıktan sonra kapatılmalıdır**, aksi halde kaynak sızıntısı olabilir.

```java
scanner.close();
```

💡 **Eğer Scanner kapatılmazsa, bellek sızıntısına neden olabilir!**

---

## **8. Scanner ile Kullanıcıdan Tekrar Tekrar Veri Alma**
Eğer kullanıcıdan **sürekli giriş almak** istiyorsak, bir **döngü** kullanabiliriz.

```java
import java.util.Scanner;

public class ScannerLoopExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        while (true) {
            System.out.print("Bir sayı girin (Çıkış için -1): ");
            int sayi = scanner.nextInt();
            
            if (sayi == -1) {
                System.out.println("Çıkış yapıldı.");
                break;
            }
            
            System.out.println("Girdiğiniz sayı: " + sayi);
        }

        scanner.close();
    }
}
```
📌 **Kullanıcı `-1` girene kadar veri girişi yapabilir.**

---

## **9. Özet**
- **Scanner**, **kullanıcıdan veri almak**, **dosya okumak**, **stringleri ayrıştırmak** için kullanılır.
- `nextInt()`, `nextDouble()`, `nextLine()`, `next()` gibi metotlarla farklı veri türleri okunabilir.
- **Dosyalardan veri okumak için** `Scanner(File file)` kullanılabilir.
- **Belirli bir karaktere göre bölmek için** `useDelimiter()` kullanılabilir.
- **Kaynak sızıntısını önlemek için** `scanner.close();` ile kapatılmalıdır.

🚀 **Scanner, Java'da veri almak için en yaygın kullanılan sınıflardan biridir!**



## WORA
```sh 

```
---
Java'nın ünlü sloganı **"Write Once, Run Anywhere"** şeklindedir. **"Everywhere" değil, "Anywhere" kullanılır.**

### **Doğru Kullanım:**
✅ **"Write Once, Run Anywhere" (WORA)**

Bu slogan, Java programlarının **bir kez yazıldığında farklı platformlarda çalışabileceğini** ifade eder. **Anywhere** kelimesi, "herhangi bir yerde" anlamına gelir, yani **farklı işletim sistemleri ve donanımlarda çalışabilir** demektir.

### **Yanlış Kullanım:**
❌ **"Write Once, Run Everywhere"**

**"Everywhere" kelimesi** "her yerde" anlamına gelir, ancak Java'nın çalışma prensibi tam olarak bu değildir. **JVM'nin yüklü olmadığı bir ortamda Java çalışmaz**, bu yüzden **"everywhere" yerine "anywhere" daha doğru bir ifadedir.**

### **Özetle:**
💡 **Mülakatta doğru cevap:**  
✅ **"Write Once, Run Anywhere"** söylemelisiniz.  
❌ **"Everywhere" derseniz teknik olarak yanlış olur.**


## Conditional
```sh 

```
---
# **Java'da Conditional (Koşullu) İfadeler Nedir?**

**Conditional (Koşullu) ifadeler**, bir programın belirli koşullara bağlı olarak farklı yollar izlemesini sağlar. **Mantıksal karşılaştırmalar ve şartlar** kullanarak belirli blokların çalıştırılmasını kontrol ederiz.

Java'da kullanılan başlıca koşullu ifadeler şunlardır:

1. `if` ve `if-else` ifadeleri
2. `else if` (çoklu koşullar)
3. `switch-case` yapısı
4. **Ternary (`?:`) operatörü**
5. **Short-Circuit (`&&` ve `||`) operatörleri**

---

## **1. `if` ve `if-else` Yapısı**
### **1.1 `if` İfadesi**
- **Koşul doğru (`true`) olduğunda kod çalıştırılır.**
- **Yanlış (`false`) olursa hiçbir şey yapılmaz.**

**Örnek 1: Basit `if` kullanımı**
```java
public class IfExample {
    public static void main(String[] args) {
        int sayi = 10;
        
        if (sayi > 5) { // Koşul doğru mu? Evet!
            System.out.println("Sayı 5'ten büyüktür.");
        }
    }
}
```
**Çıktı:**
```
Sayı 5'ten büyüktür.
```
- `sayi > 5` olduğu için `if` bloğu çalıştı.

---

### **1.2 `if-else` Yapısı**
- **Koşul `true` ise `if` bloğu çalışır.**
- **Koşul `false` olursa `else` bloğu çalışır.**

**Örnek 2: `if-else` kullanımı**
```java
public class IfElseExample {
    public static void main(String[] args) {
        int sayi = 3;
        
        if (sayi > 5) {
            System.out.println("Sayı 5'ten büyüktür.");
        } else {
            System.out.println("Sayı 5'ten küçük veya eşittir.");
        }
    }
}
```
**Çıktı:**
```
Sayı 5'ten küçük veya eşittir.
```
- `sayi = 3` olduğu için `if` bloğu çalışmadı, `else` bloğu çalıştı.

---

## **2. `else if` (Çoklu Koşullar)**
- **Birden fazla koşulu test etmek için `else if` kullanılır.**
- **İlk doğru (`true`) koşul çalıştırılır, diğerleri atlanır.**

**Örnek 3: `else if` kullanımı**
```java
public class ElseIfExample {
    public static void main(String[] args) {
        int not = 75;

        if (not >= 90) {
            System.out.println("Harf Notu: A");
        } else if (not >= 80) {
            System.out.println("Harf Notu: B");
        } else if (not >= 70) {
            System.out.println("Harf Notu: C");
        } else {
            System.out.println("Harf Notu: F");
        }
    }
}
```
**Çıktı:**
```
Harf Notu: C
```
- `not = 75`, yani `not >= 70` olduğu için **sadece "Harf Notu: C"** yazdırıldı.

---

## **3. `switch-case` Yapısı**
- **Bir değişkenin belirli değerlere eşit olup olmadığını kontrol eder.**
- **Koşula bağlı olarak ilgili `case` çalıştırılır.**
- **Eğer hiçbir `case` eşleşmezse `default` bloğu çalışır.**
- **Her case’den sonra `break` kullanılmazsa, aşağıdaki tüm case’ler çalışır.**

### **Örnek 4: `switch-case` ile Gün İsmi**
```java
public class SwitchExample {
    public static void main(String[] args) {
        int gun = 3;

        switch (gun) {
            case 1:
                System.out.println("Pazartesi");
                break;
            case 2:
                System.out.println("Salı");
                break;
            case 3:
                System.out.println("Çarşamba");
                break;
            case 4:
                System.out.println("Perşembe");
                break;
            default:
                System.out.println("Geçersiz gün numarası");
        }
    }
}
```
**Çıktı:**
```
Çarşamba
```
- `gun = 3` olduğunda, `case 3` çalıştı.

---

## **4. Ternary (`?:`) Operatörü**
- **Koşullu ifadeleri kısaltmak için kullanılır.**
- **Tek satırda `if-else` mantığı sağlar.**
- **Kullanım:**
  ```java
  (koşul) ? "true ise çalışır" : "false ise çalışır"
  ```

### **Örnek 5: Ternary Operatörü Kullanımı**
```java
public class TernaryExample {
    public static void main(String[] args) {
        int sayi = 10;
        String sonuc = (sayi > 5) ? "Büyük" : "Küçük veya eşit";
        System.out.println(sonuc);
    }
}
```
**Çıktı:**
```
Büyük
```
- `sayi > 5` olduğu için `"Büyük"` değeri atanır.

---

## **5. Short-Circuit (`&&` ve `||`) Operatörleri**
**Kısa devre (Short-Circuiting)**, **gereksiz hesaplamaları önlemek için** kullanılan bir optimizasyondur.

| Operatör | Açıklama |
|----------|----------|
| `&&` (AND) | Eğer ilk koşul `false` ise, ikinci koşula **bakmaz**. |
| `||` (OR) | Eğer ilk koşul `true` ise, ikinci koşula **bakmaz**. |

### **Örnek 6: `&&` ile Short-Circuit Kullanımı**
```java
public class ShortCircuitExample {
    public static void main(String[] args) {
        int a = 5;
        int b = 10;

        if (a > 10 && ++b > 15) { // `a > 10` zaten false, ikinci koşula bakmaz
            System.out.println("Koşul sağlandı.");
        }
        System.out.println("b: " + b); // b artırılmadı!
    }
}
```
**Çıktı:**
```
b: 10
```
- `a > 10` **false olduğu için** `++b` çalışmaz, `b` aynı kalır.

---

### **Örnek 7: `||` ile Short-Circuit Kullanımı**
```java
public class ShortCircuitExample2 {
    public static void main(String[] args) {
        int x = 5;
        int y = 10;

        if (x < 10 || ++y > 15) { // `x < 10` true, ikinci koşula bakılmaz!
            System.out.println("Koşul sağlandı.");
        }
        System.out.println("y: " + y); // y artırılmadı!
    }
}
```
**Çıktı:**
```
Koşul sağlandı.
y: 10
```
- `x < 10` **true olduğu için** `++y` çalışmaz.

---

## **Sonuç**
| Yapı | Kullanım Amacı |
|------|---------------|
| `if` | Belirli bir koşulu test etmek |
| `if-else` | Koşul yanlışsa alternatif blok çalıştırmak |
| `else if` | Birden fazla koşulu kontrol etmek |
| `switch-case` | Belirli değerleri eşleştirerek çalıştırmak |
| `?:` (Ternary) | Kısa `if-else` ifadeleri için |
| `&&`, `||` | Kısa devre mantığı ile gereksiz işlemleri önlemek |

Bu koşullu yapılar, Java programlarında **karar mekanizmaları** oluşturmak için temel taşlardır. 🚀


## Loop
```sh 

```
---

# **Java'da Loop (Döngü) Nedir?**
Döngüler (Loops), bir işlemi **tekrar tekrar belirli bir koşul sağlanana kadar çalıştırmak** için kullanılır. Java'da en yaygın kullanılan döngüler şunlardır:

1. **for** döngüsü
2. **while** döngüsü
3. **do-while** döngüsü
4. **for-each (enhanced for loop)**

Bu döngülerle birlikte **`break` ve `continue`** gibi kontrol ifadeleri kullanılarak döngü akışı yönetilebilir.

---

## **1. `for` Döngüsü**
`for` döngüsü, **tekrar sayısı bilinen işlemleri** yapmak için kullanılır. **Döngü çalıştırılmadan önce, koşul ve artış/azalış değerleri belirlenir.**

**Yapısı:**
```java
for (başlangıç_değeri; koşul; artırma/azaltma) {
    // Döngü bloğu
}
```

### **Örnek 1: 1'den 5'e kadar yazdırma**
```java
public class ForLoopExample {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            System.out.println("i: " + i);
        }
    }
}
```
**Çıktı:**
```
i: 1
i: 2
i: 3
i: 4
i: 5
```
- `i = 1` olarak başlar.
- `i <= 5` olduğu sürece çalışır.
- Her iterasyonda `i++` ile `i` artırılır.

---

### **Örnek 2: Çift Sayıları Yazdırma**
```java
public class EvenNumbers {
    public static void main(String[] args) {
        for (int i = 2; i <= 10; i += 2) {
            System.out.println("Çift sayı: " + i);
        }
    }
}
```
**Çıktı:**
```
Çift sayı: 2
Çift sayı: 4
Çift sayı: 6
Çift sayı: 8
Çift sayı: 10
```
- `i = 2` olarak başlar.
- `i <= 10` olduğu sürece çalışır.
- `i += 2` ile her turda `i` **2 artırılır**.

---

## **2. `while` Döngüsü**
`while`, **koşul sağlandığı sürece** çalışan bir döngüdür. Kaç kere çalışacağı **önceden bilinmeyen** durumlar için kullanılır.

**Yapısı:**
```java
while (koşul) {
    // Döngü bloğu
}
```

### **Örnek 3: `while` ile Sayı Yazdırma**
```java
public class WhileLoopExample {
    public static void main(String[] args) {
        int i = 1;
        
        while (i <= 5) {
            System.out.println("i: " + i);
            i++; // i artırılıyor, yoksa sonsuz döngü olur.
        }
    }
}
```
**Çıktı:**
```
i: 1
i: 2
i: 3
i: 4
i: 5
```
- **İlk olarak `i = 1`**.
- **Koşul `i <= 5` sağlandıkça çalışır**.
- **Her iterasyonda `i++` artırılır**.

---

### **Örnek 4: `while` ile Kullanıcıdan Veri Alma**
```java
import java.util.Scanner;

public class WhileUserInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sayi;

        System.out.println("5 girene kadar sayı girin:");

        while (true) {  // Sonsuz döngü
            sayi = scanner.nextInt();
            if (sayi == 5) {
                System.out.println("Döngü sonlandı.");
                break; // 5 girildiğinde döngü kırılır.
            }
        }
    }
}
```
**Örnek Giriş/Çıkış:**
```
5 girene kadar sayı girin:
1
2
3
5
Döngü sonlandı.
```
- **Kullanıcı 5 girene kadar veri girer**.
- **5 girildiğinde `break;` ile döngü sona erer**.

---

## **3. `do-while` Döngüsü**
`do-while`, **önce döngü çalıştırılır, sonra koşul kontrol edilir**. **Koşul yanlış olsa bile en az bir kere çalışır.**

**Yapısı:**
```java
do {
    // Döngü bloğu
} while (koşul);
```

### **Örnek 5: `do-while` ile Kullanıcıdan Şifre Alma**
```java
import java.util.Scanner;

public class DoWhileExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sifre;

        do {
            System.out.print("Şifreyi girin (1234): ");
            sifre = scanner.nextInt();
        } while (sifre != 1234);

        System.out.println("Giriş başarılı!");
    }
}
```
**Örnek Giriş/Çıkış:**
```
Şifreyi girin (1234): 1111
Şifreyi girin (1234): 2222
Şifreyi girin (1234): 1234
Giriş başarılı!
```
- **Şifre doğru girilene kadar tekrar eder**.
- **En az bir kez çalışır, çünkü `do` bloğu önce çalışır**.

---

## **4. `for-each` Döngüsü**
`for-each`, **dizi ve koleksiyonları (Array, List, Set, vs.)** daha kolay gezmek için kullanılır.

**Yapısı:**
```java
for (VeriTipi eleman : Dizi/Koleksiyon) {
    // Döngü bloğu
}
```

### **Örnek 6: `for-each` ile Dizi Elemanlarını Yazdırma**
```java
public class ForEachExample {
    public static void main(String[] args) {
        int[] sayilar = {10, 20, 30, 40, 50};

        for (int sayi : sayilar) {
            System.out.println("Sayı: " + sayi);
        }
    }
}
```
**Çıktı:**
```
Sayı: 10
Sayı: 20
Sayı: 30
Sayı: 40
Sayı: 50
```
- **`for-each`, `for` döngüsüne göre daha okunaklıdır**.
- **Diziler, List'ler ve Set'ler üzerinde gezinmek için idealdir**.

---

## **5. Döngülerde `break` ve `continue` Kullanımı**
### **`break`: Döngüyü tamamen sonlandırır.**
### **`continue`: Mevcut iterasyonu atlar, sonraki tura geçer.**

### **Örnek 7: `break` ile Döngüyü Sonlandırma**
```java
public class BreakExample {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            if (i == 5) {
                break; // 5 olduğunda döngü sona erer.
            }
            System.out.println("i: " + i);
        }
    }
}
```
**Çıktı:**
```
i: 1
i: 2
i: 3
i: 4
```

### **Örnek 8: `continue` ile Atlatma**
```java
public class ContinueExample {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            if (i == 3) {
                continue; // 3'ü atla
            }
            System.out.println("i: " + i);
        }
    }
}
```
**Çıktı:**
```
i: 1
i: 2
i: 4
i: 5
```

---

## **Özet**
| Döngü Türü | Kullanım Amacı |
|------------|---------------|
| `for` | Sabit sayıda tekrar eder. |
| `while` | Koşul sağlandığı sürece tekrar eder. |
| `do-while` | En az bir kez çalışır, sonra koşulu kontrol eder. |
| `for-each` | Dizileri ve koleksiyonları gezmek için kullanılır. |


## for ile while arasındaki fark ?
```sh 

```

Java'da `for` ve `while` döngüleri, tekrar eden işlemleri gerçekleştirmek için kullanılır. Ancak kullanım amaçları ve çalışma mantıkları açısından farklılıklar gösterir. İşte temel farklar:

---

## **1. Temel Farklar**
| **Özellik**         | **for Döngüsü** | **while Döngüsü** |
|---------------------|----------------|------------------|
| **Kullanım Amacı**  | Döngü sayısı belli olduğunda kullanılır. | Döngü sayısı belirsizse veya koşula bağlı devam edecekse kullanılır. |
| **Sözdizimi**       | Daha düzenli ve kompakt bir yapıya sahiptir. | Daha esnek ve koşul odaklıdır. |
| **Koşulun Yeri**    | Başlangıçta tanımlanır (`for` içinde). | Döngü başında veya döngü içinde değiştirilebilir. |
| **Sayaç Kullanımı** | Sayaç değişkeni döngünün başında tanımlanır. | Sayaç dışarıda tanımlanıp döngü içinde artırılabilir. |
| **Okunabilirlik**   | Daha kısa ve düzenlidir. | Daha esnektir ama bazen karışık olabilir. |
| **Performans**      | Aynıdır, ancak uygun kullanıma bağlı olarak optimize edilebilir. |

---

## **2. Sözdizimi ve Kullanım Örnekleri**

### **2.1. `for` Döngüsü**
- Sayaç ile çalışan döngüler için uygundur.
- Başlangıç, koşul ve artış aynı satırda belirtilir.

```java
for (int i = 0; i < 5; i++) {
    System.out.println("i değeri: " + i);
}
```
✅ **Avantajı**: Döngü değişkeni (`i`) döngü içinde tanımlandığı için **lokal kalır** ve kod daha okunaklıdır.

---

### **2.2. `while` Döngüsü**
- Koşul sağlandığı sürece çalışır, **döngü sayısı belirsizse** tercih edilir.
- Döngü değişkeni genellikle dışarıda tanımlanır.

```java
int i = 0;
while (i < 5) {
    System.out.println("i değeri: " + i);
    i++;
}
```
✅ **Avantajı**: **Esnektir**, koşul başka bir yerden değiştirilebilir.

⚠️ **Dikkat!** Sayaç unutulursa **sonsuz döngüye girme riski vardır.**

---

## **3. Döngü Kullanım Senaryoları**

| **Durum** | **for** | **while** |
|----------|--------|---------|
| Döngü sayısı belli mi? | ✅ **Evet** | ❌ Hayır |
| Sayaç değişkeni kullanılacak mı? | ✅ Evet | ❌ Hayır |
| Kullanım kompakt olsun mu? | ✅ Evet | ❌ Hayır |
| Koşul döngü içinde değişebilir mi? | ❌ Hayır | ✅ Evet |
| Sonsuz döngüye girme ihtimali var mı? | ❌ Daha az | ✅ Daha fazla |

---

## **4. Özel Durum: `do-while` Döngüsü**
- `while` döngüsüne benzer, ancak **koşul en sonda kontrol edilir**.
- **Döngü en az bir kez çalışır**.

```java
int i = 0;
do {
    System.out.println("i değeri: " + i);
    i++;
} while (i < 5);
```
✅ **Avantajı**: Kullanıcıdan giriş alırken veya en az bir kez çalışması gereken işlemlerde idealdir.

---

### **Sonuç**
- **`for` döngüsü**, **belli sayıda tekrar** gerektiren durumlar için idealdir.
- **`while` döngüsü**, **koşula bağlı çalışması gereken** işlemler için uygundur.
- **`do-while` döngüsü**, en az bir kez çalışması **garanti olan** durumlar için kullanılır.

**Hangi döngüyü kullanacağınız, ihtiyacınıza bağlıdır!** 🚀


## Java String Pool Mantığı
```sh 

```
---

Hayır, **`String kelime = "";`** yazıldığında arka planda **`new String()` çağrılmıyor**. Bunun nedeni **Java'nın String Constant Pool (String Havuzu) mekanizmasını kullanmasıdır**.

---

## **1. Java String Pool Mantığı**
- **`String kelime = "";`** yazıldığında, `"Merhaba"` gibi sabit (`literal`) stringler **String Constant Pool** içinde saklanır.
- Eğer havuzda **aynı değerli bir `String` zaten varsa**, yeni bir nesne oluşturulmaz, mevcut olan nesneye referans verilir.
- **Bu, bellek optimizasyonu sağlar** ve `new String()` kullanımına göre daha verimli çalışır.

### **Örnek ve Açıklama**
```java
String kelime1 = "Merhaba"; // String Pool içinde saklanır
String kelime2 = "Merhaba"; // Aynı referansı kullanır (Yeni nesne oluşturmaz)

System.out.println(kelime1 == kelime2); // true (Aynı nesneyi işaret ediyorlar)
```
Burada `"Merhaba"` değeri **ilk kez kullanıldığı için String Pool'a eklenir** ve `kelime2` de aynı nesneyi referans alır.

---

## **2. `new String()` Kullanınca Ne Olur?**
Eğer **`new String("Merhaba")`** kullanırsak:
- **Heap içinde her seferinde yeni bir `String` nesnesi oluşturulur**.
- **String Pool kullanılmaz**, bu yüzden aynı değere sahip olsa bile farklı nesneler oluşturulabilir.

```java
String kelime1 = new String("Merhaba");
String kelime2 = "Merhaba";

System.out.println(kelime1 == kelime2); // false (Farklı nesneler)
System.out.println(kelime1.equals(kelime2)); // true (İçerikler aynı)
```
- **`==` operatörü bellek adreslerini karşılaştırdığı için false döndürür.**
- **`equals()` ise içerik bazlı karşılaştırma yaptığı için true döndürür.**

---

## **3. `intern()` Metodu ile String Pool Kullanımı**
Eğer `new String("Merhaba")` ile oluşturulmuş bir nesneyi **String Pool'a dahil etmek istersek**, `.intern()` metodunu kullanabiliriz.

```java
String kelime1 = new String("Merhaba").intern();
String kelime2 = "Merhaba";

System.out.println(kelime1 == kelime2); // true (Aynı pool içindeki nesneye referans verir)
```
- `.intern()` metodu, **havuzda (String Pool) aynı değere sahip bir `String` varsa onu kullanır, yoksa ekler**.

---

## **4. Özet ve Sonuç**
| **Kod** | **Arka Planda Ne Oluyor?** | **Bellek Kullanımı** |
|---------|---------------------------|----------------------|
| `String kelime = "";` | String Pool kullanıyor, **yeni nesne oluşturmuyor**. | **Hafızada verimli** |
| `String kelime = new String("");` | Heap’te **yeni nesne oluşturuyor**, String Pool kullanılmıyor. | **Gereksiz bellek tüketimi** |
| `String kelime = new String("").intern();` | String Pool’a ekleniyor ve havuzdaki nesne kullanılıyor. | **Hafızada optimize edilir** |

✅ **En iyi kullanım genellikle `"..."` şeklinde literal kullanımıdır**.  
⚠️ **`new String("")` kullanımı gereksizdir ve kaçınılmalıdır.** 🚀

## String kelime= new String(); , String kelime= ";  iki yapı arasındaki fark ?
```sh 

```
---

Java'da `String` nesneleri iki farklı şekilde oluşturulabilir:

1. **`new String()` ile oluşturma**
2. **Doğrudan `""` (literal) ile oluşturma**

Bu iki yaklaşım arasındaki farkları inceleyelim.

---

## **1. `new String()` Kullanımı**
```java
String kelime1 = new String("Merhaba");
```
- **Heap bellekte yeni bir `String` nesnesi oluşturur.**
- **String pool'u kullanmaz**, her seferinde **yeni bir nesne oluşturılır**.
- Daha fazla bellek tüketebilir ve gereksiz nesne oluşturulmasına sebep olabilir.

---

## **2. `String` Literal Kullanımı**
```java
String kelime2 = "Merhaba";
```
- **String pool (havuz) içinde saklanır**, yani **eğer aynı string daha önce oluşturulmuşsa tekrar kullanılabilir**.
- Daha **hafızada daha verimli** çalışır.
- JVM, aynı değere sahip `String` nesnelerini tekrar tekrar oluşturmamak için **String Constant Pool** mekanizmasını kullanır.

---

## **3. Bellek Yönetimi Farkı**
### **Heap vs. String Pool**
| **Yöntem** | **Nerede Saklanır?** | **Yeni Nesne Oluşur mu?** | **Performans** |
|-----------|-----------------|------------------|------------|
| `new String("Merhaba")` | Heap (Her seferinde yeni nesne) | **Evet** | Daha yavaş |
| `"Merhaba"` (Literal) | **String Pool** | **Hayır (Havuzda varsa)** | Daha hızlı |

---

## **4. Karşılaştırma (`==` vs. `equals()`)**
- `==` **referansları** karşılaştırır.
- `equals()` **içeriği (değerleri)** karşılaştırır.

Örnek:
```java
String str1 = new String("Merhaba");
String str2 = "Merhaba";

System.out.println(str1 == str2); // false (Farklı nesneler)
System.out.println(str1.equals(str2)); // true (İçerik aynı)

String str3 = "Merhaba";
System.out.println(str2 == str3); // true (Aynı String Pool'u kullanıyorlar)
```
- `str1` heap’te yeni bir nesnedir, `str2` ve `str3` ise **aynı pool içinde paylaşılır**.

---

## **5. Ne Zaman Hangi Yöntemi Kullanmalıyız?**
| **Senaryo** | **Önerilen Yöntem** |
|------------|------------------|
| **Genellikle string kullanımı** | `"Merhaba"` (**String pool kullanımı daha verimli**) |
| **Mutable (değiştirilebilir) string gerekiyorsa** | `StringBuilder` veya `StringBuffer` |
| **Farklı bellek alanlarında `String` nesneleri oluşturmak gerekiyorsa** | `new String("Merhaba")` |

✅ **Genellikle `"String"` literal kullanımı tercih edilir çünkü String Pool belleği optimize eder.**  
⚠️ **`new String()` gereksiz bellek kullanımına yol açabilir ve önerilmez.** 🚀


## java Stringte vocabulary1== vocabulary2 ve vocabulary1.equals(vocabulary2) aradaki fark nelerdir ?
```sh 

```
---

Java'da `==` operatörü ve `.equals()` metodu, `String` nesnelerini karşılaştırırken farklı çalışır. **Bu farkı anlamak için öncelikle Java'daki bellek yönetimi ve `String` nesnelerinin nasıl saklandığını bilmek gerekir.**

---

## **1. `==` Operatörü ile Karşılaştırma (Referans Karşılaştırması)**
`==` operatörü, **iki nesnenin bellek adreslerini (referanslarını) karşılaştırır**.  
**Yani iki `String` nesnesinin aynı nesne olup olmadığını kontrol eder.**

### **Örnek 1: String Literal Kullanımı (`==` ile Karşılaştırma)**
```java
String vocabulary1 = "Merhaba";
String vocabulary2 = "Merhaba";

System.out.println(vocabulary1 == vocabulary2); // true (Aynı referansı kullanıyorlar)
```
🔹 **Neden?**
- `"Merhaba"` değeri **String Pool (Havuz)** içinde saklanır.
- `vocabulary1` ve `vocabulary2` **aynı nesneyi işaret eder**, dolayısıyla `==` operatörü `true` döndürür.

---

### **Örnek 2: `new String()` Kullanımı (`==` ile Karşılaştırma)**
```java
String vocabulary1 = new String("Merhaba");
String vocabulary2 = new String("Merhaba");

System.out.println(vocabulary1 == vocabulary2); // false (Farklı nesneler)
```
🔹 **Neden?**
- `new String("Merhaba")` her çağrıldığında **Heap Bellek** içinde yeni bir `String` nesnesi oluşturur.
- İki `String` nesnesi **farklı bellek adreslerine** sahip olur, bu yüzden `==` **false döndürür**.

---

## **2. `.equals()` Metodu ile Karşılaştırma (İçerik Karşılaştırması)**
`.equals()` metodu, **String nesnelerinin içeriğini (değerini) karşılaştırır**.

### **Örnek 3: `equals()` ile İçerik Karşılaştırma**
```java
String vocabulary1 = new String("Merhaba");
String vocabulary2 = new String("Merhaba");

System.out.println(vocabulary1.equals(vocabulary2)); // true (İçerikler aynı)
```
✅ `.equals()` kullanıldığında, `String` nesnelerinin **içeriği karşılaştırılır**.  
Bu yüzden `"Merhaba".equals("Merhaba")` sonucu **true** olur.

---

## **3. `intern()` ile `String` Havuzuna Ekleme**
Eğer `new String()` ile oluşturulan bir `String` nesnesini **String Pool'a** eklemek istiyorsanız `.intern()` metodunu kullanabilirsiniz:

```java
String vocabulary1 = new String("Merhaba").intern();
String vocabulary2 = "Merhaba";

System.out.println(vocabulary1 == vocabulary2); // true (İkisi de String Pool'da)
```
- `.intern()` metodu, **String Pool'daki nesneyi referans olarak kullanır**.
- `==` karşılaştırması **true** döner.

---

## **4. Özet: `==` ve `.equals()` Arasındaki Farklar**
| **Karşılaştırma** | **== (Referans Karşılaştırması)** | **.equals() (İçerik Karşılaştırması)** |
|------------------|--------------------------------|--------------------------------|
| **Karşılaştırma Türü** | **Bellek adreslerini karşılaştırır** | **İçeriği (değeri) karşılaştırır** |
| **String Pool Kullanımı** | **String Pool kullanıyorsa `true`, yoksa `false`** | **Her zaman içerik karşılaştırması yapar, Pool önemli değil** |
| **`new String("...")` Kullanılırsa** | **Heap’te yeni nesne oluşturduğu için `false` döner** | **İçerik aynıysa `true` döner** |
| **Önerilen Kullanım** | **Bellek adresi karşılaştırmak için kullanılır** | **Genellikle String karşılaştırmaları için kullanılır (Doğru kullanım)** |

✅ **Genellikle `equals()` metodu tercih edilmelidir**, çünkü `"Merhaba" == "Merhaba"` her zaman **doğru olmayabilir**. 🚀




## String Birleştirme (Concatenation) türleri, Concat, StrinBuilder, StringBuffer
```sh 

```
---
Java'da **String birleştirme (Concatenation)** için farklı yöntemler vardır. Bunlar arasında **`+` operatörü**, **`concat()` metodu**, **`StringBuilder`**, ve **`StringBuffer`** gibi seçenekler bulunur. Bunların arasındaki farkları performans, işleyiş ve kullanım açısından inceleyelim.

---

## **1. String Birleştirme Yöntemleri**
| **Yöntem**        | **Açıklama** | **Thread-Safe** | **Hız** | **Mutability (Değiştirilebilirlik)** |
|------------------|------------|--------------|--------|----------------|
| `+` Operatörü   | Kolay kullanım, arka planda `StringBuilder` kullanır. | ❌ Hayır | Orta | ❌ Değişmez (Immutable) |
| `concat()`      | `String` nesnesi ile birleşim sağlar. | ❌ Hayır | Orta | ❌ Değişmez |
| `StringBuilder` | Yüksek performanslı, thread-safe değil. | ❌ Hayır | **Hızlı** | ✅ Değiştirilebilir (Mutable) |
| `StringBuffer`  | Thread-safe, ancak `StringBuilder`'dan yavaş. | ✅ Evet | Yavaş | ✅ Değiştirilebilir |

---

## **2. String Birleştirme Yöntemlerinin Detayları**

### **2.1 `+` Operatörü ile Birleştirme**
- **Basit ve anlaşılırdır**, ancak performans olarak düşük olabilir çünkü **her yeni birleştirmede yeni bir `String` nesnesi oluşturur**.

```java
String str1 = "Merhaba";
String str2 = " Dünya";
String sonuc = str1 + str2;
System.out.println(sonuc); // "Merhaba Dünya"
```
🔴 **Dezavantaj:** `+` operatörü, her birleşimde **yeni bir `String` nesnesi oluşturur** ve eski nesne çöp toplama tarafından temizlenir. Büyük döngülerde performans kaybına yol açar.

---

### **2.2 `concat()` Metodu ile Birleştirme**
- `String` sınıfına ait olup, **`+` operatörüne alternatif** olarak kullanılır.
- **Yeni bir `String` nesnesi oluşturur**, orijinal `String` değişmez (`immutable`).

```java
String str1 = "Merhaba";
String str2 = " Dünya";
String sonuc = str1.concat(str2);
System.out.println(sonuc); // "Merhaba Dünya"
```
🔴 **Dezavantaj:** `+` operatöründen farkı yoktur, çünkü yine **yeni bir `String` nesnesi oluşturur**.

---

### **2.3 `StringBuilder` ile Birleştirme (Tercih Edilen Yöntem)**
- **Performans açısından en iyi yöntemdir** çünkü `StringBuilder`, değiştirilebilir (`mutable`) bir nesnedir.
- **Thread-safe değildir** (yani aynı anda birden fazla thread çalışırken güvenli değildir).

```java
StringBuilder sb = new StringBuilder("Merhaba");
sb.append(" Dünya");
System.out.println(sb.toString()); // "Merhaba Dünya"
```
✅ **Avantajlar:**
- `+` veya `concat()` gibi **yeni `String` nesnesi oluşturmaz**.
- Hafızada **aynı nesne üzerinde değişiklik** yaparak **daha hızlı çalışır**.

---

### **2.4 `StringBuffer` ile Birleştirme**
- `StringBuilder` ile neredeyse aynıdır, ancak **thread-safe** olması için `synchronized` kullanır.
- **Eş zamanlı işlemlerde (multithreading) tercih edilir**, ancak `StringBuilder`'dan **daha yavaştır**.

```java
StringBuffer sbf = new StringBuffer("Merhaba");
sbf.append(" Dünya");
System.out.println(sbf.toString()); // "Merhaba Dünya"
```
✅ **Avantajı:** Çoklu thread kullanımında güvenlidir.  
🔴 **Dezavantajı:** `StringBuilder`'dan daha yavaştır.

---

## **3. Performans Testi**
Şimdi, büyük bir string birleştirme işlemi için `+`, `StringBuilder` ve `StringBuffer` arasındaki performans farklarını test edelim.

### **Performans Testi Sonuçları (100.000 Karakter Birleştirme)**:
- **`+` Operatörü Süresi**: ≈ **0.3561 saniye** (Yavaş)
- **`StringBuilder` Süresi**: ≈ **0.0086 saniye** (Hızlı)
- **`StringBuffer` Süresi**: ≈ **0.0081 saniye** (Hızlı, ancak thread-safe)

---

## **4. Hangisini Kullanmalıyız?**
| **Senaryo** | **Önerilen Yöntem** |
|------------|------------------|
| Küçük ölçekli string birleştirme | `+` operatörü veya `concat()` |
| **Büyük veri işlemleri veya döngü içinde string birleştirme** | **`StringBuilder`** (Hızlı ve verimli) |
| **Çoklu thread ortamı (Multithreading)** | **`StringBuffer`** (Thread-safe) |

🔹 **Küçük işlemlerde `+` kullanabilirsiniz** ama **büyük döngülerde kesinlikle `StringBuilder` kullanmalısınız!** 🚀


## break, return, continue
```sh 

```
---
### **Java'da `break`, `return` ve `continue` Nedir?**
Bu üç anahtar kelime, akış kontrolüyle ilgilidir ve döngüler, metotlar ve koşullu ifadeler gibi yapılarda kullanılır. Her birinin nasıl çalıştığını detaylı örneklerle açıklayalım.

---

## **1. `break` Anahtar Kelimesi**
`break`, genellikle **döngülerin kırılması (sonlandırılması)** için kullanılır. **`switch-case`** yapılarında da kullanılır.

**Çalışma Mantığı:**
- `break` çağrıldığı anda **ilgili döngüyü tamamen durdurur**.
- İç içe döngülerde kullanıldığında, yalnızca **bulunduğu döngüyü kırar**.

### **Örnek 1: Döngüyü Kırma**
```java
public class BreakExample {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            if (i == 5) {
                System.out.println("Döngü 5'e ulaştı ve durduruldu.");
                break; // Döngü burada sona erer.
            }
            System.out.println("i: " + i);
        }
    }
}
```
**Çıktı:**
```
i: 1
i: 2
i: 3
i: 4
Döngü 5'e ulaştı ve durduruldu.
```
- `i == 5` olduğunda `break` çalışır ve döngü tamamen sona erer.

### **Örnek 2: İç İçe Döngülerde `break` Kullanımı**
```java
public class NestedBreakExample {
    public static void main(String[] args) {
        for (int i = 1; i <= 3; i++) {
            for (int j = 1; j <= 3; j++) {
                if (j == 2) {
                    break; // Sadece iç döngüyü kırar
                }
                System.out.println("i: " + i + ", j: " + j);
            }
        }
    }
}
```
**Çıktı:**
```
i: 1, j: 1
i: 2, j: 1
i: 3, j: 1
```
- `j == 2` olduğunda iç döngü sona erer, ancak dış döngü devam eder.

---

## **2. `return` Anahtar Kelimesi**
`return` ifadesi, bir metottan değer döndürmek veya metodu tamamen sonlandırmak için kullanılır.

**Çalışma Mantığı:**
- Eğer bir metodun dönüş tipi **`void`** ise, `return;` metodu **erken sonlandırır**.
- Eğer metodun dönüş tipi bir değer içeriyorsa (**int, String, boolean, vs.**), `return` ile bir değer döndürmek zorunludur.

### **Örnek 1: `return` ile Metodu Sonlandırma**
```java
public class ReturnExample {
    public static void main(String[] args) {
        System.out.println("Metot çağrılıyor...");
        testMetot();
        System.out.println("Bu satır çalışmaz çünkü metot return ile durduruldu.");
    }

    public static void testMetot() {
        System.out.println("Metot başladı.");
        return;  // Metot burada sona erer.
        // System.out.println("Bu satır asla çalışmaz."); // Hata verir
    }
}
```
**Çıktı:**
```
Metot çağrılıyor...
Metot başladı.
```
- `return;` çağrıldığı anda metot sona erer.

### **Örnek 2: `return` ile Değer Döndürme**
```java
public class SumExample {
    public static void main(String[] args) {
        int result = toplama(5, 10);
        System.out.println("Toplam: " + result);
    }

    public static int toplama(int a, int b) {
        return a + b; // a + b değerini döndürür.
    }
}
```
**Çıktı:**
```
Toplam: 15
```
- `return a + b;` ile metot, toplama işleminin sonucunu döndürür.

---

## **3. `continue` Anahtar Kelimesi**
`continue`, döngü içindeki mevcut yinelemeyi atlayarak bir sonraki tura geçmek için kullanılır. **Döngüyü kırmaz**, yalnızca **belirtilen koşulda o adımı atlar**.

**Çalışma Mantığı:**
- `continue` çağrıldığında, döngünün geri kalan kodları çalıştırılmaz ve **bir sonraki iterasyona geçilir**.
- Genellikle **belirli bir durumu atlamak** için kullanılır.

### **Örnek 1: Tek Sayıları Atlamak**
```java
public class ContinueExample {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            if (i % 2 != 0) { // Tek sayılar için
                continue; // Döngüde kalan işlemleri atla ve bir sonraki adıma geç.
            }
            System.out.println("Çift sayı: " + i);
        }
    }
}
```
**Çıktı:**
```
Çift sayı: 2
Çift sayı: 4
Çift sayı: 6
Çift sayı: 8
Çift sayı: 10
```
- `i` tek sayı olduğunda `continue` çalışır ve o iterasyonun geri kalan kısmı atlanır.

### **Örnek 2: İç İçe Döngülerde `continue` Kullanımı**
```java
public class NestedContinueExample {
    public static void main(String[] args) {
        for (int i = 1; i <= 3; i++) {
            for (int j = 1; j <= 3; j++) {
                if (j == 2) {
                    continue; // `j == 2` olduğunda iç döngünün bu iterasyonu atlanır.
                }
                System.out.println("i: " + i + ", j: " + j);
            }
        }
    }
}
```
**Çıktı:**
```
i: 1, j: 1
i: 1, j: 3
i: 2, j: 1
i: 2, j: 3
i: 3, j: 1
i: 3, j: 3
```
- `j == 2` olduğunda `continue` çalışır ve o adımdaki işlemleri atlar.

---

## **Sonuç Karşılaştırması**
| Anahtar Kelime | Kullanım Alanı | Etkisi |
|---------------|---------------|--------|
| `break` | Döngüleri ve `switch` bloklarını kırmak için | Döngü tamamen sona erer. |
| `return` | Metotlardan çıkış yapmak için | Metodu bitirir ve değer döndürür. |
| `continue` | Döngü içinde belirli bir iterasyonu atlamak için | O iterasyonu atlar, döngü devam eder. |


## String
```sh 

```
---
# **Java'da String Nedir? (Detaylı Açıklama)**

### **📌 String Nedir?**
Java'da **`String`** bir **karakter dizisi** (text verisi) saklamak için kullanılan **sınıf (class)** türüdür. **Java’da `String`, ilkel (primitive) bir veri tipi değildir**, aksine **`java.lang.String` sınıfına** ait bir **nesnedir**.

- **Immutable (değiştirilemez)** bir yapıya sahiptir.
- **Heap** üzerinde oluşturulur ve **String Pool (Havuz)** kullanılarak yönetilir.
- `+` operatörü ile birleştirme (concatenation) yapılabilir.
- **`equals()` ve `==` farkı** gibi önemli detayları vardır.

---

## **📌 1. String Tanımlama Yöntemleri**
Java’da `String` oluşturmanın **iki farklı yolu** vardır:

### **1️⃣ String Havuzu (`String Pool`) ile Tanımlama**
```java
String str1 = "Merhaba"; // String literal ile oluşturuldu
String str2 = "Merhaba";
```
- `"Merhaba"` **String Pool’a eklenir**.
- **Aynı String değerini tekrar oluşturduğumuzda, hafızada yeni bir nesne oluşturulmaz**, aynı referansa atanır.
- **Bellek kullanımını optimize eder**.

---

### **2️⃣ `new` Operatörü ile Tanımlama**
```java
String str3 = new String("Merhaba");
String str4 = new String("Merhaba");
```
- **Her seferinde yeni bir nesne oluşturur** (Heap içinde).
- **Fazladan bellek harcar**, çünkü `new` ile oluşturulan `String` nesneleri `String Pool` kullanmaz.

📌 **Karşılaştırma:**
```java
System.out.println(str1 == str2); // true (Aynı referans)
System.out.println(str3 == str4); // false (Farklı nesneler)
System.out.println(str1.equals(str3)); // true (İçerik karşılaştırması)
```

---

## **📌 2. String Metotları**
Java'nın `String` sınıfı **zengin bir metot koleksiyonuna sahiptir**. Bunları detaylıca inceleyelim.

### **✅ 2.1 Uzunluk Öğrenme - `length()`**
```java
String text = "Java Programlama";
System.out.println(text.length()); // 17
```

---

### **✅ 2.2 Karakter Erişimi - `charAt(index)`**
```java
String text = "Java";
System.out.println(text.charAt(0)); // J
System.out.println(text.charAt(2)); // v
```

---

### **✅ 2.3 Parça Alma (Substring) - `substring()`**
```java
String text = "Merhaba Dünya";
System.out.println(text.substring(8)); // "Dünya"
System.out.println(text.substring(0, 7)); // "Merhaba"
```

---

### **✅ 2.4 Küçük ve Büyük Harfe Çevirme - `toUpperCase()` & `toLowerCase()`**
```java
String text = "Java";
System.out.println(text.toUpperCase()); // "JAVA"
System.out.println(text.toLowerCase()); // "java"
```

---

### **✅ 2.5 String Karşılaştırma - `equals()` ve `equalsIgnoreCase()`**
```java
String a = "Java";
String b = "java";

System.out.println(a.equals(b)); // false
System.out.println(a.equalsIgnoreCase(b)); // true
```
📌 **Neden `==` kullanılmamalı?**
- `==`, **referansları** karşılaştırır.
- `equals()` ise **içeriği** karşılaştırır.

---

### **✅ 2.6 String İçerik Kontrolleri**
#### **`contains()` → İçinde geçiyor mu?**
```java
String text = "Java öğrenmek çok eğlenceli!";
System.out.println(text.contains("Java")); // true
System.out.println(text.contains("Python")); // false
```

#### **`startsWith()` & `endsWith()` → Başlangıç ve Bitiş Kontrolü**
```java
String text = "Merhaba Dünya";
System.out.println(text.startsWith("Merhaba")); // true
System.out.println(text.endsWith("Dünya")); // true
```

---

### **✅ 2.7 String Parçalama - `split()`**
```java
String metin = "Java,Python,C++";
String[] diller = metin.split(",");

for (String dil : diller) {
    System.out.println(dil);
}
```
**Çıktı:**
```
Java
Python
C++
```

---

### **✅ 2.8 `trim()` - Boşlukları Kaldırma**
```java
String text = "   Java   ";
System.out.println(text.trim()); // "Java"
```

---

### **✅ 2.9 Değiştirme - `replace()` ve `replaceAll()`**
```java
String text = "Java kolaydır";
System.out.println(text.replace("kolay", "harika")); // "Java harikadır"
```

---

## **📌 3. String Birleştirme (Concatenation)**
### **1️⃣ `+` Operatörü ile**
```java
String s1 = "Merhaba";
String s2 = " Dünya";
String sonuc = s1 + s2;
System.out.println(sonuc); // "Merhaba Dünya"
```

### **2️⃣ `concat()` Metodu ile**
```java
String s1 = "Java";
String s2 = " Programlama";
System.out.println(s1.concat(s2)); // "Java Programlama"
```

---

## **📌 4. `StringBuilder` ve `StringBuffer`**
📌 **`String` nesneleri değiştirilemez (immutable) olduğu için, çok fazla işlem yapıldığında `StringBuilder` veya `StringBuffer` kullanmak daha verimlidir.**

### **1️⃣ `StringBuilder` (Daha Hızlı)**
```java
StringBuilder sb = new StringBuilder("Java");
sb.append(" Programlama");
System.out.println(sb); // "Java Programlama"
```

### **2️⃣ `StringBuffer` (Thread-Safe)**
```java
StringBuffer sb = new StringBuffer("Java");
sb.append(" Öğreniyorum");
System.out.println(sb); // "Java Öğreniyorum"
```

| **Özellik**  | **String** | **StringBuilder** | **StringBuffer** |
|-------------|------------|----------------|----------------|
| **Değiştirilebilir mi?** | ❌ Hayır | ✅ Evet | ✅ Evet |
| **Hızlı mı?** | 🚀 Yavaş | ⚡ Hızlı | 🔒 Daha yavaş (Thread-safe) |
| **Thread-Safe mi?** | ❌ Hayır | ❌ Hayır | ✅ Evet |

---

## **📌 5. String ile `==` ve `equals()` Farkı**
```java
String str1 = "Java";
String str2 = new String("Java");

System.out.println(str1 == str2); // false (Farklı referanslar)
System.out.println(str1.equals(str2)); // true (Aynı içerik)
```
📌 **Özetle:**
- **`==`**, hafızadaki referansları karşılaştırır.
- **`equals()`**, içeriği karşılaştırır.

---

## **📌 6. String Pool ve Bellek Yönetimi**
**String Pool**, `String` nesnelerinin tekrar kullanılmasını sağlayarak **bellek optimizasyonu** yapar.

```java
String str1 = "Hello";
String str2 = "Hello";
System.out.println(str1 == str2); // true (Aynı referans)
```
Ama:
```java
String str3 = new String("Hello");
System.out.println(str1 == str3); // false (Yeni nesne)
```

---

## **📌 Sonuç**
- **`String` immutable’dır, değiştirilemez.**
- **Karşılaştırma için `equals()` kullanılır.**
- **Çok fazla işlem yapılacaksa `StringBuilder` tercih edilmelidir.**
- **Bellek yönetimi için `String Pool` mekanizması vardır.**

🚀 **String’leri etkili kullanmak, Java programlarının performansını artırabilir!** 🚀


## switch-case ile if-elseif-else arasındaki farklar nelerdir
```sh 

```
Java'da `switch-case` ve `if-else if` yapıları, akış kontrolü sağlamak için kullanılır ancak bazı temel farklara sahiptir:

### 1. **Kullanım Alanı**:
- **`if-else if` Yapısı**: Mantıksal karşılaştırmaların, aralıkların ve karmaşık koşulların değerlendirilmesi için daha esnektir. Her türlü karşılaştırmayı kullanabilirsiniz.
- **`switch-case` Yapısı**: Genellikle bir değişkenin belirli sabit değerlerle eşleşmesini kontrol etmek için kullanılır. Daha okunaklı ve performanslı olabilir.

### 2. **Desteklenen Değerler**:
- **`if-else if`**: Tüm karşılaştırmaları destekler (`<`, `>`, `<=`, `>=`, `==`, `!=`, &&, || vb.).
- **`switch-case`**: Sadece belirli sabit değerlere (`int`, `char`, `String`, `enum`, vb.) göre çalışır.

### 3. **Performans**:
- **`if-else if`**: Koşullar sırasıyla kontrol edilir, uzun bir zincir varsa performans düşebilir.
- **`switch-case`**: Derleyici `switch` ifadelerini optimize edebilir ve "jump table" gibi mekanizmalar sayesinde daha hızlı çalışabilir.

### 4. **Okunabilirlik**:
- **`if-else if`**: Uzun koşullar içeren kodlar okunabilirliği zorlaştırabilir.
- **`switch-case`**: Daha düzenli ve okunaklı olabilir, özellikle sabit değerlerle çalışırken.

---

### **Örnek Kullanım**:
#### **1. `if-else if` ile Kullanım**
```java
int sayi = 5;

if (sayi > 0 && sayi <= 10) {
    System.out.println("Sayı 1 ile 10 arasında");
} else if (sayi > 10 && sayi <= 20) {
    System.out.println("Sayı 11 ile 20 arasında");
} else {
    System.out.println("Sayı 20’den büyük");
}
```
✅ **Avantaj**: Aralık bazlı kontroller için uygundur.

---

#### **2. `switch-case` ile Kullanım**
```java
int gun = 3;
switch (gun) {
    case 1:
        System.out.println("Pazartesi");
        break;
    case 2:
        System.out.println("Salı");
        break;
    case 3:
        System.out.println("Çarşamba");
        break;
    default:
        System.out.println("Geçersiz gün");
}
```
✅ **Avantaj**: Sabit değerlere göre işlem yaparken daha düzenli bir yapı sunar.

---

### **Ne Zaman Hangi Yapıyı Kullanmalıyız?**
| **Kriter**         | **if-else if** | **switch-case** |
|-------------------|---------------|----------------|
| **Koşul Karmaşıklığı** | Esnek (>, <, &&, ||) | Sabit değerlere göre çalışır |
| **Performans** | Daha yavaş olabilir | Daha hızlı olabilir |
| **Okunabilirlik** | Karmaşık olabilir | Daha düzenli |
| **Veri Türü** | Her türlü veriyle çalışır | Sadece belirli veri türlerini destekler (`int`, `char`, `String`, `enum`) |

Eğer **aralık bazlı ve karmaşık koşullar** söz konusuysa `if-else if`, eğer **sabit değerlere göre seçim yapılıyorsa** `switch-case` kullanmak en iyi seçimdir. 🚀


## switch-case ile if-elseif-else arasındaki hız faktöri
```sh 

```
Java'da `switch-case` ve `if-else if` yapılarının algoritmik analizi için **Big-O** karmaşıklıklarını ve çalışma mekanizmalarını inceleyelim.

---

## **1. Zaman Karmaşıklığı (Time Complexity)**
### **İf-Else If-Else**
```java
if (x == 1) {
    // İşlem 1
} else if (x == 2) {
    // İşlem 2
} else if (x == 3) {
    // İşlem 3
} else {
    // Varsayılan işlem
}
```
- **En iyi durum (Best Case) - O(1)**: Eğer ilk `if` koşulu doğruysa, yalnızca bir kontrol yapılır.
- **En kötü durum (Worst Case) - O(n)**: Tüm `if` blokları kontrol edildikten sonra `else` bloğuna ulaşılırsa **n adet karşılaştırma** yapılır.
- **Ortalama durum (Average Case) - O(n/2) ≈ O(n)**: Rastgele bir değerde ortalama olarak `n/2` karşılaştırma yapılır.

✅ **Sonuç**: `if-else if` yapısı **lineer zaman karmaşıklığına (O(n))** sahiptir.

---

### **Switch-Case**
```java
switch (x) {
    case 1:
        // İşlem 1
        break;
    case 2:
        // İşlem 2
        break;
    case 3:
        // İşlem 3
        break;
    default:
        // Varsayılan işlem
}
```
Switch-case’in algoritmik analizi derleyici tarafından nasıl optimize edildiğine bağlıdır:

1. **Jump Table Kullanımı (O(1))**
    - Eğer `case` ifadeleri **küçük ve sıralı tamsayılar (int, char, enum)** ise derleyici **jump table** oluşturur.
    - Jump table, doğrudan indeksleme yaparak ilgili case’e gider. Yani **sabit zamanda (O(1))** çalışır.

2. **Binary Search Kullanımı (O(log n))**
    - Eğer case değerleri **çok büyük, rastgele dağılmış veya sıralı değilse**, JVM genellikle **binary search** kullanır.
    - Binary search, **O(log n)** zaman karmaşıklığı sağlar.

✅ **Sonuç**:
- Eğer **jump table uygulanırsa → O(1)**
- Eğer **binary search uygulanırsa → O(log n)**
- Eğer **çok fazla case varsa ve fallback olarak lineer kontrol yapılırsa → O(n)** (çok nadir)

---

## **2. Uzay (Bellek) Karmaşıklığı (Space Complexity)**
| Yapı | Uzay Karmaşıklığı |
|------|------------------|
| **If-Else If** | O(1) (Yalnızca değişkenler için bellek kullanır) |
| **Switch-Case (Jump Table)** | O(n) (Tüm case değerlerini içeren bir tablo saklar) |
| **Switch-Case (Binary Search)** | O(1) (Ekstra bellek kullanmaz) |

- `if-else` yapısında ekstra bellek kullanılmaz.
- `switch-case` için **jump table yöntemi kullanılıyorsa**, tüm olası case değerleri için bir tablo tutulduğundan **O(n) bellek** kullanımı olabilir.

---

## **3. Karşılaştırmalı Tablo**
| **Özellik**  | **If-Else If** | **Switch-Case** |
|-------------|--------------|--------------|
| **Zaman Karmaşıklığı (Worst Case)** | O(n) | O(1) (Jump Table) veya O(log n) (Binary Search) |
| **En iyi durum** | O(1) | O(1) |
| **Ortalama durum** | O(n) | O(1) veya O(log n) |
| **Aralık Kontrolü** | Evet | Hayır |
| **Hız (Küçük n için)** | Yavaş olabilir | Daha hızlı |
| **Hız (Büyük n için)** | Daha yavaş (O(n)) | Daha hızlı (O(1) veya O(log n)) |
| **Esneklik** | Daha esnek | Sadece belirli değerler için uygun |

---

## **4. Ne Zaman Hangi Yapıyı Kullanmalıyız?**
| **Durum** | **Önerilen Yapı** |
|-----------------|----------------|
| Aralık bazlı karşılaştırmalar (x > 10, x < 50 gibi) | **If-Else If** |
| Mantıksal koşullar (`&&`, `||`, `!`) | **If-Else If** |
| **Sabit değerleri karşılaştırma** | **Switch-Case** |
| **Küçük ve ardışık integer değerleriyle çalışıyorsanız** | **Switch-Case (O(1) Jump Table)** |
| **Büyük ve rastgele dağılımlı değerlerde** | **Switch-Case (O(log n) Binary Search)** |

---

### **Sonuç**
- `if-else if` **daha esnektir** ancak **O(n) performansı** nedeniyle büyük kod bloklarında yavaş olabilir.
- `switch-case` **daha hızlıdır** ve `jump table` veya `binary search` kullanarak **O(1) veya O(log n)** çalışabilir.
- Küçük sayılar ve sabit değerler için **switch-case** tercih edilmelidir.
- Mantıksal ifadeler ve aralık kontrolleri için **if-else if** kullanılır.

Bu analiz ışığında, senaryoya göre uygun olanı seçmek en iyi yaklaşımdır. 🚀

## switch-case ile if-elseif-else arasındaki hız faktöri
```sh 

```


## Method
```sh 

```
---
# **Java'da Metot (Method) Nedir? (Detaylı Açıklama)**

## **📌 1. Metot (Method) Nedir?**
Java'da **metot (method)**, belirli bir işi gerçekleştiren **kod bloklarıdır**.  
Metotlar, **kod tekrarını önler, programı daha düzenli hale getirir ve yeniden kullanılabilirlik sağlar**.  
Bir metot, **parametre alabilir, bir değer döndürebilir veya sadece bir işlemi gerçekleştirebilir.**

---

## **📌 2. Java’da Metot Tanımlama**
Java'da bir metot **4 ana bileşenden oluşur**:

1. **Erişim Belirleyici (Access Modifier)** → `public`, `private`, `protected`
2. **Geri Dönüş Tipi (Return Type)** → `void`, `int`, `double`, `String`, vb.
3. **Metot Adı (Method Name)** → `camelCase` kuralına uygun olmalıdır.
4. **Parametre Listesi (Parameters)** → **Metodun giriş değerleri**.

📌 **Genel Metot Tanımı:**
```java
erişimBelirteci geriDönüşTipi metotAdı(parametreler) {
    // Metot gövdesi (method body)
}
```

---

## **📌 3. Parametresiz ve Parametreli Metotlar**
### **✅ 3.1 Parametresiz Metot**
Parametresiz metot, **hiçbir giriş almadan** belirli bir işlemi gerçekleştirir.

```java
public class MetotOrnek {
    public static void selamVer() {
        System.out.println("Merhaba, hoş geldiniz!");
    }

    public static void main(String[] args) {
        selamVer(); // Metot çağrıldı
    }
}
```
**Çıktı:**
```
Merhaba, hoş geldiniz!
```
- **Metot parametre almaz**.
- **Çağrıldığında her zaman aynı çıktıyı üretir**.

---

### **✅ 3.2 Parametreli Metot**
Bir metot, **giriş değerleri (parametreler) alarak farklı sonuçlar üretebilir**.

```java
public class MetotOrnek {
    public static void selamVer(String isim) {
        System.out.println("Merhaba, " + isim + "!");
    }

    public static void main(String[] args) {
        selamVer("Hamit"); // Parametre olarak "Hamit" gönderildi
        selamVer("Ayşe");  // Parametre olarak "Ayşe" gönderildi
    }
}
```
**Çıktı:**
```
Merhaba, Hamit!
Merhaba, Ayşe!
```
📌 **Metot farklı girişlerle farklı sonuçlar üretebilir.**

---

## **📌 4. Geri Dönüş Tipi (Return Type)**
Metotlar, işlem sonucunda bir değer döndürebilir. Bunun için **geri dönüş tipi belirtilmelidir**.

### **✅ 4.1 `void` Metotlar**
Eğer metot **bir değer döndürmeyecekse**, **`void`** olarak tanımlanır.

```java
public class VoidExample {
    public static void yazdir(String mesaj) {
        System.out.println(mesaj);
    }

    public static void main(String[] args) {
        yazdir("Java metotları öğreniyoruz!");
    }
}
```
**Çıktı:**
```
Java metotları öğreniyoruz!
```
📌 **`void` metotlar, bir işlem yapar ama geri dönüş değeri yoktur.**

---

### **✅ 4.2 Değer Döndüren Metotlar**
Metot bir işlem sonucunda bir değer döndürebilir.

```java
public class MetotOrnek {
    public static int kareAl(int sayi) {
        return sayi * sayi;
    }

    public static void main(String[] args) {
        int sonuc = kareAl(5);
        System.out.println("Sonuç: " + sonuc);
    }
}
```
**Çıktı:**
```
Sonuç: 25
```
📌 **Metot `int` türünde bir değer döndürdüğü için `return` ifadesi kullanıldı.**

---

## **📌 5. Metot Aşırı Yükleme (Method Overloading)**
📌 **Aynı isimli birden fazla metot tanımlamak mümkündür, ancak parametreleri farklı olmalıdır.**

```java
public class OverloadingExample {
    public static int toplama(int a, int b) {
        return a + b;
    }

    public static double toplama(double a, double b) {
        return a + b;
    }

    public static int toplama(int a, int b, int c) {
        return a + b + c;
    }

    public static void main(String[] args) {
        System.out.println(toplama(5, 10));        // int parametreli
        System.out.println(toplama(5.5, 2.5));    // double parametreli
        System.out.println(toplama(1, 2, 3));      // 3 parametreli
    }
}
```
**Çıktı:**
```
15
8.0
6
```
📌 **Method Overloading ile farklı parametre türlerine göre farklı işlemler yapılabilir.**

---

## **📌 6. `static` ve `non-static` Metotlar**
### **✅ 6.1 `static` Metotlar**
- **Sınıfa aittir, nesne oluşturmadan çağrılabilir**.
- **Doğrudan `ClassName.metotAdi()` şeklinde erişilir**.

```java
public class MathUtil {
    public static int kupAl(int x) {
        return x * x * x;
    }

    public static void main(String[] args) {
        System.out.println(kupAl(3)); // 27
    }
}
```
---

### **✅ 6.2 `non-static` Metotlar**
- **Nesne oluşturularak çağrılır**.
- **Her nesne için farklı değerler tutabilir**.

```java
public class HesapMakinesi {
    public int topla(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        HesapMakinesi hm = new HesapMakinesi();
        System.out.println(hm.topla(3, 7)); // 10
    }
}
```

---

## **📌 7. Rekürsif (Recursive) Metotlar**
📌 **Metot, kendi kendini çağırır**. Özellikle **faktöriyel, Fibonacci gibi hesaplamalarda** kullanılır.

```java
public class RecursionExample {
    public static int faktoriyel(int n) {
        if (n == 1) {
            return 1;
        }
        return n * faktoriyel(n - 1);
    }

    public static void main(String[] args) {
        System.out.println(faktoriyel(5)); // 120
    }
}
```
**Çıktı:**
```
120
```
📌 **Özyinelemeli metotlar, dikkatli kullanılmazsa sonsuz döngüye neden olabilir!**

---

## **📌 8. `final` Metotlar (Override Engelleme)**
- **Bir metot `final` olarak tanımlanırsa, alt sınıflar tarafından değiştirilemez.**

```java
class Hayvan {
    public final void sesCikar() {
        System.out.println("Ses çıkarıyorum!");
    }
}

class Kedi extends Hayvan {
    // public void sesCikar() {} // HATA! Çünkü final metot değiştirilemez.
}
```

---

## **📌 9. Özet**
| Özellik | Açıklama |
|---------|---------|
| **Parametresiz Metot** | Hiçbir giriş almadan çalışır. |
| **Parametreli Metot** | Dışarıdan veri alır ve ona göre işlem yapar. |
| **Geri Dönüşlü Metot** | İşlem sonucunu döndürür. |
| **Overloading (Aşırı Yükleme)** | Aynı isimli farklı parametrelerle metot tanımlanır. |
| **Static Metot** | Nesne oluşturmadan çağrılabilir. |
| **Non-Static Metot** | Nesne oluşturarak kullanılır. |
| **Rekürsif (Recursive) Metot** | Kendi kendini çağıran metottur. |

📌 **Java'da metotlar, kod tekrarını önler ve programın yönetilebilirliğini artırır! 🚀**


## Javada Adresleme Nasıldır ?
```sh 

```
---


## **Java'da Adresleme Nasıl Çalışır? (Bellek Yönetimi ve Referanslar)**
Java'da adresleme, **bellek yönetimi, nesne referansları ve değişkenlerin nasıl saklandığıyla** ilgilidir. **Java, bellek yönetimini büyük ölçüde otomatik hale getirir (Garbage Collector sayesinde), ancak bellekte verilerin nasıl tutulduğunu anlamak önemlidir.**

---

## **1. Java'da Bellek Alanları**
Java'da bellek iki ana bölüme ayrılır:

| **Bellek Alanı** | **Ne İçin Kullanılır?** |
|----------------|----------------------|
| **Stack Bellek** | **Yerel değişkenler, primitive türler ve referans değişkenleri burada saklanır.** |
| **Heap Bellek** | **Tüm nesneler burada saklanır. Heap üzerindeki nesneler referans değişkenleri tarafından işaret edilir.** |

### **📌 Önemli: Java'da Bellek Adresleme Mantığı**
- **Primitive türler (`int`, `double`, `char`, vb.)** **stack bellekte** doğrudan saklanır.
- **Referans türler (`String`, `Array`, `Object`, vb.)** **heap bellekte saklanır**, ancak değişkenler stack'te sadece **adresini (referansını)** tutar.
- **Nesneye erişim, referans üzerinden yapılır** (C++'daki pointer'lara benzemez, ama mantık olarak benzer çalışır).

---

## **2. Örneklerle Java'da Adresleme**

### **🎯 Örnek 1: Primitive Veri Türlerinin Stack Üzerinde Saklanması**
```java
public class PrimitiveStackExample {
    public static void main(String[] args) {
        int a = 10;
        int b = a; // b, a'nın değerini alır (Kopyalanır, adres paylaşımı olmaz)
        b = 20;
        
        System.out.println("a: " + a); // 10
        System.out.println("b: " + b); // 20
    }
}
```
📌 **Stack Bellek Yapısı:**
- `a` değişkeni stack bellekte saklanır (`a -> 10`).
- `b = a;` dediğimizde `b` için yeni bir bellek alanı açılır ve `10` kopyalanır.
- `b` değiştiğinde `a` etkilenmez, çünkü **primitive değişkenler direkt olarak stack bellekte saklanır ve kopyalanır**.

---

### **🎯 Örnek 2: Referans Türleri ve Heap Bellek**
```java
class Araba {
    String model;
}

public class ReferenceExample {
    public static void main(String[] args) {
        Araba araba1 = new Araba();
        araba1.model = "BMW";

        Araba araba2 = araba1; // araba1'in referansı kopyalandı

        araba2.model = "Mercedes";

        System.out.println("araba1 Model: " + araba1.model); // Mercedes
        System.out.println("araba2 Model: " + araba2.model); // Mercedes
    }
}
```
📌 **Heap Bellek Yapısı:**
1. `Araba araba1 = new Araba();`
    - Yeni bir `Araba` nesnesi **Heap bellekte oluşturulur**.
    - `araba1` değişkeni, stack bellekte nesnenin **heap adresini** tutar.
2. `Araba araba2 = araba1;`
    - `araba2`, **araba1 ile aynı heap adresini işaret eder** (Yeni nesne oluşturulmaz!).
    - Yani `araba1` ve `araba2` aynı nesneyi gösterir.
3. `araba2.model = "Mercedes";`
    - `araba2` üzerinden nesne değiştirildiği için, **`araba1` de aynı nesneyi gösterdiğinden değişim her iki değişkende de görünür.**

🚨 **Önemli Not:**  
Eğer `araba2 = new Araba();` yapsaydık, **heap bellekte yeni bir nesne oluşturulurdu** ve `araba1` ile bağı kopardı.

---

## **3. Adresleme Mantığı: `==` vs `.equals()`**
### **📌 `==` Operatörü (Bellek Adresi Karşılaştırması)**
- İki referansın **aynı heap adresine** mi işaret ettiğini kontrol eder.

### **📌 `.equals()` Metodu (İçerik Karşılaştırması)**
- **Nesnelerin içeriğini karşılaştırır**.

```java
String s1 = new String("Merhaba");
String s2 = new String("Merhaba");

System.out.println(s1 == s2); // false (Farklı heap nesneleri)
System.out.println(s1.equals(s2)); // true (İçerik aynı)
```
📌 **Neden?**
- `s1` ve `s2` ayrı `new String()` ile oluşturulduğundan **farklı heap adreslerinde** saklanır.
- **Ancak içerikleri aynı olduğundan** `.equals()` true döndürür.

---

## **4. Garbage Collector (Çöp Toplayıcı)**
- **Java’da manuel `free()` veya `delete` yoktur (C++ gibi).**
- **Garbage Collector (GC)**, kullanılmayan nesneleri otomatik olarak temizler.

### **GC'nin Çalıştığı Durumlar:**
1. **Bir nesneye referans kalmazsa temizlenir**:
```java
Araba araba1 = new Araba();
araba1 = null; // Bu nesne artık Garbage Collector tarafından temizlenebilir.
```
2. **Eğer referans başka bir nesneye atanırsa, önceki nesne erişilemez olur**:
```java
Araba araba1 = new Araba();
Araba araba2 = new Araba();
araba1 = araba2; // Önceki araba1 nesnesi artık kullanılmaz ve GC temizleyebilir.
```
✅ **Heap bellekten silinme işlemi Garbage Collector tarafından yönetilir.**

---

## **5. Nesneleri Kopyalama ve Adresleme**
- Eğer **nesnenin farklı bir kopyasını oluşturmak** istiyorsak **deep copy (derin kopya) yapmalıyız**.

### **📌 Shallow Copy (Yüzeysel Kopyalama - Aynı Referansı Kullanır)**
```java
Araba araba1 = new Araba();
araba1.model = "Audi";

Araba araba2 = araba1; // Aynı heap adresini gösterir
araba2.model = "Tesla";

System.out.println(araba1.model); // Tesla
```

### **📌 Deep Copy (Derin Kopyalama - Yeni Bir Nesne Oluşturur)**
```java
Araba araba1 = new Araba();
araba1.model = "Audi";

Araba araba2 = new Araba();
araba2.model = araba1.model; // Yeni nesneye ayrı değer atanıyor.

araba2.model = "Tesla";

System.out.println(araba1.model); // Audi (Değişmez!)
System.out.println(araba2.model); // Tesla
```
✅ **Deep Copy kullanarak heap bellekte farklı nesneler oluşturmuş olduk.**

---

## **6. Özet: Java'da Adresleme**
| **Tür** | **Saklandığı Bellek** | **Adresleme Mantığı** |
|---------|----------------|----------------|
| **Primitive Türler (`int`, `char`, `double`, vb.)** | **Stack Bellekte** | Direkt değer saklanır, referans kullanılmaz |
| **Referans Türler (`String`, `Array`, `Object`)** | **Stack’te referans, Heap’te nesne** | Heap’te nesne tutulur, stack sadece adresini saklar |
| **`==` Operatörü** | **Heap adreslerini karşılaştırır** | Aynı heap nesnesine mi işaret ediyor? |
| **`.equals()` Metodu** | **İçeriği karşılaştırır** | İçerik aynı mı? |
| **Garbage Collector (GC)** | **Heap’teki kullanılmayan nesneleri temizler** | Kullanılmayan nesneleri siler |

✅ **Java, bellek adresleme işlemlerini otomatik olarak yönetir, ancak referans mantığını anlamak performans açısından önemlidir.** 🚀


## Tarih
```sh 

```
---
# **📌 Java'da Tarihler ve Zaman İşlemleri (Detaylı Açıklama)**

Java'da tarih ve zaman işlemleri için birçok **sınıf ve API** bulunmaktadır. **Java 8**'den önce ve sonra farklı yöntemler kullanılmıştır.
- **Java 8 öncesi:** `java.util.Date`, `java.util.Calendar`, `java.text.SimpleDateFormat`
- **Java 8 sonrası:** `java.time` paketi (`LocalDate`, `LocalTime`, `LocalDateTime`, `ZonedDateTime`, vb.)

---

# **🔹 1. Java'da Tarih ve Zaman Kullanımı**
## **✅ 1.1 `java.util.Date` Sınıfı (Eski Yöntem)**
`Date` sınıfı, **tarih ve zaman bilgilerini saklayan eski bir sınıftır.**  
**Ancak modifiye edilemez (immutable) olduğu için yetersizdir.**

```java
import java.util.Date;

public class DateExample {
    public static void main(String[] args) {
        Date simdikiZaman = new Date(); // Şu anki tarih ve saat
        System.out.println("Bugünün Tarihi: " + simdikiZaman);
    }
}
```
**Çıktı (Anlık Değişir):**
```
Bugünün Tarihi: Mon Feb 12 14:30:21 TRT 2025
```

📌 **Sorunlar:**
- **Zaman dilimi (TimeZone) destekleri yetersizdir.**
- **Daha iyi biçimlendirme ve zaman işlemleri için `SimpleDateFormat` ve `Calendar` kullanmak gerekir.**

---

## **✅ 1.2 `SimpleDateFormat` ile Tarih Biçimlendirme**
`SimpleDateFormat` kullanarak, tarihleri **istenilen formatta gösterebiliriz.**

```java
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateFormatExample {
    public static void main(String[] args) {
        Date tarih = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        
        String formatliTarih = sdf.format(tarih);
        System.out.println("Formatlı Tarih: " + formatliTarih);
    }
}
```
**Çıktı:**
```
Formatlı Tarih: 12/02/2025 14:30:21
```
📌 **Format Açıklamaları:**
- `dd` → Gün (`12`)
- `MM` → Ay (`02`)
- `yyyy` → Yıl (`2025`)
- `HH:mm:ss` → Saat, dakika, saniye (`14:30:21`)

---

## **✅ 1.3 `java.util.Calendar` ile Tarih Manipülasyonu**
`Calendar`, `Date` sınıfının eksikliklerini gidermek için geliştirilmiş bir sınıftır.

```java
import java.util.Calendar;

public class CalendarExample {
    public static void main(String[] args) {
        Calendar cal = Calendar.getInstance();

        System.out.println("Yıl: " + cal.get(Calendar.YEAR));
        System.out.println("Ay: " + (cal.get(Calendar.MONTH) + 1)); // Aylar 0'dan başlar!
        System.out.println("Gün: " + cal.get(Calendar.DAY_OF_MONTH));
    }
}
```
📌 **Eksikleri:**
- **Karmaşık bir yapıdadır.**
- **Java 8 ile daha modern API'ler gelmiştir.**

---

# **🔹 2. Java 8 ve Sonrası (`java.time` Paketi)**
📌 **Java 8 ile gelen `java.time` paketi**, modern ve güçlü tarih/zaman işlemleri sağlar.
- **Immutable (değiştirilemez)** nesneler oluşturur.
- **Daha okunaklı ve kolay manipülasyon sağlar.**
- **Zaman dilimleri ve biçimlendirme desteği daha iyidir.**

---

## **✅ 2.1 `LocalDate` (Sadece Tarih İçin)**
`LocalDate`, **sadece tarih (gün, ay, yıl) bilgisi tutar, saat tutmaz.**

```java
import java.time.LocalDate;

public class LocalDateExample {
    public static void main(String[] args) {
        LocalDate bugun = LocalDate.now(); // Bugünün tarihi
        System.out.println("Bugünün Tarihi: " + bugun);
        
        LocalDate ozelTarih = LocalDate.of(2025, 2, 12); // Özel bir tarih
        System.out.println("Özel Tarih: " + ozelTarih);
    }
}
```
📌 **LocalDate, tarih hesaplamaları için idealdir.**

---

## **✅ 2.2 `LocalTime` (Sadece Saat İçin)**
`LocalTime`, **sadece saat, dakika, saniye tutar, tarih bilgisi içermez.**

```java
import java.time.LocalTime;

public class LocalTimeExample {
    public static void main(String[] args) {
        LocalTime simdikiSaat = LocalTime.now();
        System.out.println("Şu anki saat: " + simdikiSaat);
    }
}
```
**Çıktı (Anlık Değişir):**
```
Şu anki saat: 14:30:21.345
```
📌 **Mikrosaniye ve nanosaniye bile içerebilir.**

---

## **✅ 2.3 `LocalDateTime` (Tarih ve Saat Birlikte)**
`LocalDateTime`, hem **tarih hem de saat** bilgisini içerir.

```java
import java.time.LocalDateTime;

public class LocalDateTimeExample {
    public static void main(String[] args) {
        LocalDateTime simdi = LocalDateTime.now();
        System.out.println("Şu an: " + simdi);
    }
}
```
📌 **`LocalDateTime`, `LocalDate` ve `LocalTime` birleşimidir.**

---

## **✅ 2.4 `ZonedDateTime` (Zaman Dilimi ile Tarih ve Saat)**
📌 **Farklı zaman dilimlerine göre tarih/saat almak için `ZonedDateTime` kullanılır.**

```java
import java.time.ZonedDateTime;
import java.time.ZoneId;

public class ZonedDateTimeExample {
    public static void main(String[] args) {
        ZonedDateTime istanbulSaati = ZonedDateTime.now(ZoneId.of("Europe/Istanbul"));
        System.out.println("İstanbul Saati: " + istanbulSaati);
    }
}
```
📌 **Dünya çapında geçerli zaman dilimlerini kullanarak çalışabilirsiniz.**

---

# **🔹 3. Java'da Tarih İşlemleri**
## **✅ 3.1 Tarih ve Saat Manipülasyonu**
`plusDays()`, `minusMonths()`, `plusHours()` gibi metotlarla tarih/saat hesaplamaları yapılabilir.

```java
import java.time.LocalDate;

public class DateManipulation {
    public static void main(String[] args) {
        LocalDate bugun = LocalDate.now();
        LocalDate birHaftaSonra = bugun.plusDays(7);
        LocalDate birAyÖnce = bugun.minusMonths(1);

        System.out.println("Bugün: " + bugun);
        System.out.println("Bir Hafta Sonra: " + birHaftaSonra);
        System.out.println("Bir Ay Önce: " + birAyÖnce);
    }
}
```
📌 **Immutable olduğu için, tarih değişmez, yeni bir tarih nesnesi oluşturulur.**

---

# **🔹 4. Tarih Karşılaştırma**
📌 **Tarihler `isBefore()`, `isAfter()`, `isEqual()` metotlarıyla karşılaştırılabilir.**

```java
import java.time.LocalDate;

public class DateComparison {
    public static void main(String[] args) {
        LocalDate tarih1 = LocalDate.of(2025, 2, 12);
        LocalDate tarih2 = LocalDate.of(2025, 5, 15);

        System.out.println("tarih1, tarih2'den önce mi? " + tarih1.isBefore(tarih2));
        System.out.println("tarih1, tarih2 ile aynı mı? " + tarih1.isEqual(tarih2));
    }
}
```
📌 **Tarihler sıralama veya geçerlilik kontrollerinde kullanışlıdır.**

---

# **📌 5. Özet**
| **Sınıf** | **Ne İçin Kullanılır?** |
|-----------|--------------------------|
| `Date` | Eski tarih/saat sınıfı, önerilmez. |
| `Calendar` | Eski tarih manipülasyonu, önerilmez. |
| `SimpleDateFormat` | Tarih biçimlendirme, eski yöntem. |
| `LocalDate` | **Sadece tarih** (yıl, ay, gün). |
| `LocalTime` | **Sadece saat** (saat, dakika, saniye). |
| `LocalDateTime` | **Tarih + Saat** birlikte. |
| `ZonedDateTime` | **Zaman dilimi ile tarih/saat işlemleri.** |

📌 **Java 8+ ile `java.time` kullanarak daha güçlü ve güvenilir tarih işlemleri yapabilirsiniz! 🚀**


## Exception
```sh 

```
---
# **📌 Java'da Exception (İstisna) Nedir? (Detaylı Açıklama)**

---

## **🔹 1. Exception (İstisna) Nedir?**
**Exception (İstisna)**, program çalışırken meydana gelen **beklenmedik hatalar** ve **öngörülemeyen durumları** ifade eder.  
Java'da **Exception Handling (İstisna Yönetimi)** sayesinde programın çökmesi engellenir ve hatalar yönetilebilir hale gelir.

📌 **Java'da hatalar iki ana kategoriye ayrılır:**
1. **Checked Exceptions (Denetlenen İstisnalar)**
2. **Unchecked Exceptions (Denetlenmeyen İstisnalar)**

---

## **🔹 2. Java'da Exception Hiyerarşisi**
Java'daki tüm hata türleri **`Throwable`** sınıfından türetilir.

```
Throwable
 ├── Exception  (Checked Exceptions)
 │   ├── IOException
 │   ├── SQLException
 │   ├── FileNotFoundException
 │   ├── ClassNotFoundException
 │   ├── InterruptedException
 │
 ├── RuntimeException (Unchecked Exceptions)
 │   ├── ArithmeticException
 │   ├── NullPointerException
 │   ├── ArrayIndexOutOfBoundsException
 │   ├── IllegalArgumentException
 │   ├── NumberFormatException
 │
 └── Error
     ├── StackOverflowError
     ├── OutOfMemoryError
     ├── VirtualMachineError
```

### **📌 2.1 `Exception` (İstisna)**
- **Programcı tarafından kontrol edilebilir hatalardır.**
- **`try-catch` blokları ile yakalanabilir.**
- Örnekler: `IOException`, `SQLException`, `FileNotFoundException`.

### **📌 2.2 `RuntimeException` (Çalışma Zamanı İstisnaları)**
- **Kod çalıştırıldığında ortaya çıkan beklenmedik hatalardır.**
- **Önceden kontrol edilmek zorunda değildir.**
- Örnekler: `NullPointerException`, `ArithmeticException`, `ArrayIndexOutOfBoundsException`.

### **📌 2.3 `Error` (Sistemsel Hatalar)**
- **Programcı tarafından kontrol edilemez.**
- **Genellikle JVM kaynaklı hatalardır.**
- Örnekler: `OutOfMemoryError`, `StackOverflowError`.

---

# **🔹 3. Java'da Exception Handling (İstisna Yönetimi)**

## **✅ 3.1 `try-catch` Blokları ile Hata Yönetimi**
**`try-catch` bloğu**, hata alabilecek kodları yönetmek için kullanılır.

```java
public class TryCatchExample {
    public static void main(String[] args) {
        try {
            int sayi = 10 / 0; // Hata: Bölme işlemi sıfıra bölünemez!
        } catch (ArithmeticException e) {
            System.out.println("Hata: Sıfıra bölme hatası!");
        }
        System.out.println("Program devam ediyor...");
    }
}
```
**Çıktı:**
```
Hata: Sıfıra bölme hatası!
Program devam ediyor...
```
📌 **`try` bloğu hata içerirse, `catch` bloğu devreye girer ve program çökmeden devam eder.**

---

## **✅ 3.2 `Multiple Catch` (Birden Fazla `catch` Bloğu Kullanımı)**
**Farklı hataları yakalamak için birden fazla `catch` bloğu kullanılabilir.**

```java
public class MultipleCatchExample {
    public static void main(String[] args) {
        try {
            int[] dizi = {1, 2, 3};
            System.out.println(dizi[5]); // Hata: Dizinin sınırları aşılıyor!
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Hata: Dizi sınırları aşıldı!");
        } catch (ArithmeticException e) {
            System.out.println("Hata: Matematiksel hata!");
        }
        System.out.println("Program devam ediyor...");
    }
}
```
**Çıktı:**
```
Hata: Dizi sınırları aşıldı!
Program devam ediyor...
```

📌 **Her `catch` bloğu, farklı hata türlerini yakalamak için kullanılır.**

---

## **✅ 3.3 `finally` Bloğu (Her Koşulda Çalışan Kod)**
- **`finally` bloğu, hata olsun ya da olmasın her durumda çalışır.**
- **Genellikle kaynakları kapatmak için kullanılır (`File`, `Database Connection`, vb.).**

```java
public class FinallyExample {
    public static void main(String[] args) {
        try {
            int sonuc = 10 / 2;
            System.out.println("Sonuç: " + sonuc);
        } catch (ArithmeticException e) {
            System.out.println("Hata: Matematiksel hata!");
        } finally {
            System.out.println("Bu blok her zaman çalışır!");
        }
    }
}
```
**Çıktı:**
```
Sonuç: 5
Bu blok her zaman çalışır!
```

📌 **Hata olsun veya olmasın, `finally` bloğu her zaman çalışır.**

---

## **✅ 3.4 `throws` ile Hata Bildirme**
📌 **Bir metot hata üretebiliyorsa, bunu `throws` ile belirtmelidir.**

```java
import java.io.*;

public class ThrowsExample {
    public static void dosyaOku() throws IOException {
        FileReader file = new FileReader("dosya.txt");
        BufferedReader br = new BufferedReader(file);
        System.out.println(br.readLine());
    }

    public static void main(String[] args) {
        try {
            dosyaOku();
        } catch (IOException e) {
            System.out.println("Dosya okuma hatası!");
        }
    }
}
```
📌 **`throws`, metot içinde oluşabilecek hataları bildirmek için kullanılır.**

---

## **✅ 3.5 `throw` ile Manuel Hata Fırlatma**
📌 **Kendi özel hatalarınızı fırlatmak için `throw` kullanılır.**

```java
public class ThrowExample {
    public static void kontrolEt(int yas) {
        if (yas < 18) {
            throw new IllegalArgumentException("Yaş 18'den küçük olamaz!");
        }
        System.out.println("Giriş başarılı.");
    }

    public static void main(String[] args) {
        kontrolEt(16); // Hata fırlatılır
    }
}
```
**Çıktı:**
```
Exception in thread "main" java.lang.IllegalArgumentException: Yaş 18'den küçük olamaz!
```
📌 **`throw`, özel hatalar oluşturmak için kullanılır.**

---

# **🔹 4. Özel Exception (Custom Exception)**
Java'da **kendimize özel hata sınıfları oluşturabiliriz.**

```java
class YasHatasi extends Exception {
    public YasHatasi(String mesaj) {
        super(mesaj);
    }
}

public class CustomExceptionExample {
    public static void kontrolEt(int yas) throws YasHatasi {
        if (yas < 18) {
            throw new YasHatasi("Yaş 18'den küçük olamaz!");
        }
        System.out.println("Giriş başarılı.");
    }

    public static void main(String[] args) {
        try {
            kontrolEt(16);
        } catch (YasHatasi e) {
            System.out.println("Özel Hata: " + e.getMessage());
        }
    }
}
```
**Çıktı:**
```
Özel Hata: Yaş 18'den küçük olamaz!
```
📌 **Kendi hata türlerimizi oluşturup fırlatabiliriz.**

---

# **📌 5. Özet**
| **Exception Türü** | **Açıklama** | **Örnek** |
|------------------|-------------|-------------|
| **Checked Exception** | **Derleme (compile-time) sırasında kontrol edilir.** | `IOException`, `SQLException` |
| **Unchecked Exception** | **Çalışma zamanında (runtime) meydana gelir.** | `NullPointerException`, `ArithmeticException` |
| **Error** | **Sistem kaynaklı büyük hatalar.** | `StackOverflowError`, `OutOfMemoryError` |

📌 **Exception Handling ile programlarımız hata alsa bile çökmemeyi ve düzgün çalışmayı sürdürmeyi başarabilir. 🚀**



## javda null değeri ne zaman kullanmalıyım ?
```sh 

```
---
Java'da **`null` değeri**, bir referansın **herhangi bir nesneyi işaret etmediğini** belirtmek için kullanılır. Ancak, **dikkatli kullanılmalıdır**, çünkü `NullPointerException` hatasına neden olabilir.

---

## **1. `null` Ne Zaman Kullanılır?**
### **a) Nesne Başlatmadan (Initialize) Kullanım**
- Bir `String` veya nesne henüz belirsizse `null` atanabilir:
```java
String metin = null;
System.out.println(metin); // null
```
- Ancak, **kullanılmadan önce `null` kontrolü yapılmalıdır**:
```java
if (metin != null) {
    System.out.println(metin.length()); // NullPointerException'ı önler
}
```

---

### **b) Nesne Ataması Sonradan Yapılacaksa**
- Eğer bir nesne **ilerleyen aşamalarda atanacaksa** ama şimdilik bir değere sahip olmaması gerekiyorsa:
```java
class Araba {
    String model = null; // Model henüz belirlenmedi
}
```
- Böylece **ilk başta bellek tüketilmez**, nesne oluşturulduğunda atanır.

---

### **c) Bir Nesne Serbest Bırakılmak (Garbage Collection) İstenirse**
- Java'da **manuel bellek yönetimi yoktur**, ancak bir nesne `null` yapılarak **çöp toplayıcının (Garbage Collector) temizlemesine izin verilebilir**.
```java
Araba araba = new Araba();
araba = null; // Garbage Collector artık bu nesneyi temizleyebilir
```

---

### **d) Koleksiyonlarda Başlangıç Değeri Olarak**
- Eğer bir `List` veya `Map` içinde **başlangıçta bir değerin olmaması gerekiyorsa**:
```java
Map<String, String> isimler = new HashMap<>();
isimler.put("Ali", null); // Ali için henüz bir değer yok
```
- **Ancak, `null` yerine `Optional` kullanımı önerilir (bkz. `Optional<T>`)**.

---

## **2. `null` Kullanımında Dikkat Edilmesi Gerekenler**
### **🚨 `NullPointerException` (NPE) Hatası**
Eğer `null` olan bir nesneye metot çağrısı yapılırsa:
```java
String kelime = null;
System.out.println(kelime.length()); // 🚨 NullPointerException Hatası!
```
**Çözüm:** `null` kontrolü yapın:
```java
if (kelime != null) {
    System.out.println(kelime.length());
}
```

---

## **3. `null` Kullanımına Alternatifler**
### **a) `Optional<T>` Kullanımı (Tavsiye Edilir ✅)**
- **Java 8+**, `null` hatalarını önlemek için `Optional<T>` sunar:
```java
Optional<String> kelime = Optional.ofNullable(null);
System.out.println(kelime.orElse("Varsayılan Değer")); // Varsayılan Değer
```
✅ **Avantajı:** `null` kontrollerini otomatik yapar.

---

### **b) Boş String Kullanımı (`""` yerine `null`)**
Bazı durumlarda `null` yerine boş string (`""`) kullanmak daha güvenli olabilir:
```java
String mesaj = ""; // NullPointerException riski yok
```

---

## **4. Özet: `null` Kullanımı**
| **Durum** | **Kullanım** |
|-----------|------------|
| **Değişkenin başlatılmadığını belirtmek için** | ✅ Kullanılabilir |
| **Bir nesnenin çöp toplayıcı tarafından temizlenmesini sağlamak için** | ✅ Kullanılabilir |
| **Koleksiyonlarda bilinmeyen değerler için** | ✅ Kullanılabilir (Ancak `Optional` önerilir) |
| **Metot çağrılarında ve işlemlerde `null` değer beklenmiyorsa** | 🚫 Kullanılmamalı (Yerine `Optional` veya boş nesne kullanılmalı) |
| **Kontrol edilmeden `null` üzerinden işlem yapmak (`.length()`, `.get()`, vb.)** | 🚫 `NullPointerException` hatasına neden olabilir |

---

✅ **Sonuç:** `null` dikkatli kullanılmalıdır. **Gereksiz `null` kullanımı yerine `Optional<T>`, varsayılan değerler veya boş nesneler kullanılabilir.** 🚀


## Formatter
```sh 

```
---
# **📌 Java `Formatter` Nedir? (Detaylı Anlatım)**
`Formatter` sınıfı, Java'da metinleri **biçimlendirmek (formatlamak)** için kullanılan bir sınıftır. `printf()`, `String.format()` gibi yöntemlerle çalışır ve sayıları, tarihleri, metinleri özel formatlara sokmak için kullanılır.

### **📌 Kullanım Alanları**
✅ **Metin biçimlendirme** (`String.format()` ve `printf()`)  
✅ **Sayıları belirli ondalık hassasiyette göstermek**  
✅ **Tarih ve saat biçimlendirme**  
✅ **Tablolar, raporlar veya dosya çıktıları için veri düzenleme**

---

# **1️⃣ Formatter Kullanımı**
`java.util.Formatter` doğrudan kullanılabilir. Ancak genellikle `String.format()` veya `System.out.printf()` ile dolaylı olarak kullanılır.

```java
import java.util.Formatter;

public class Main {
    public static void main(String[] args) {
        Formatter formatter = new Formatter();
        formatter.format("Merhaba %s, yaşınız %d", "Hamit", 25);
        System.out.println(formatter);
        formatter.close();
    }
}
```
**🎯 Çıktı:**
```
Merhaba Hamit, yaşınız 25
```

### **📌 Açıklamalar:**
- `%s` → **String** türü için yer tutucu.
- `%d` → **Tam sayı** türü için yer tutucu.
- `formatter.close();` → Formatter’ı kapatarak belleği serbest bırakır.

---

# **2️⃣ `String.format()` ile Kullanım (Önerilen)**
`Formatter` kullanmanın en yaygın yolu `String.format()` metodudur. Bu yöntemle **formatlı bir String döndürülür**.

```java
public class Main {
    public static void main(String[] args) {
        String formattedString = String.format("Merhaba %s, yaşınız %d", "Ayşe", 30);
        System.out.println(formattedString);
    }
}
```
**🎯 Çıktı:**
```
Merhaba Ayşe, yaşınız 30
```
**📌 `String.format()` kullanmanın avantajı:**
✅ Tek satırda formatlama sağlar.  
✅ `Formatter` nesnesi oluşturmaya gerek kalmaz.  
✅ Daha az bellek tüketir.

---

# **3️⃣ `printf()` ile Kullanım**
Eğer doğrudan **ekrana yazdırmak** istiyorsanız `System.out.printf()` kullanabilirsiniz.

```java
public class Main {
    public static void main(String[] args) {
        System.out.printf("Merhaba %s, yaşınız %d\n", "Mehmet", 40);
    }
}
```
**🎯 Çıktı:**
```
Merhaba Mehmet, yaşınız 40
```

---

# **4️⃣ Biçimlendirme (`Format Specifiers`)**
Java `Formatter`'da kullanılan temel format belirteçleri şunlardır:

| **Belirteç** | **Açıklama** | **Örnek Kullanım** | **Çıktı** |
|-------------|-------------|---------------------|-----------|
| `%d`  | Tam sayı | `System.out.printf("%d", 25);` | `25` |
| `%f`  | Ondalıklı sayı | `System.out.printf("%.2f", 3.14159);` | `3.14` |
| `%s`  | String | `System.out.printf("%s", "Merhaba");` | `Merhaba` |
| `%c`  | Tek karakter | `System.out.printf("%c", 'A');` | `A` |
| `%b`  | Boolean | `System.out.printf("%b", true);` | `true` |
| `%n`  | Yeni satır | `System.out.printf("Merhaba%nDünya");` | `Merhaba` (alt satır) `Dünya` |

---

## **5️⃣ Ondalıklı Sayılar için Biçimlendirme**
```java
public class Main {
    public static void main(String[] args) {
        double pi = 3.14159265359;
        System.out.printf("Pi sayısı: %.2f\n", pi); // 2 ondalık basamak göster
    }
}
```
**🎯 Çıktı:**
```
Pi sayısı: 3.14
```
✔ `%.2f` → **Ondalıklı sayıyı iki basamağa yuvarlar.**  
✔ `%.3f` → **Üç basamak gösterir.**

---

## **6️⃣ Sayıları Sağdan ve Soldan Hizalama**
Metinleri hizalamak için **`%10s` veya `%-10s`** gibi formatlar kullanılabilir.

```java
public class Main {
    public static void main(String[] args) {
        System.out.printf("|%10s|%n", "Merhaba");  // Sağdan hizalar
        System.out.printf("|%-10s|%n", "Merhaba"); // Soldan hizalar
    }
}
```
**🎯 Çıktı:**
```
|   Merhaba|
|Merhaba   |
```
✔ `%10s` → **Sağdan hizalar ve boşluk ekler.**  
✔ `%-10s` → **Soldan hizalar ve boşluk ekler.**

---

## **7️⃣ Sayıları Sıfır ile Doldurma**
Sayının önüne sıfır eklemek için `%0Xd` kullanılabilir (`X` karakter sayısıdır).

```java
public class Main {
    public static void main(String[] args) {
        System.out.printf("%05d\n", 42);
    }
}
```
**🎯 Çıktı:**
```
00042
```
✔ `%05d` → **5 haneli yapar ve eksik kısımları `0` ile doldurur.**

---

## **8️⃣ Para Birimi Formatlama**
`Locale` kullanarak farklı ülkelerin para birimini formatlayabiliriz.

```java
import java.text.NumberFormat;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        double amount = 1234567.89;
        NumberFormat currencyFormatter = NumberFormat.getCurrencyInstance(Locale.US);
        System.out.println(currencyFormatter.format(amount)); // ABD formatı
    }
}
```
**🎯 Çıktı:**
```
$1,234,567.89
```
✔ `Locale.US` → Amerikan dolar formatına göre gösterir.  
✔ `Locale.FRANCE` → Fransız para formatına çevirir.

---

## **9️⃣ Tarih ve Saat Formatlama**
```java
import java.text.SimpleDateFormat;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Date now = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
        System.out.println(sdf.format(now));
    }
}
```
**🎯 Çıktı:**
```
15-02-2025 14:45:30
```

---

## **🔍 Formatter mı, String.format() mı?**
| **Özellik** | **Formatter** | **String.format()** |
|-------------|--------------|---------------------|
| Nesne oluşturma | `Formatter formatter = new Formatter();` | `String.format()` ile tek satır |
| Bellek tüketimi | Daha fazla bellek kullanır | Daha az bellek kullanır |
| Kullanım kolaylığı | Daha karmaşık | Daha kolay |

📌 **Genellikle `String.format()` önerilir!**

---

## **✅ Özet**
- **`Formatter`**, Java'da metin, sayı ve tarih biçimlendirmek için kullanılır.
- **`String.format()` ve `printf()`**, `Formatter` sınıfını kullanmanın en yaygın yollarıdır.
- **Sayıları ve tarihleri formatlamak**, ondalık hassasiyet eklemek, hizalama yapmak için çok kullanışlıdır.

Java'da **biçimlendirilmiş çıktılar** oluşturmak için `Formatter` sınıfını etkili şekilde kullanabilirsin! 🚀

## Renk Çıktıları
```sh 

```
---
Java'nın standart `System.out.println()` veya `System.out.printf()` çıktıları **renkli desteklemez**, ancak **ANSI kaçış kodları** (`ANSI Escape Codes`) kullanarak terminalde renkli metinler yazdırabilirsiniz. 🚀

---

## **📌 1️⃣ ANSI Kaçış Kodları ile Renkli Çıktılar**
Java'da terminale renkli metin yazdırmak için aşağıdaki ANSI kodlarını kullanabilirsiniz:

### **🟢 Renk Kodu Tablosu**
| **Renk** | **Kod** |
|----------|--------|
| **🔴 Kırmızı** | `\033[31m` |
| **🟢 Yeşil** | `\033[32m` |
| **🟡 Sarı** | `\033[33m` |
| **🔵 Mavi** | `\033[34m` |
| **🟣 Mor** | `\033[35m` |
| **🔵 Açık Mavi** | `\033[36m` |
| **⚪ Beyaz** | `\033[37m` |
| **🖤 Siyah** | `\033[30m` |
| **⚫ Arkaplan Siyah** | `\033[40m` |
| **🔴 Arkaplan Kırmızı** | `\033[41m` |
| **🟢 Arkaplan Yeşil** | `\033[42m` |
| **🔵 Arkaplan Mavi** | `\033[44m` |

**⚠️ Önemli Not:** Bu yöntem **Windows Terminal, macOS, Linux, IntelliJ IDEA ve bazı IDE'lerde** çalışır, ancak **Eclipse gibi IDE'lerde desteklenmeyebilir**.

---

### **🛠 Örnek: Java'da Renkli Çıktı**
```java
public class Main {
    // ANSI Renk Kodları
    public static final String RESET = "\033[0m";  // Renk sıfırlama
    public static final String RED = "\033[31m";   // Kırmızı
    public static final String GREEN = "\033[32m"; // Yeşil
    public static final String YELLOW = "\033[33m";// Sarı
    public static final String BLUE = "\033[34m";  // Mavi
    public static final String PURPLE = "\033[35m";// Mor
    public static final String CYAN = "\033[36m";  // Açık Mavi

    public static void main(String[] args) {
        System.out.println(RED + "Bu kırmızı renkte!" + RESET);
        System.out.println(GREEN + "Bu yeşil renkte!" + RESET);
        System.out.println(YELLOW + "Bu sarı renkte!" + RESET);
        System.out.println(BLUE + "Bu mavi renkte!" + RESET);
        System.out.println(PURPLE + "Bu mor renkte!" + RESET);
        System.out.println(CYAN + "Bu açık mavi renkte!" + RESET);
    }
}
```

**🎯 Çıktı (Terminalde)**:
```
🔴 Bu kırmızı renkte!
🟢 Bu yeşil renkte!
🟡 Bu sarı renkte!
🔵 Bu mavi renkte!
🟣 Bu mor renkte!
🔵 Bu açık mavi renkte!
```
✔ `RESET` → **Yazdırdıktan sonra rengi sıfırlar**.  
✔ **Her rengin sonunda `+ RESET` eklenmelidir, yoksa sonraki tüm çıktılar o renkte kalır.**

---

## **📌 2️⃣ String.format() ile Renkli Çıktı**
`String.format()` ile de renk kodlarını kullanabiliriz:

```java
public class Main {
    public static final String GREEN = "\033[32m"; // Yeşil
    public static final String RESET = "\033[0m";  // Renk sıfırlama

    public static void main(String[] args) {
        String formattedString = String.format(GREEN + "Merhaba %s, yaşınız %d" + RESET, "Hamit", 30);
        System.out.println(formattedString);
    }
}
```
**🎯 Çıktı (Terminalde Yeşil Renkli)**
```
Merhaba Hamit, yaşınız 30
```

---

## **📌 3️⃣ System.out.printf() ile Renkli Çıktı**
Aynı yöntemi `printf()` ile de uygulayabiliriz:

```java
public class Main {
    public static final String RED = "\033[31m";   // Kırmızı
    public static final String RESET = "\033[0m";  // Sıfırlama

    public static void main(String[] args) {
        System.out.printf(RED + "Hata: %s dosyası bulunamadı!%n" + RESET, "config.txt");
    }
}
```
**🎯 Çıktı (Kırmızı Renk)**
```
Hata: config.txt dosyası bulunamadı!
```

---

## **📌 4️⃣ Renkli Metin Formatlama Metodu**
Tekrar eden renk kodlarından kurtulmak için bir metot yazabiliriz:

```java
public class Main {
    public static final String RESET = "\033[0m";
    public static final String BLUE = "\033[34m";
    public static final String GREEN = "\033[32m";
    public static final String RED = "\033[31m";

    public static String colorText(String text, String color) {
        return color + text + RESET;
    }

    public static void main(String[] args) {
        System.out.println(colorText("Bu mavi renkte!", BLUE));
        System.out.println(colorText("Bu yeşil renkte!", GREEN));
        System.out.println(colorText("Bu kırmızı renkte!", RED));
    }
}
```
✔ **`colorText()` metodu ile her seferinde renk kodlarını eklemeye gerek kalmaz.**  
✔ **Kod daha okunaklı hale gelir.** 🚀

---

## **📌 5️⃣ Renkli Arkaplan Kullanalım!**
Metin rengi yerine **arkaplan rengini değiştirebiliriz**:

```java
public class Main {
    public static final String RESET = "\033[0m";
    public static final String BLACK_BG = "\033[40m"; // Siyah Arkaplan
    public static final String RED_BG = "\033[41m";   // Kırmızı Arkaplan
    public static final String GREEN_BG = "\033[42m"; // Yeşil Arkaplan

    public static void main(String[] args) {
        System.out.println(RED_BG + "Bu metnin arka planı kırmızı!" + RESET);
        System.out.println(GREEN_BG + "Bu metnin arka planı yeşil!" + RESET);
    }
}
```
**🎯 Çıktı (Terminalde Arkaplan Renkli)**
```
🟥 Bu metnin arka planı kırmızı!
🟩 Bu metnin arka planı yeşil!
```

---

## **⚠️ Önemli Notlar**
❌ **Eclipse gibi IDE'lerde ANSI renkleri desteklenmez.**  
✅ **Terminal, IntelliJ IDEA ve VS Code Terminal'de çalışır.**  
✅ **Windows 10+ veya Linux/macOS’ta desteklenir.**  
✅ **Windows'ta CMD yerine `PowerShell` veya `Windows Terminal` kullanmalısınız.**

---

## **🎯 Sonuç**
✔ **Java'da renkli metinler yazdırmak için ANSI kaçış kodlarını kullanabilirsin.**  
✔ **String.format(), printf() ve System.out.println() ile renkli çıktı alınabilir.**  
✔ **Renk kodlarını metodlaştırarak daha temiz bir kod yazabilirsin.**  
✔ **Arkaplan renkleri de desteklenir!**

Bu yöntemle **Java çıktılarınızı daha okunaklı ve şık hale getirebilirsiniz!** 🚀✨



## Dizi(Array)
```sh 

```
---
# **Java'da Dizi (Array) Nedir? **

## **📌 1. Dizi (Array) Nedir?**
Java'da **dizi (array)**, **aynı veri tipindeki** birden fazla elemanı **tek bir değişken içinde saklamak** için kullanılır.  
Diziler:
- **Sabit bir boyuta sahiptirler** (Oluşturulduktan sonra boyutu değiştirilemez).
- **Aynı türden elemanları saklarlar** (`int`, `double`, `String`, vb.).
- **Dizi indisleri (index) 0'dan başlar**.
- **Diziler bellek üzerinde bitişik (contiguous) olarak saklanır**.

---

## **📌 2. Java’da Dizi Tanımlama ve Kullanımı**
### **✅ 2.1 Dizi Tanımlama**
Dizi tanımlamanın iki temel yolu vardır:

**1️⃣ İlk Yöntem: Dizi Tanımlama ve Bellekte Yer Ayırma**
```java
int[] sayilar = new int[5]; // 5 elemanlı bir int dizisi
```
- **Dizinin boyutu `5` olarak belirlendi ve varsayılan değerlerle (0) dolduruldu.**

---

**2️⃣ İkinci Yöntem: Tanımlama ve Değer Atama**
```java
int[] sayilar = {10, 20, 30, 40, 50};
```
- **Dizi doğrudan tanımlandı ve elemanları atandı**.

📌 **Önemli:**
- Java’da dizinin boyutu **sonradan değiştirilemez**.
- Bir dizi `null` olabilir ama **başlangıçta boyutu belirtilmeden oluşturulamaz**.

🚫 **Hatalı Tanımlama**
```java
int[] dizi; 
dizi = {1, 2, 3, 4}; // HATA! Doğrudan böyle atama yapılamaz.
```

✅ **Doğru Kullanım**
```java
int[] dizi;
dizi = new int[]{1, 2, 3, 4};
```

---

## **📌 3. Dizi Elemanlarına Erişim ve Değiştirme**
Dizi elemanlarına **indeks (index) numarası** kullanılarak erişilir.

```java
public class DiziErisim {
    public static void main(String[] args) {
        int[] sayilar = {10, 20, 30, 40, 50};

        // Dizinin 0. elemanını yazdırma
        System.out.println("İlk eleman: " + sayilar[0]); // 10
        
        // Dizinin 2. elemanını değiştirme
        sayilar[2] = 100;
        
        System.out.println("Yeni 2. eleman: " + sayilar[2]); // 100
    }
}
```
📌 **Dizi indisleri 0'dan başlar ve `dizi.length - 1` kadar gider.**

---

## **📌 4. Dizinin Boyutunu Öğrenme**
Java'da **bir dizinin boyutu**, **`.length`** özelliği ile öğrenilir.

```java
public class DiziBoyutu {
    public static void main(String[] args) {
        int[] dizi = {10, 20, 30, 40};
        System.out.println("Dizi uzunluğu: " + dizi.length); // 4
    }
}
```
📌 **Dikkat:**
- `dizi.length` bir metot değil, **bir özelliktir** (`()` parantezleri kullanılmaz).

---

## **📌 5. Dizi Üzerinde Döngüler Kullanımı**
### **✅ 5.1 `for` Döngüsü ile Dizi Kullanımı**
```java
public class DiziDongu {
    public static void main(String[] args) {
        int[] sayilar = {5, 10, 15, 20, 25};

        for (int i = 0; i < sayilar.length; i++) {
            System.out.println("Eleman " + i + ": " + sayilar[i]);
        }
    }
}
```
**Çıktı:**
```
Eleman 0: 5
Eleman 1: 10
Eleman 2: 15
Eleman 3: 20
Eleman 4: 25
```

---

### **✅ 5.2 `for-each` Döngüsü ile Dizi Kullanımı**
```java
public class ForEachOrnek {
    public static void main(String[] args) {
        String[] diller = {"Java", "Python", "C++", "JavaScript"};

        for (String dil : diller) {
            System.out.println("Programlama Dili: " + dil);
        }
    }
}
```
**Çıktı:**
```
Programlama Dili: Java
Programlama Dili: Python
Programlama Dili: C++
Programlama Dili: JavaScript
```
📌 **`for-each` dizileri gezmek için kullanışlıdır ama dizinin indeksine erişemez.**

---

## **📌 6. Çok Boyutlu Diziler (Multidimensional Arrays)**
### **✅ 6.1 İki Boyutlu (2D) Dizi Tanımlama**
```java
int[][] matris = new int[3][3]; // 3x3'lük bir matris
```

📌 **Başlangıç değerleri `0` olur.**

---

### **✅ 6.2 Değer Atama ve Erişim**
```java
public class IkiBoyutluDizi {
    public static void main(String[] args) {
        int[][] matris = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        System.out.println("Orta Eleman: " + matris[1][1]); // 5
    }
}
```
📌 **İlk indeks satır, ikinci indeks sütunu temsil eder**.

---

### **✅ 6.3 `for` Döngüsü ile Çok Boyutlu Diziyi Yazdırma**
```java
public class MatrisYazdirma {
    public static void main(String[] args) {
        int[][] matris = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        for (int i = 0; i < matris.length; i++) {
            for (int j = 0; j < matris[i].length; j++) {
                System.out.print(matris[i][j] + " ");
            }
            System.out.println();
        }
    }
}
```
**Çıktı:**
```
1 2 3
4 5 6
7 8 9
```
📌 **`matris.length` satır sayısını, `matris[i].length` sütun sayısını verir.**

---

## **📌 7. Java’da Dizi Kopyalama**
### **✅ 7.1 `System.arraycopy()` Kullanımı**
```java
public class DiziKopyalama {
    public static void main(String[] args) {
        int[] orijinal = {1, 2, 3, 4, 5};
        int[] kopya = new int[5];

        System.arraycopy(orijinal, 0, kopya, 0, 5);

        for (int eleman : kopya) {
            System.out.print(eleman + " ");
        }
    }
}
```
**Çıktı:**
```
1 2 3 4 5
```
📌 **Diziyi manuel kopyalamaya göre daha verimlidir.**

---

## **📌 8. `Arrays` Sınıfı ile Dizi İşlemleri**
Java’nın **`java.util.Arrays`** sınıfı, diziler için **yardımcı metotlar** içerir.

### **✅ 8.1 `Arrays.toString()` - Diziyi String'e Çevirme**
```java
import java.util.Arrays;

public class ArraysExample {
    public static void main(String[] args) {
        int[] sayilar = {3, 1, 4, 1, 5};
        System.out.println(Arrays.toString(sayilar));
    }
}
```
**Çıktı:**
```
[3, 1, 4, 1, 5]
```

---

## **📌 9. Özet**
| **Özellik** | **Açıklama** |
|-------------|-------------|
| **Dizi Tanımlama** | `int[] dizi = new int[5];` |
| **Diziye Değer Atama** | `dizi[0] = 10;` |
| **Dizi Boyutu** | `dizi.length` |
| **Tek Boyutlu Dizi** | `{10, 20, 30}` |
| **Çok Boyutlu Dizi** | `int[][] matris = new int[3][3];` |
| **Dizi Kopyalama** | `System.arraycopy()` |
| **Dizi Sıralama** | `Arrays.sort(dizi);` |

📌 **Java’da diziler, veri saklama ve yönetme açısından oldukça önemli yapılardır! 🚀**


## Array (Diziler) Devam
```sh 

```
---
### **Java'da Diziler (Arrays) Detaylı Açıklama**
Java'da **diziler (arrays)**, aynı türdeki verileri belirli bir sıralamada saklamak için kullanılan veri yapılarıdır. Java'daki diziler, **sabit boyutlu, sıralı ve indeks tabanlı veri yapılarıdır**.

---

## **1. Dizi Tanımlama ve Başlatma**
Bir dizi, belirli bir veri tipindeki elemanları saklayan nesne olarak oluşturulur.

### **1.1. Dizi Tanımlama (Declaration)**
Bir dizi değişkeni tanımlamak için aşağıdaki sözdizimi kullanılır:

```java
veri_tipi[] dizi_adi;  // Tercih edilen kullanım
veri_tipi dizi_adi[];  // Alternatif kullanım
```

Örnek:
```java
int[] sayilar; // Tercih edilen kullanım
double ondaliklar[]; // Alternatif kullanım
```

### **1.2. Dizi Oluşturma (Instantiation)**
Java'da diziler, `new` anahtar kelimesi kullanılarak oluşturulur. **Dizinin boyutu sabittir ve sonradan değiştirilemez.**

```java
dizi_adi = new veri_tipi[boyut];
```

Örnek:
```java
sayilar = new int[5]; // 5 elemanlı bir int dizisi oluşturuldu.
```

Tek satırda tanımlama ve oluşturma:
```java
int[] sayilar = new int[5];
```

---

## **2. Diziye Değer Atama**
Bir diziye değer atamak için **indeks (index) numarası** kullanılır. Java'da diziler **0'dan başlar**.

Örnek:
```java
int[] sayilar = new int[5]; 

sayilar[0] = 10;
sayilar[1] = 20;
sayilar[2] = 30;
sayilar[3] = 40;
sayilar[4] = 50;
```

Alternatif olarak, diziyi doğrudan başlatabilirsiniz:
```java
int[] sayilar = {10, 20, 30, 40, 50};
```

---

## **3. Dizinin Uzunluğunu Bulma**
Dizinin uzunluğu `.length` özelliği ile bulunur:
```java
System.out.println("Dizinin uzunluğu: " + sayilar.length);
```

---

## **4. Dizi Elemanlarını Döngüyle Erişme**
Dizilerde elemanlara erişmek için **for** ve **foreach** döngüleri kullanılabilir.

### **4.1. For Döngüsü ile Erişim**
```java
for (int i = 0; i < sayilar.length; i++) {
    System.out.println("Eleman " + i + ": " + sayilar[i]);
}
```

### **4.2. Foreach Döngüsü ile Erişim**
```java
for (int eleman : sayilar) {
    System.out.println(eleman);
}
```

---

## **5. Çok Boyutlu Diziler**
Java'da **çok boyutlu diziler** (matrisler) oluşturulabilir.

### **5.1. İki Boyutlu Dizi Tanımlama**
```java
int[][] matris = new int[3][3]; // 3x3 boyutunda bir matris
```

### **5.2. Matris İçin Değer Atama**
```java
matris[0][0] = 1;
matris[0][1] = 2;
matris[0][2] = 3;
matris[1][0] = 4;
matris[1][1] = 5;
matris[1][2] = 6;
matris[2][0] = 7;
matris[2][1] = 8;
matris[2][2] = 9;
```

### **5.3. Matris İçin Döngü Kullanımı**
```java
for (int i = 0; i < matris.length; i++) { //satır
    for (int j = 0; j < matris[i].length; j++) { //sutun
        System.out.print(matris[i][j] + " ");
    }
    System.out.println();
}
```

---

## **6. Dizi ile İlgili Önemli Metotlar**
Java'da diziler için bazı kullanışlı metotlar `Arrays` sınıfı ile sağlanır.

```java
import java.util.Arrays;

public class DiziMetotlari {
    public static void main(String[] args) {
        int[] sayilar = {5, 3, 8, 1, 2};

        // Diziyi sıralama
        Arrays.sort(sayilar);
        System.out.println("Sıralanmış dizi: " + Arrays.toString(sayilar));

        // Belirli bir elemanı arama (binary search)
        int index = Arrays.binarySearch(sayilar, 3);
        System.out.println("3 sayısının indeksi: " + index);

        // Diziyi belirli bir değerle doldurma
        Arrays.fill(sayilar, 7);
        System.out.println("Dizi 7 ile dolduruldu: " + Arrays.toString(sayilar));
    }
}
```

---

## **7. Dizi Kullanımında Dikkat Edilmesi Gerekenler**
1. **Dizilerin Boyutu Sabittir:** Java'da diziler **dinamik değildir**, yani oluşturulduktan sonra boyutları değiştirilemez. Daha esnek bir yapı için `ArrayList` kullanılabilir.

2. **Dizilerde Varsayılan Değerler:** Diziler oluşturulduğunda içindeki elemanlar şu varsayılan değerlere sahip olur:
    - `int` → `0`
    - `double` → `0.0`
    - `boolean` → `false`
    - `String` ve diğer referans tipleri → `null`

3. **ArrayIndexOutOfBoundsException:** Dizinin sınırlarını aşan bir indekse erişmeye çalışırsanız hata alırsınız:
   ```java
   int[] dizi = {1, 2, 3};
   System.out.println(dizi[3]); // Hata: ArrayIndexOutOfBoundsException
   ```

---

## **8. Alternatif: List Kullanımı (Dizi Yerine)**
Eğer boyutu değişebilen bir diziye ihtiyacınız varsa, `ArrayList` kullanabilirsiniz:
```java
import java.util.ArrayList;

public class DiziAlternatif {
    public static void main(String[] args) {
        ArrayList<Integer> sayilar = new ArrayList<>();
        sayilar.add(10);
        sayilar.add(20);
        sayilar.add(30);

        System.out.println("Liste: " + sayilar);
        sayilar.remove(1); // 2. elemanı siler
        System.out.println("Güncellenmiş Liste: " + sayilar);
    }
}
```

---

## **Sonuç**
Java'da diziler, aynı türdeki verileri saklamak için kullanılan **sabit boyutlu** veri yapılarıdır. Temel özellikleri:
✅ Hızlı ve etkili bellek kullanımı sağlar.  
✅ Sabit boyutlu oldukları için dinamik değişime uygun değildir.  
✅ **`Arrays`** sınıfı ile ek işlemler yapılabilir.  
✅ **Alternatif olarak `ArrayList` gibi koleksiyonlar kullanılabilir.**

Bu detaylı rehberle, Java dizileri hakkında kapsamlı bir bilgiye sahip oldunuz! 🚀


## Array Büyükten küçüğe
```sh 

```
---
Java'da bir diziyi **büyükten küçüğe** sıralamak için aşağıdaki yöntemlerden birini kullanabilirsiniz:

---

### **1. `Arrays.sort()` ile Büyükten Küçüğe Sıralama (Tersten Yazdırma)**
Java'da `Arrays.sort()` metodu **küçükten büyüğe** sıralama yapar. Büyükten küçüğe sıralamak için **tersine çevirmeliyiz**.

#### **Örnek:**
```java
import java.util.Arrays;
import java.util.Collections;

public class BuyuktenKucugeSiralama {
    public static void main(String[] args) {
        Integer[] sayilar = {5, 2, 9, 1, 3};

        // Arrays.sort() + Collections.reverseOrder() ile büyükten küçüğe sıralama
        Arrays.sort(sayilar, Collections.reverseOrder());

        System.out.println("Büyükten Küçüğe Sıralanmış Dizi: " + Arrays.toString(sayilar));
    }
}
```

**Çıktı:**
```
Büyükten Küçüğe Sıralanmış Dizi: [9, 5, 3, 2, 1]
```

---

### **2. `Arrays.sort()` ile Küçükten Büyüğe Sıralayıp Ters Çevirme**
Eğer **primitive veri tipi** (`int`, `double`) kullanıyorsanız, `Collections.reverseOrder()` çalışmaz. Bu durumda önce `Arrays.sort()` ile küçükten büyüğe sıralayıp, sonra ters çevirebiliriz.

#### **Örnek (Primitive Tiplerle)**
```java
import java.util.Arrays;

public class BuyuktenKucugeSiralamaPrimitive {
    public static void main(String[] args) {
        int[] sayilar = {5, 2, 9, 1, 3};

        // Küçükten büyüğe sırala
        Arrays.sort(sayilar);

        // Ters çevirerek büyükten küçüğe yazdır
        System.out.print("Büyükten Küçüğe Sıralanmış Dizi: ");
        for (int i = sayilar.length - 1; i >= 0; i--) {
            System.out.print(sayilar[i] + " ");
        }
    }
}
```

**Çıktı:**
```
Büyükten Küçüğe Sıralanmış Dizi: 9 5 3 2 1
```

---

### **3. `Arrays.stream().boxed()` ile Büyükten Küçüğe Sıralama (Java 8+)**
Java 8 ve üstü sürümlerde **Streams API** kullanarak sıralama yapabilirsiniz.

#### **Örnek (Lambda ile)**
```java
import java.util.Arrays;
import java.util.Comparator;

public class StreamSirala {
    public static void main(String[] args) {
        int[] sayilar = {5, 2, 9, 1, 3};

        // Stream ile büyükten küçüğe sıralama
        int[] sirali = Arrays.stream(sayilar)
                             .boxed()
                             .sorted(Comparator.reverseOrder())
                             .mapToInt(Integer::intValue)
                             .toArray();

        System.out.println("Büyükten Küçüğe Sıralanmış Dizi: " + Arrays.toString(sirali));
    }
}
```

**Çıktı:**
```
Büyükten Küçüğe Sıralanmış Dizi: [9, 5, 3, 2, 1]
```

---

### **Hangi Yöntemi Kullanmalıyım?**
| **Yöntem** | **Kullanım Durumu** |
|------------|--------------------|
| `Arrays.sort()` + `Collections.reverseOrder()` | `Integer[]` dizisi için en hızlı yöntem. |
| `Arrays.sort()` + `for` döngüsüyle ters yazdırma | `int[]` dizisi için uygun (primitive tip). |
| `Streams API (Java 8+)` | Modern ve kısa kod yazmak isteyenler için. |

Eğer `int[]` kullanıyorsanız **2. yöntemi**, `Integer[]` kullanıyorsanız **1. yöntemi** tercih edebilirsiniz. Java 8 ve sonrası için **3. yöntem** daha okunaklıdır.

Hangi yöntemi seçerseniz seçin, büyükten küçüğe sıralamayı başarıyla yapabilirsiniz! 🚀


## Zaman Karmaşıklığı Uzay Karmaşıklığı
```sh 

```
---

### **Zaman Karmaşıklığı (Time Complexity) ve Uzay Karmaşıklığı (Space Complexity) Nedir?**

Bir algoritmanın performansını ölçerken iki temel faktörü dikkate alırız:
1. **Zaman Karmaşıklığı (Time Complexity)**
2. **Uzay Karmaşıklığı (Space Complexity)**

Bu kavramlar, bir algoritmanın **verimliliğini** anlamamıza yardımcı olur.

---

## **1. Zaman Karmaşıklığı (Time Complexity)**
Bir algoritmanın **çalışma süresinin**, **girdi büyüklüğüne (n)** bağlı olarak nasıl değiştiğini ifade eder.

### **Zaman Karmaşıklığı Nasıl Ölçülür?**
- Bir algoritmadaki temel işlemlerin (toplama, çarpma, döngü işlemleri vb.) **kaç kez çalıştığını** hesaplarız.
- Büyük veri kümeleriyle çalışırken, sabit zamanlı işlemler yerine **en kötü senaryo analizi (Big-O Notasyonu)** kullanılır.
- **Big-O Notasyonu**, algoritmanın çalıştığı süreyi büyüme oranı olarak ifade eder.

### **Zaman Karmaşıklığı Türleri**
| **Big-O** | **Açıklama** | **Örnek Algoritma** |
|-----------|-------------|---------------------|
| **O(1) - Sabit Zaman** | Girdi büyüklüğünden bağımsızdır, hep aynı sürede çalışır. | Dizinin ilk elemanına erişim (`arr[0]`) |
| **O(log n) - Logaritmik Zaman** | Her adımda girdi miktarını yarıya indirir. | Binary Search (İkili Arama) |
| **O(n) - Doğrusal Zaman** | Girdi büyüklüğü arttıkça işlem süresi aynı oranda artar. | Bir dizinin tüm elemanlarını toplama |
| **O(n log n) - Lineer Logaritmik Zaman** | Genellikle sıralama algoritmalarında görülür. | Merge Sort, Quick Sort |
| **O(n²) - Karesel Zaman** | İç içe döngüler varsa oluşur. | Çift döngülü algoritmalar (Bubble Sort) |
| **O(2ⁿ) - Üstel Zaman** | Her adımda işlemler katlanarak artar. | Fibonacci’nin basit özyinelemeli (recursive) hesaplanması |
| **O(n!) - Faktöriyel Zaman** | Girdi arttıkça işlem süresi çok hızlı artar. | Gezgin Satıcı Problemi (TSP) gibi bazı kombinatorik algoritmalar |

---

### **Zaman Karmaşıklığı Örnekleri**
#### **Örnek 1: O(1) - Sabit Zaman**
```java
int firstElement(int[] arr) {
    return arr[0];  // Her zaman sabit sürede çalışır
}
```
Bu fonksiyon **O(1)** karmaşıklığına sahiptir, çünkü girdi ne kadar büyük olursa olsun **tek işlemde** çalışır.

#### **Örnek 2: O(n) - Doğrusal Zaman**
```java
int sumArray(int[] arr) {
    int sum = 0;
    for (int num : arr) {
        sum += num;
    }
    return sum;
}
```
Bu fonksiyon **O(n)** karmaşıklığına sahiptir, çünkü dizide **n** eleman varsa, **n** kez toplama işlemi yapılır.

#### **Örnek 3: O(n²) - Karesel Zaman**
```java
void printPairs(int[] arr) {
    for (int i = 0; i < arr.length; i++) {
        for (int j = 0; j < arr.length; j++) {
            System.out.println(arr[i] + ", " + arr[j]);
        }
    }
}
```
Bu algoritma **iç içe geçmiş döngüler içerdiğinden**, **O(n²)** karmaşıklığa sahiptir. Çünkü her bir eleman için tekrar tüm elemanlar dolaşılır.

---

## **2. Uzay Karmaşıklığı (Space Complexity)**
Bir algoritmanın **çalışması için ihtiyaç duyduğu bellek miktarının**, girdi büyüklüğüne **(n)** bağlı olarak nasıl değiştiğini ifade eder.

### **Uzay Karmaşıklığı Nasıl Ölçülür?**
- Algoritmanın kullandığı **değişkenler, diziler, veri yapıları** gibi ek bellek ihtiyacını hesaplarız.
- **Big-O Notasyonu** burada da kullanılır.
- Bellek tüketimi **sabit (O(1)), doğrusal (O(n)), karesel (O(n²))** gibi değerlendirilebilir.

### **Uzay Karmaşıklığı Türleri**
| **Big-O** | **Açıklama** | **Örnek Algoritma** |
|-----------|-------------|---------------------|
| **O(1) - Sabit Uzay** | Sabit miktarda bellek kullanır. | Tek değişken kullanımı (`int a = 5;`) |
| **O(n) - Doğrusal Uzay** | Girdi büyüklüğüne bağlı olarak ek bellek kullanır. | Bir dizinin kopyalanması |
| **O(n²) - Karesel Uzay** | Bir matris gibi iç içe veri saklanması gerektiğinde ortaya çıkar. | Dinamik programlama tablosu |

---

### **Uzay Karmaşıklığı Örnekleri**
#### **Örnek 1: O(1) - Sabit Uzay**
```java
int add(int a, int b) {
    return a + b; // Sadece iki değişken kullanılıyor
}
```
Bu algoritma **O(1)** uzay karmaşıklığına sahiptir çünkü sadece **sabit** miktarda bellek kullanır.

#### **Örnek 2: O(n) - Doğrusal Uzay**
```java
int[] copyArray(int[] arr) {
    int[] newArr = new int[arr.length];
    for (int i = 0; i < arr.length; i++) {
        newArr[i] = arr[i];
    }
    return newArr;
}
```
Bu algoritma **O(n)** uzay karmaşıklığına sahiptir çünkü **n** elemanlık yeni bir dizi oluşturuyor.

#### **Örnek 3: O(n²) - Karesel Uzay**
```java
int[][] createMatrix(int n) {
    int[][] matrix = new int[n][n];  // n*n boyutunda matris
    return matrix;
}
```
Bu algoritma **O(n²)** uzay karmaşıklığına sahiptir, çünkü **n × n** boyutunda bir matris bellekte tutulur.

---

## **Özet**
| **Kavram** | **Tanım** | **Ölçüm Kriteri** | **Örnek Algoritmalar** |
|-----------|----------|----------------|----------------|
| **Zaman Karmaşıklığı** | Algoritmanın çalışma süresi | İşlem sayısı (**n**'e bağlı) | Sıralama algoritmaları, arama algoritmaları |
| **Uzay Karmaşıklığı** | Algoritmanın bellek tüketimi | Ek bellek miktarı | Matris işlemleri, dinamik programlama |

### **Genel Pratikler**
1. **Zaman karmaşıklığını** optimize etmek için döngüleri azaltın, daha hızlı algoritmalar kullanın.
2. **Uzay karmaşıklığını** azaltmak için gereksiz dizi kopyalamalardan kaçının, mümkünse sabit miktarda bellek kullanın.
3. Büyük veri kümeleriyle çalışıyorsanız **O(log n) veya O(n log n) zaman karmaşıklığı** olan algoritmaları tercih edin.

Bu bilgilerle, bir algoritmanın **verimli olup olmadığını** anlayabilir ve hangi durumlarda hangi yöntemlerin daha uygun olduğunu belirleyebilirsiniz! 🚀
---

## Javada System
```sh 

```
---

Java'da `System` sınıfı, **java.lang** paketinde bulunan ve Java uygulamalarının temel sistem seviyesinde işlemler gerçekleştirmesini sağlayan bir yardımcı sınıftır. `System` sınıfı, genellikle giriş ve çıkış işlemleri, hata ayıklama, ortam değişkenleri, zaman ölçümleri, çöp toplama (garbage collection) ve sistem özelliklerine erişim gibi işlemler için kullanılır.

---

## 1. **System Sınıfının Genel Yapısı**
- `System` sınıfı **final** olarak tanımlanmıştır, yani **kalıtım alınamaz**.
- **Constructor'ı `private` olduğu için** nesne oluşturulamaz.
- Tüm metodları **static** olduğu için, doğrudan `System.method()` şeklinde çağrılır.

### **System Sınıfının Başlıca Üyeleri**
`System` sınıfının içinde bulunan **static değişkenler** ve **metodlar** şunlardır:

| Üye (Değişken/Metod) | Açıklama |
|----------------------|----------|
| `System.in`  | Konsoldan veri almak için kullanılır (InputStream). |
| `System.out` | Konsola çıktı vermek için kullanılır (PrintStream). |
| `System.err` | Hata mesajlarını göstermek için kullanılır (PrintStream). |
| `System.exit(int status)` | Programı sonlandırır. |
| `System.gc()` | Garbage Collector'ı çağırır. |
| `System.nanoTime()` | Yüksek çözünürlüklü zaman ölçümü yapar. |
| `System.currentTimeMillis()` | Geçerli zamanı alır (Unix Epoch Time). |
| `System.getProperty(String key)` | Sistem özelliklerini getirir. |
| `System.setProperty(String key, String value)` | Sistem özelliklerini ayarlar. |
| `System.getenv(String name)` | Ortam değişkenlerini getirir. |
| `System.arraycopy(Object src, int srcPos, Object dest, int destPos, int length)` | Diziler arasında hızlı kopyalama yapar. |

---

## 2. **System Sınıfı İçindeki Önemli Değişkenler**
### 2.1. **`System.in` (Standart Giriş)**
- `System.in`, standart giriş akışıdır (`InputStream` tipindedir).
- Kullanıcıdan veri almak için **`Scanner`** veya **`BufferedReader`** ile kullanılabilir.

**Örnek: Kullanıcıdan veri alma**
```java
import java.util.Scanner;

public class SystemInExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Bir şey yazın: ");
        String input = scanner.nextLine();
        System.out.println("Girdiğiniz: " + input);
        scanner.close();
    }
}
```

---

### 2.2. **`System.out` (Standart Çıkış)**
- `System.out`, **standart çıkış** nesnesidir (`PrintStream`).
- `print()`, `println()` ve `printf()` metodları ile çıktı yazdırılabilir.

**Örnek: Konsola çıktı yazdırma**
```java
public class SystemOutExample {
    public static void main(String[] args) {
        System.out.println("Merhaba, Dünya!");
        System.out.print("Yan yana yazılır.");
        System.out.printf("\nFormatlı yazdırma: %d + %d = %d", 5, 3, 5+3);
    }
}
```

---

### 2.3. **`System.err` (Hata Çıkışı)**
- `System.err`, hata mesajlarını göstermek için kullanılır (`PrintStream`).
- `System.out` ile aynı işlevdedir ama genellikle **hataları loglamak** için kullanılır.

**Örnek: Hata mesajı yazdırma**
```java
public class SystemErrExample {
    public static void main(String[] args) {
        System.err.println("Bu bir hata mesajıdır!");
    }
}
```

---

## 3. **Sistemle İlgili Bilgilere Erişim**
### 3.1. **System.getProperty() Kullanımı**
- Java'nın çalıştığı sistem hakkında bilgi almak için kullanılır.

**Örnek: Sistem bilgilerini alma**
```java
public class SystemPropertiesExample {
    public static void main(String[] args) {
        System.out.println("Java Versiyonu: " + System.getProperty("java.version"));
        System.out.println("OS Adı: " + System.getProperty("os.name"));
        System.out.println("Kullanıcı Adı: " + System.getProperty("user.name"));
        System.out.println("Çalışma Dizini: " + System.getProperty("user.dir"));
    }
}
```

### 3.2. **System.getenv() Kullanımı**
- Ortam değişkenlerini almak için kullanılır.

**Örnek: Ortam değişkenlerini alma**
```java
public class SystemEnvExample {
    public static void main(String[] args) {
        System.out.println("PATH: " + System.getenv("PATH"));
        System.out.println("JAVA_HOME: " + System.getenv("JAVA_HOME"));
    }
}
```

---

## 4. **Garbage Collector'ı Çalıştırma**
- `System.gc()` metodu **çöp toplayıcının çalışmasını önerebilir**, ancak garanti vermez.

**Örnek: Bellek temizleme çağrısı**
```java
public class GarbageCollectorExample {
    public static void main(String[] args) {
        System.out.println("Çöp toplama çağrısı yapılıyor...");
        System.gc();
    }
}
```

---

## 5. **Zaman Ölçme**
### 5.1. **System.currentTimeMillis()**
- Milisaniye cinsinden **geçerli zaman damgası** alır.

**Örnek: Zaman hesaplama**
```java
public class TimeExample {
    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        
        // 1 milyon döngü çalıştır
        for (int i = 0; i < 1_000_000; i++) { }

        long end = System.currentTimeMillis();
        System.out.println("Geçen süre: " + (end - start) + " ms");
    }
}
```

### 5.2. **System.nanoTime()**
- **Daha hassas** zaman ölçümü yapar.

**Örnek: Nano zaman hesaplama**
```java
public class NanoTimeExample {
    public static void main(String[] args) {
        long start = System.nanoTime();

        for (int i = 0; i < 1_000_000; i++) { }

        long end = System.nanoTime();
        System.out.println("Geçen süre: " + (end - start) + " ns");
    }
}
```

---

## 6. **Dizi Kopyalama**
- `System.arraycopy()` metodu, diziler arasında **hızlı kopyalama** yapar.

**Örnek: Dizi elemanlarını kopyalama**
```java
public class ArrayCopyExample {
    public static void main(String[] args) {
        int[] kaynak = {1, 2, 3, 4, 5};
        int[] hedef = new int[5];

        System.arraycopy(kaynak, 0, hedef, 0, 5);

        for (int num : hedef) {
            System.out.print(num + " ");
        }
    }
}
```

---

## 7. **Programdan Çıkış Yapma**
- `System.exit(int status)`, programı **belirtilen durum koduyla sonlandırır**.
- **0 başarıyla çıkış**, **1 hata nedeniyle çıkış** anlamına gelir.

**Örnek: Programdan çıkma**
```java
public class SystemExitExample {
    public static void main(String[] args) {
        System.out.println("Program sonlandırılıyor...");
        System.exit(0);
    }
}
```

---

### **Sonuç**
`System` sınıfı, **giriş-çıkış işlemleri, hata mesajları, sistem bilgileri, zaman ölçümü, dizi kopyalama ve programdan çıkış** gibi birçok önemli işlevi kapsayan güçlü bir yardımcı sınıftır. Java programlarında sıkça kullanılan bu sınıfın işlevlerini iyi anlamak, yazılım geliştirmede büyük kolaylık sağlar.


## Javada break ile System.exit(0) Arasındaki Farklar
```sh 

```
---
Java'da `break` ve `System.exit(0)` ifadeleri, programın akışını kontrol etmek için kullanılır, ancak ikisi arasında önemli farklar vardır. İşte temel farklar:

---

## 1. **Temel Farklar**

| Özellik | `break` | `System.exit(0)` |
|---------|--------|-----------------|
| **Kullanım Alanı** | Döngüler (`for`, `while`, `do-while`) ve `switch-case` blokları içinde kullanılır. | Programın tamamını sonlandırır. |
| **Ne Yapıyor?** | Sadece **içinde bulunduğu döngüyü veya switch-case'i** kırar ve bir sonraki satırdan devam eder. | Programı tamamen kapatır ve çalışmasını durdurur. |
| **Etki Alanı** | Yalnızca bulunduğu döngü veya switch bloğunu etkiler. | JVM'yi kapatarak programı tamamen sonlandırır. |
| **Geri Dönüş Değeri (Exit Code)** | Yoktur. | Parametre olarak verilen exit koduna göre sistem çıkış kodu belirlenir. |
| **Try-Finally Bloklarında Davranış** | `break` çalışsa bile `finally` bloğu her zaman çalışır. | `System.exit(0)` çağrıldığında, `finally` bloğu garanti edilmez, bazen çalıştırılmadan çıkış yapılabilir. |

---

## 2. **`break` Kullanımı**

- `break`, **yalnızca döngüleri ve switch-case bloklarını kırmak** için kullanılır. Döngüden çıkıldığında program çalışmaya devam eder.

**Örnek 1: Döngüde `break` Kullanımı**
```java
public class BreakExample {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            if (i == 3) {
                break; // 3 olduğunda döngüyü sonlandırır
            }
            System.out.println("i: " + i);
        }
        System.out.println("Döngüden çıkıldı."); // Döngü sonrası çalışmaya devam eder
    }
}
```
**Çıktı:**
```
i: 1
i: 2
Döngüden çıkıldı.
```

**Örnek 2: `switch-case` ile `break` Kullanımı**
```java
public class SwitchBreakExample {
    public static void main(String[] args) {
        int sayi = 2;
        switch (sayi) {
            case 1:
                System.out.println("Sayı 1");
                break;
            case 2:
                System.out.println("Sayı 2");
                break; // Burada kırılır, sonraki case çalışmaz
            case 3:
                System.out.println("Sayı 3");
                break;
            default:
                System.out.println("Bilinmeyen sayı");
        }
    }
}
```
**Çıktı:**
```
Sayı 2
```
Burada `break` olmasaydı, `case 3` de çalışmaya devam ederdi.

---

## 3. **`System.exit(0)` Kullanımı**
- `System.exit(0)`, programın **tamamını sonlandırır** ve JVM'yi kapatır.
- `exit(0)`: **Başarılı çıkışı** ifade eder.
- `exit(1)`, `exit(-1)`, `exit(2)`, vb.: **Hata kodlarıdır**, genellikle bir hata olduğunda sistem tarafından kullanılır.

**Örnek 1: Programı Sonlandırma**
```java
public class ExitExample {
    public static void main(String[] args) {
        System.out.println("Program başlıyor...");
        
        System.exit(0); // Program burada tamamen sonlanır
        
        System.out.println("Bu satır çalışmaz.");
    }
}
```
**Çıktı:**
```
Program başlıyor...
```
Görüldüğü gibi, `System.exit(0)` çağrıldığında, ondan sonraki kodlar çalışmaz.

---

## 4. **`break` ve `System.exit(0)` Farklı Davranışları**
### **4.1. Döngü İçinde Kullanım**
**`break` sadece döngüden çıkar, ama program çalışmaya devam eder:**
```java
public class BreakVsExit {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            if (i == 3) {
                break; // Sadece döngüden çıkar
            }
            System.out.println("i: " + i);
        }
        System.out.println("Döngüden sonra çalışmaya devam eder.");
    }
}
```
**Çıktı:**
```
i: 1
i: 2
Döngüden sonra çalışmaya devam eder.
```

**`System.exit(0)` programı tamamen kapatır:**
```java
public class BreakVsExit {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            if (i == 3) {
                System.exit(0); // Programı tamamen kapatır
            }
            System.out.println("i: " + i);
        }
        System.out.println("Bu satır çalışmaz.");
    }
}
```
**Çıktı:**
```
i: 1
i: 2
```
Gördüğünüz gibi, `System.exit(0)` çağrıldıktan sonra **program tamamen durduğu için** döngüden sonra kodlar çalışmaz.

---

### **4.2. `finally` Blokları ile Farklılık**
- `break` kullanıldığında `finally` bloğu **her zaman çalışır**.
- `System.exit(0)` kullanıldığında `finally` bloğu **çalışmayabilir**.

**`break` ile `finally` her zaman çalışır:**
```java
public class BreakFinallyExample {
    public static void main(String[] args) {
        try {
            for (int i = 1; i <= 5; i++) {
                if (i == 3) {
                    break;
                }
                System.out.println("i: " + i);
            }
        } finally {
            System.out.println("Finally bloğu çalıştı.");
        }
    }
}
```
**Çıktı:**
```
i: 1
i: 2
Finally bloğu çalıştı.
```

**`System.exit(0)` ile `finally` bloğu çalışmayabilir:**
```java
public class ExitFinallyExample {
    public static void main(String[] args) {
        try {
            System.out.println("Program başlıyor...");
            System.exit(0);
        } finally {
            System.out.println("Finally bloğu çalıştı."); // Çalışmayabilir
        }
    }
}
```
**Çıktı:**
```
Program başlıyor...
```
Burada `finally` bloğu büyük olasılıkla çalışmaz çünkü JVM kapatılmıştır.

---

## 5. **Özet ve Karşılaştırma**
| **Özellik** | **break** | **System.exit(0)** |
|------------|----------|-------------------|
| **Ne yapar?** | Döngüyü veya switch-case bloğunu kırar. | Programı tamamen kapatır. |
| **Etki Alanı** | Sadece ilgili döngüyü etkiler. | JVM'yi kapatır, program tamamen durur. |
| **Kullanıldığı Yer** | Döngüler (`for`, `while`, `do-while`) ve `switch-case` | Her yerde kullanılabilir. |
| **Sonraki kod çalışır mı?** | Evet, sadece döngüden sonra devam eder. | Hayır, `exit(0)` sonrası kod çalışmaz. |
| **finally bloğu çalışır mı?** | Evet. | Çalışmayabilir. |
| **Çıkış kodu** | Yoktur. | `exit(0)`, `exit(1)`, `exit(-1)` gibi değerler döndürebilir. |

**Sonuç olarak**, `break` yalnızca döngüleri veya switch-case yapısını kırarken, `System.exit(0)` programın tamamını durdurarak JVM'yi kapatır.

## Erişim Belirleyiciler Devam-1
```sh 

```
---
# **Java'da Access Modifier (Erişim Belirleyiciler) Detaylı Anlatım**

Java'da **access modifier (erişim belirleyiciler)**, bir sınıfın, değişkenin, metodun veya yapıcı (constructor) metodun **nerelerden erişilebileceğini** belirler. Erişim belirleyiciler, **nesne yönelimli programlama (OOP) prensipleri** gereği **bilgi gizleme (encapsulation)** sağlamak için kullanılır.

Java'da **dört** temel erişim belirleyici vardır:

| **Modifier** | **Açıklama** | **Aynı Sınıf** | **Aynı Paket** | **Farklı Paket - Alt Sınıf** | **Farklı Paket - Alt Sınıf Olmayan** |
|-------------|-------------|--------------|-------------|----------------------|----------------------|
| `public`    | Her yerden erişilebilir | ✅ | ✅ | ✅ | ✅ |
| `protected` | Aynı paket ve alt sınıflardan erişilebilir | ✅ | ✅ | ✅ | ❌ |
| `default` (Hiçbir şey yazılmaz) | Sadece aynı paket içinden erişilebilir | ✅ | ✅ | ❌ | ❌ |
| `private`   | Sadece tanımlandığı sınıf içinden erişilebilir | ✅ | ❌ | ❌ | ❌ |

---

## **1. `public` Access Modifier**
**`public` anahtar kelimesi, bir sınıf, metod veya değişkenin her yerden erişilebilir olmasını sağlar.**

📌 **Kullanım Alanları:**
- Genel (public) API'ler oluştururken
- Sınıfların dışarıdan erişilebilir olmasını istersek
- Ana metod (`main`) için zorunludur.

### **Örnek: `public` Kullanımı**
```java
// Public Class: Her yerden erişilebilir
public class PublicExample {
    // Public Method: Her yerden erişilebilir
    public void showMessage() {
        System.out.println("Bu bir public metod!");
    }
}
```
Başka bir sınıftan erişim:
```java
public class Test {
    public static void main(String[] args) {
        PublicExample example = new PublicExample();
        example.showMessage();  // ✅ Başarıyla çalışır
    }
}
```

✅ **`public` ile tanımlanan değişken, metod veya sınıf herhangi bir paket veya sınıftan erişilebilir.**

---

## **2. `protected` Access Modifier**
**`protected` erişim belirleyicisi, aynı paketteki tüm sınıflardan ve farklı paketlerdeki alt sınıflardan erişime izin verir.**

📌 **Kullanım Alanları:**
- Kalıtım (Inheritance) kullanılarak oluşturulan alt sınıflar arasında veri paylaşımı yapmak için idealdir.
- Pakete özgü erişim sağlamak ve yalnızca alt sınıfların erişimini açmak için kullanılır.

### **Örnek: `protected` Kullanımı**
```java
package package1;

public class Parent {
    protected String protectedMessage = "Bu bir protected mesajdır!";
}
```
Başka bir sınıfta (aynı pakette):
```java
package package1;

public class SamePackageTest {
    public static void main(String[] args) {
        Parent parent = new Parent();
        System.out.println(parent.protectedMessage);  // ✅ Erişebilir
    }
}
```
Farklı bir pakette bir alt sınıf:
```java
package package2;
import package1.Parent;

public class Child extends Parent {
    public void display() {
        System.out.println(protectedMessage);  // ✅ Erişebilir (Kalıtım olduğu için)
    }
}
```
Farklı pakette ve **kalıtım (extends) olmadan** erişmeye çalışırsak:
```java
package package2;
import package1.Parent;

public class Test {
    public static void main(String[] args) {
        Parent parent = new Parent();
        System.out.println(parent.protectedMessage);  // ❌ Hata! (Protected erişim yok)
    }
}
```
✅ **Özet:**
- Aynı pakette **herkes erişebilir.**
- Farklı pakette yalnızca **alt sınıflar erişebilir.**

---

## **3. `default` (Paket-Özel) Access Modifier**
**Eğer bir erişim belirleyici belirtilmezse (`public`, `protected`, `private` yazılmazsa), Java bunu `default` olarak kabul eder.**  
Bu durumda **yalnızca aynı paketteki sınıflar erişebilir, farklı paketlerdeki sınıflar erişemez.**

📌 **Kullanım Alanları:**
- Yalnızca bir paketin içinde çalışacak bileşenler oluştururken
- Modüler bir yapı içinde, dış paketlerden erişimi kısıtlamak için

### **Örnek: `default` Kullanımı**
```java
package package1;

class DefaultExample {
    void showMessage() {
        System.out.println("Bu bir default metod!");
    }
}
```
Aynı pakette başka bir sınıftan erişim:
```java
package package1;

public class SamePackageTest {
    public static void main(String[] args) {
        DefaultExample example = new DefaultExample();
        example.showMessage();  // ✅ Erişebilir
    }
}
```
Farklı paketten erişmeye çalışırsak:
```java
package package2;
import package1.DefaultExample;

public class Test {
    public static void main(String[] args) {
        DefaultExample example = new DefaultExample();  // ❌ Hata! (default erişim yok)
    }
}
```
✅ **Özet:**
- **Aynı paketten erişilebilir.**
- **Farklı paketlerden erişilemez.**

---

## **4. `private` Access Modifier**
**`private` ile tanımlanan değişkenler, metotlar ve constructor’lar yalnızca tanımlandıkları sınıf içinde erişilebilir.**  
Dış sınıflar veya alt sınıflar **kesinlikle erişemez**.

📌 **Kullanım Alanları:**
- **Encapsulation (Kapsülleme)** sağlamak için
- Dışarıdan erişilmesini istemediğimiz verileri saklamak için

### **Örnek: `private` Kullanımı**
```java
public class PrivateExample {
    private String secretMessage = "Bu bir private mesajdır!";

    private void showMessage() {
        System.out.println(secretMessage);
    }

    public void accessPrivateMethod() {
        showMessage();  // Sınıf içinden erişim var
    }
}
```
Başka bir sınıftan erişmeye çalışırsak:
```java
public class Test {
    public static void main(String[] args) {
        PrivateExample example = new PrivateExample();
        System.out.println(example.secretMessage);  // ❌ Hata! (Private değişkene erişim yok)
        example.showMessage();  // ❌ Hata! (Private metoda erişim yok)
    }
}
```
✅ **Çözüm:** `getter` ve `setter` metodları kullanarak erişim sağlamak:
```java
public class PrivateExample {
    private String secretMessage = "Bu bir private mesajdır!";

    public String getSecretMessage() {
        return secretMessage;  // Getter metodu
    }
}
```
Başka bir sınıfta:
```java
public class Test {
    public static void main(String[] args) {
        PrivateExample example = new PrivateExample();
        System.out.println(example.getSecretMessage());  // ✅ Getter ile erişim var
    }
}
```
✅ **Özet:**
- `private` olan bir değişken veya metoda **yalnızca aynı sınıf içerisinden** erişilebilir.

---

## **Sonuç ve Karşılaştırma**
| Modifier | Aynı Sınıf | Aynı Paket | Farklı Paket (Alt Sınıf) | Farklı Paket (Alt Sınıf Olmayan) |
|----------|-----------|------------|-----------------|------------------|
| `public` | ✅ | ✅ | ✅ | ✅ |
| `protected` | ✅ | ✅ | ✅ | ❌ |
| `default` | ✅ | ✅ | ❌ | ❌ |
| `private` | ✅ | ❌ | ❌ | ❌ |

Bu detaylı anlatım, **Java'daki erişim belirleyicilerin kullanımını** tam anlamıyla kavramanızı sağlayacaktır. 🚀

## Erişim Belirleyiciler Devam-2
```sh 

```
---
# **📌 Java'da Paketler (Packages) ve Erişim Belirleyiciler (Access Modifiers) Nedir? (Detaylı Açıklama)**

Java'da **paketler (packages)** ve **erişim belirleyiciler (access modifiers)**, programların düzenlenmesi, modüler hale getirilmesi ve **erişim kontrolü** sağlanması için kullanılan iki temel yapıdır.

---

# **🔹 1. Java'da Paketler (Packages) Nedir?**
**📌 Paket (Package)**, **benzer sınıfları (class), arayüzleri (interface) ve diğer bileşenleri bir arada tutan** bir dizin yapısıdır.  
Paketler sayesinde:
- **Kod daha düzenli hale gelir.**
- **Ad çakışmaları (name conflict) önlenir.**
- **Erişim belirleyicilerle güvenlik sağlanır.**
- **Yeniden kullanılabilir bileşenler oluşturulabilir.**

---

## **🔸 1.1 Paket Tanımlama ve Kullanımı**
Bir Java dosyasında paketi belirlemek için **`package`** anahtar kelimesi kullanılır. **Dosyanın en üstüne yazılmalıdır.**

```java
package com.ornek.paket; // Paketin tanımlanması

public class Selam {
    public void mesaj() {
        System.out.println("Merhaba, paket kullanımı!");
    }
}
```
📌 **Paket ismi, genellikle ters domain adı şeklinde belirlenir.**  
Örneğin:
- **`package com.google.search;`**
- **`package org.apache.commons;`**

---

## **🔸 1.2 Paket İçindeki Sınıfı Kullanma (`import`)**
Başka bir paketten bir sınıf kullanmak için **`import`** ifadesi kullanılır.

```java
import com.ornek.paket.Selam; // Paket içindeki sınıfı dahil ettik

public class Main {
    public static void main(String[] args) {
        Selam nesne = new Selam();
        nesne.mesaj();
    }
}
```
📌 **Eğer aynı paketteysek, `import` kullanmadan doğrudan sınıfı çağırabiliriz.**

---

## **🔸 1.3 Tüm Paket İçeriğini Dahil Etme**
Eğer bir paketin **tüm sınıflarını** kullanmak istiyorsak, `*` karakterini kullanabiliriz.

```java
import com.ornek.paket.*;

public class Main {
    public static void main(String[] args) {
        Selam nesne = new Selam();
        nesne.mesaj();
    }
}
```
📌 **Ancak, `import` ile sadece kullanılacak sınıfları dahil etmek daha performanslıdır.**

---

## **🔸 1.4 `static import` ile Metotları ve Değişkenleri Dahil Etme**
Bazı durumlarda, **sınıf adını yazmadan doğrudan bir metot veya değişkene erişmek için `static import` kullanılabilir**.

```java
import static java.lang.Math.*;

public class MathExample {
    public static void main(String[] args) {
        System.out.println(sqrt(25)); // 5.0
        System.out.println(pow(2, 3)); // 8.0
    }
}
```
📌 **Normalde `Math.sqrt(25)` şeklinde çağırılır. Ancak `static import` sayesinde `sqrt(25)` olarak doğrudan çağrılabilir.**

---

## **🔸 1.5 Varsayılan Paket (Default Package)**
Eğer **`package` ifadesi kullanılmazsa**, sınıf **varsayılan pakette (default package)** olur.  
Ancak **varsayılan paket kullanımı büyük projelerde önerilmez**.

```java
public class Varsayilan {
    public void mesaj() {
        System.out.println("Varsayılan paket içindeyim.");
    }
}
```

Bu sınıf, **herhangi bir pakete ait olmadığı için diğer paketler tarafından doğrudan kullanılamaz**.

---

# **🔹 2. Java’da Erişim Belirleyiciler (Access Modifiers)**
Erişim belirleyiciler, **sınıf, metot ve değişkenlerin erişim seviyelerini belirler**.

## **🔸 2.1 Java'daki Erişim Belirleyiciler**
| **Erişim Belirleyici** | **Açıklama** | **Aynı Sınıf** | **Aynı Paket** | **Alt Sınıflar (Inheritance)** | **Diğer Paketler** |
|----------------|----------------------------------------|:------------:|:------------:|:------------------:|:--------------:|
| **`public`**  | **Her yerden erişilebilir.** | ✅ | ✅ | ✅ | ✅ |
| **`private`** | **Sadece tanımlandığı sınıfta erişilebilir.** | ✅ | ❌ | ❌ | ❌ |
| **`protected`** | **Aynı paket ve alt sınıflardan erişilebilir.** | ✅ | ✅ | ✅ | ❌ |
| **Varsayılan (default)** | **Sadece aynı paket içindeki sınıflar erişebilir.** | ✅ | ✅ | ❌ | ❌ |

---

## **🔸 2.2 `public` Erişim Belirleyici**
- **Tüm sınıflardan erişilebilir**.
- **Global kullanılacak metotlar ve sınıflar genellikle `public` olarak tanımlanır.**

```java
package com.ornek;

public class PublicOrnek {
    public String mesaj = "Bu bir public değişkendir.";

    public void goster() {
        System.out.println(mesaj);
    }
}
```
Başka bir sınıfta:
```java
import com.ornek.PublicOrnek;

public class Main {
    public static void main(String[] args) {
        PublicOrnek nesne = new PublicOrnek();
        nesne.goster();
    }
}
```
📌 **Başka paketlerden bile erişilebilir.**

---

## **🔸 2.3 `private` Erişim Belirleyici**
- **Sadece tanımlandığı sınıf içinde erişilebilir**.
- **Dışarıdan çağrılamaz**.

```java
class PrivateOrnek {
    private String gizliMesaj = "Bu bir private değişkendir.";

    private void goster() {
        System.out.println(gizliMesaj);
    }
}
```
📌 **Başka sınıflardan `gizliMesaj` veya `goster()` metoduna erişilemez.**

🚫 **Yanlış Kullanım:**
```java
PrivateOrnek nesne = new PrivateOrnek();
nesne.goster(); // HATA! Erişim engellendi.
```

📌 **Ancak `getter` ve `setter` metotları ile erişim sağlanabilir.**
```java
class PrivateOrnek {
    private String gizliMesaj = "Bu bir private değişkendir.";

    public String getMesaj() {
        return gizliMesaj;
    }
}
```

---

## **🔸 2.4 `protected` Erişim Belirleyici**
- **Aynı paketteki sınıflar ve alt sınıflar (subclass) erişebilir**.
- **Farklı paketlerden sadece `extends` ile türetilen sınıflar erişebilir.**

```java
package com.ornek;

public class ProtectedOrnek {
    protected String mesaj = "Bu bir protected değişkendir.";
}
```
Başka bir paket içindeki **alt sınıfta (subclass) kullanılabilir**:
```java
import com.ornek.ProtectedOrnek;

public class AltSinif extends ProtectedOrnek {
    public void yazdir() {
        System.out.println(mesaj);
    }
}
```

📌 **Ancak `new` ile nesne oluşturulursa erişilemez!**
```java
ProtectedOrnek nesne = new ProtectedOrnek();
System.out.println(nesne.mesaj); // HATA! Çünkü başka paketteyiz.
```

---

## **🔸 2.5 Varsayılan (Default) Erişim**
- **Eğer erişim belirleyici yazılmazsa, sadece aynı paketteki sınıflar erişebilir.**

```java
class DefaultOrnek {
    String mesaj = "Bu bir varsayılan (default) değişkendir.";
}
```
Başka bir pakette:
```java
DefaultOrnek nesne = new DefaultOrnek(); // HATA! Çünkü başka paketteyiz.
```

---

# **📌 Sonuç ve Karşılaştırma**
| **Erişim Belirleyici** | **Sınıf İçinden** | **Aynı Paketten** | **Alt Sınıflardan (Inheritance)** | **Diğer Paketlerden** |
|----------------|--------------|------------|----------------------|--------------|
| **`public`** | ✅ | ✅ | ✅ | ✅ |
| **`private`** | ✅ | ❌ | ❌ | ❌ |
| **`protected`** | ✅ | ✅ | ✅ | ❌ |
| **Varsayılan (default)** | ✅ | ✅ | ❌ | ❌ |

**📌 Paketler ve erişim belirleyiciler, Java’da kodun organize edilmesi ve güvenliği açısından büyük önem taşır! 🚀**



## Javada Class Tanımı
```sh 

```
---

# **Java'da Class (Sınıf) Tanımı - Detaylı Açıklama**

## **1. Class (Sınıf) Nedir?**
Java'da **class (sınıf)**, **nesne yönelimli programlama (OOP)** yaklaşımında **nesnelerin şablonu** veya **kalıbı** olarak kullanılır.  
Bir sınıf; **verileri (değişkenler)** ve **bu verilere uygulanan işlemleri (metodlar)** içinde barındıran bir yapıdır.

Sınıflar sayesinde **kod tekrarını önleyerek** daha **düzenli, modüler ve ölçeklenebilir yazılım** geliştirilir.

### **Özetle bir sınıf:**
- **Özellikler (attributes/fields)**
- **Davranışlar (methods/behaviors)**
- **Kapsülleme (Encapsulation)**
- **Soyutlama (Abstraction)**

İçerir ve **nesne** (object) oluşturmak için bir **şablon** görevi görür.

---

## **2. Java'da Sınıf Tanımlama**
Java'da bir sınıf tanımlamak için `class` anahtar kelimesi kullanılır:

### **Temel Sınıf Tanımı**
```java
class Araba {
    // Özellikler (Fields)
    String marka;
    String model;
    int yil;

    // Metotlar (Davranışlar)
    void bilgileriGoster() {
        System.out.println("Marka: " + marka);
        System.out.println("Model: " + model);
        System.out.println("Yıl: " + yil);
    }
}
```
Bu sınıf, **Araba (Car)** isimli bir nesne oluşturmak için kullanılabilir.

---

## **3. Nesne (Object) Oluşturma**
Bir sınıftan nesne türetmek için `new` anahtar kelimesi kullanılır.

### **Örnek: `Araba` Sınıfından Nesne Oluşturma**
```java
public class Main {
    public static void main(String[] args) {
        // Araba sınıfından bir nesne oluşturma
        Araba araba1 = new Araba();
        
        // Nesne özelliklerine değer atama
        araba1.marka = "Toyota";
        araba1.model = "Corolla";
        araba1.yil = 2022;
        
        // Metodu çağırma
        araba1.bilgileriGoster();
    }
}
```
📌 **Çıktı:**
```
Marka: Toyota
Model: Corolla
Yıl: 2022
```
Bu kodda, `Araba` sınıfından `araba1` isimli bir nesne oluşturulmuş ve bu nesnenin **özellikleri atanarak** ekrana yazdırılmıştır.

---

## **4. Constructor (Yapıcı Metot) Kullanımı**
Java'da bir sınıfın nesnesi oluşturulurken **otomatik olarak çalışan özel bir metod** vardır, buna **constructor (yapıcı metot)** denir.

### **Constructor Tanımı**
- **Nesne oluşturulduğunda çağrılır.**
- **Sınıf ismi ile aynı olmalıdır.**
- **Geri dönüş tipi (return type) içermez.**
- **Parametre alarak nesneye ilk değerleri atayabilir.**

### **Örnek: Constructor Kullanımı**
```java
class Araba {
    String marka;
    String model;
    int yil;

    // Yapıcı Metot (Constructor)
    Araba(String marka, String model, int yil) {
        this.marka = marka;
        this.model = model;
        this.yil = yil;
    }

    void bilgileriGoster() {
        System.out.println("Marka: " + marka);
        System.out.println("Model: " + model);
        System.out.println("Yıl: " + yil);
    }
}

public class Main {
    public static void main(String[] args) {
        // Constructor ile nesne oluşturma
        Araba araba1 = new Araba("BMW", "X5", 2023);
        araba1.bilgileriGoster();
    }
}
```
📌 **Çıktı:**
```
Marka: BMW
Model: X5
Yıl: 2023
```
Bu kodda **constructor** sayesinde `araba1` nesnesi oluşturulurken **ilk değerler atanmış** oldu.

---

## **5. Access Modifiers (Erişim Belirleyiciler) ile Sınıf Kullanımı**
Erişim belirleyiciler (`public`, `private`, `protected`, `default`) sınıfın bileşenlerine **erişimi kontrol eder**.

### **Özel Değişkenler ve Getter-Setter Kullanımı**
Genellikle **kapsülleme (encapsulation)** için **değişkenler `private` yapılır** ve dışarıdan erişim `getter` ve `setter` metotları ile sağlanır.

```java
class Araba {
    private String marka;
    private String model;
    private int yil;

    // Constructor
    Araba(String marka, String model, int yil) {
        this.marka = marka;
        this.model = model;
        this.yil = yil;
    }

    // Getter metodu (Bilgi almak için)
    public String getMarka() {
        return marka;
    }

    public String getModel() {
        return model;
    }

    public int getYil() {
        return yil;
    }

    // Setter metodu (Değer değiştirmek için)
    public void setYil(int yil) {
        if (yil > 1885) { // İlk otomobil 1886'da üretildi, mantıklı bir kontrol ekleyelim.
            this.yil = yil;
        } else {
            System.out.println("Geçersiz yıl!");
        }
    }

    void bilgileriGoster() {
        System.out.println("Marka: " + marka);
        System.out.println("Model: " + model);
        System.out.println("Yıl: " + yil);
    }
}

public class Main {
    public static void main(String[] args) {
        Araba araba1 = new Araba("Mercedes", "E-Class", 2022);
        
        // Getter kullanarak değerleri al
        System.out.println("Marka: " + araba1.getMarka());
        System.out.println("Model: " + araba1.getModel());
        System.out.println("Yıl: " + araba1.getYil());

        // Setter ile yıl değerini değiştirelim
        araba1.setYil(2025);
        System.out.println("Güncellenmiş Yıl: " + araba1.getYil());
    }
}
```
📌 **Çıktı:**
```
Marka: Mercedes
Model: E-Class
Yıl: 2022
Güncellenmiş Yıl: 2025
```
Burada **getter ve setter metotları** kullanarak `private` olan değişkenlere güvenli bir şekilde erişim sağladık.

---

## **6. Kalıtım (Inheritance) ile Sınıf Kullanımı**
Java’da **bir sınıf başka bir sınıfın özelliklerini ve metotlarını miras alabilir.**  
Bu işleme **kalıtım (inheritance)** denir ve `extends` anahtar kelimesi kullanılır.

### **Örnek: Kalıtım Kullanımı**
```java
// Üst Sınıf (Parent Class)
class Arac {
    String yakitTuru = "Benzin";
    
    void hareketEt() {
        System.out.println("Araç hareket ediyor...");
    }
}

// Alt Sınıf (Child Class) - Arac sınıfından miras alır
class Araba extends Arac {
    int kapiSayisi = 4;

    void bilgileriGoster() {
        System.out.println("Yakıt Türü: " + yakitTuru);
        System.out.println("Kapı Sayısı: " + kapiSayisi);
    }
}

public class Main {
    public static void main(String[] args) {
        Araba araba = new Araba();
        araba.hareketEt();  // Üst sınıf metodunu çağırdı
        araba.bilgileriGoster();
    }
}
```
📌 **Çıktı:**
```
Araç hareket ediyor...
Yakıt Türü: Benzin
Kapı Sayısı: 4
```
✅ **Özet:** Kalıtım sayesinde **`Arac` sınıfının özelliklerini `Araba` sınıfına miras aldık** ve kod tekrarını önledik.

---

## **Sonuç**
- **Sınıflar**, Java'da nesne yönelimli programlamanın temel taşlarıdır.
- **Nesneler**, sınıflardan türetilir.
- **Encapsulation (kapsülleme)** ile veri güvenliği sağlanır.
- **Inheritance (kalıtım)** ile kod tekrarını azaltabiliriz.
- **Constructor** kullanarak nesneleri başlatabiliriz.

Java'da sınıflar, büyük ölçekli projelerde **düzeni ve okunabilirliği artırarak** programlamayı daha etkili hale getirir. 🚀

## if(name!=null && !name.isEmpty())
```sh 

```
---

Kodunuzdaki şu satır:

```java
if(name!=null && !name.isEmpty())
```

### **Ne İşe Yarar?**
Bu kod, `name` değişkeninin **boş (empty) veya null olup olmadığını kontrol eder**.

1. **`name != null`**
    - Eğer `name` değişkeni `null` ise, `NullPointerException` hatasını önlemek için işlem yapmadan devam eder.

2. **`!name.isEmpty()`**
    - `name` değişkeni boş bir string (`""`) içeriyorsa, işlemi yapmadan devam eder. `isEmpty()` metodu, stringin **hiçbir karakter içermediğini** kontrol eder.

### **Örnek Senaryolar**
| `name` Değeri     | `name != null` | `!name.isEmpty()` | Koşul Sonucu (`true/false`) |
|-------------------|--------------|-----------------|-----------------|
| `"Hamit"`        | `true`       | `true`          | ✅ `true` (Çalışır) |
| `""` (boş string) | `true`       | `false`         | ❌ `false` (Çalışmaz) |
| `null`           | `false`      | (Kontrol edilmez) | ❌ `false` (Çalışmaz) |

### **Neden Kullanılır?**
- **NullPointerException hatasından kaçınmak için.**
- **Boş string üzerinde gereksiz işlemler yapmamak için.**

Bu sayede `setName` metodunda `null` veya boş bir string girişi olduğunda hatasız bir şekilde `" "` olarak atanmasını sağlayabiliriz.

## POJO
```sh 

```
---
### **Java'da POJO (Plain Old Java Object) Nedir?**

POJO, **"Plain Old Java Object"** teriminin kısaltmasıdır ve özellikle Java dünyasında, basit, standart Java sınıflarını tanımlamak için kullanılır. POJO'lar, belirli bir çerçeveye (framework) veya Java'nın özel kütüphanelerine bağlı olmayan, genellikle yalnızca değişkenler (fields), getter ve setter metodları, yapıcı metodlar (constructors) ve bazı temel işlemleri içeren sınıflardır.

---

## **POJO'nun Genel Özellikleri**
POJO sınıfları, bazı temel özellikleri taşımalıdır:

1. **Java SE Bağımsızdır:** POJO sınıfları, Java SE'nin (Java Standard Edition) temel özelliklerine dayanır ve özel bir kütüphaneye veya API'ye bağımlı olmadan çalışabilir.
2. **Getter ve Setter Metodları İçerir:** Nesne özelliklerine erişmek ve değiştirmek için getter ve setter metodları kullanılabilir.
3. **Constructor (Yapıcı Metod) Bulundurur:** Parametreli veya parametresiz yapıcı metodlar olabilir.
4. **Serileştirilebilir (Opsiyonel):** POJO nesneleri, eğer kalıcı olarak saklanacaksa veya ağ üzerinden taşınacaksa `Serializable` arayüzünü uygulayabilir.
5. **Annotations (Ek Açıklamalar) Kullanmaya Zorunlu Değildir:** POJO'lar, herhangi bir özel açıklama (annotation) kullanmak zorunda değildir.
6. **Özel Bir Kütüphaneye veya Framework’e Bağlı Değildir:** Örneğin, EJB (Enterprise Java Beans) gibi ağır yapılar içermez.
7. **İçinde İş Mantığı (Business Logic) Olmaz:** Genellikle sadece verileri tutar ve işler.

---

## **POJO'nun Kullanım Amaçları**
POJO sınıfları, genellikle veri taşımak ve depolamak için kullanılır. Bu sınıflar, veri modeli oluştururken temel taşlardır ve aşağıdaki alanlarda yaygın olarak kullanılır:

1. **Veri Transferi (DTO - Data Transfer Object)**
    - Bir katmandan diğerine veri iletmek için kullanılır.
    - Örneğin, bir veritabanından çekilen kullanıcı bilgilerini içeren bir `User` POJO nesnesi oluşturulabilir.

2. **Veritabanı İşlemleri (ORM - Object-Relational Mapping)**
    - Hibernate gibi ORM araçları, veritabanı tablolarını POJO nesneleri ile eşleştirir.
    - Örneğin, `Employee` sınıfı bir veritabanı tablosuna karşılık gelebilir.

3. **JSON veya XML Serileştirme**
    - Spring Boot ve REST API’lerde POJO nesneleri JSON veya XML olarak kullanılabilir.
    - Örneğin, bir REST API çağrısında dönen JSON verisi bir POJO nesnesine dönüştürülebilir.

4. **JavaBeans Yapısına Alternatif Olarak**
    - JavaBeans, özel kuralları (örneğin, `Serializable` olmak, varsayılan yapıcıya sahip olmak vb.) gerektiren daha ağır bir yapı sunarken, POJO'lar daha hafif ve bağımsızdır.

---

## **POJO'nun Örnek Kullanımı**

Aşağıda temel bir **POJO (Plain Old Java Object)** sınıfı örneği verilmiştir:

```java
public class Employee {
    private int id;
    private String name;
    private double salary;

    // Parametresiz Yapıcı (No-Args Constructor)
    public Employee() {}

    // Parametreli Yapıcı (All-Args Constructor)
    public Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    // Getter ve Setter Metodları
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    // toString Metodu
    @Override
    public String toString() {
        return "Employee{id=" + id + ", name='" + name + "', salary=" + salary + "}";
    }
}
```

Bu `Employee` sınıfı basit bir POJO’dur. İçinde sadece:

- `id`, `name` ve `salary` gibi alanlar (fields)
- Getter ve setter metodları
- Parametreli ve parametresiz yapıcı metodlar
- `toString()` metodu bulunur.

Herhangi bir özel çerçeveye veya kütüphaneye bağımlı değildir.

---

## **POJO ile İlgili Özel Konular**

### **1. POJO ile JavaBeans Farkı**
POJO, **JavaBeans** ile sıkça karıştırılır. Ancak aralarındaki farklar şunlardır:

| Özellik         | POJO                          | JavaBeans                      |
|----------------|--------------------------------|--------------------------------|
| Bağımsızlık    | Herhangi bir kurala bağlı değildir. | JavaBeans spesifik kurallara sahiptir. |
| Serializable   | Opsiyoneldir. | JavaBeans için zorunludur. |
| No-Arg Constructor | Opsiyoneldir. | Zorunludur. |
| Getter/Setter | Genellikle kullanılır ama zorunlu değildir. | Zorunludur. |
| Framework Kullanımı | ORM, DTO, REST API vb. | Genellikle GUI uygulamalarında kullanılır. |

### **2. POJO ve Lombok Kullanımı**
Java'da POJO sınıfları genellikle getter, setter ve constructor gibi birçok tekrar eden kod içerdiğinden, **Lombok** kütüphanesi POJO'ları daha az kod ile yazmayı sağlar.

Örneğin, yukarıdaki `Employee` sınıfını **Lombok** ile yazarsak:

```java
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Employee {
    private int id;
    private String name;
    private double salary;
}
```

Burada:
- `@Data` → Getter, Setter, `toString()`, `equals()` ve `hashCode()` metodlarını otomatik ekler.
- `@NoArgsConstructor` → Parametresiz yapıcıyı oluşturur.
- `@AllArgsConstructor` → Parametreli yapıcıyı oluşturur.

Bu sayede, POJO'nun gereksiz kodlarını yazmadan aynı fonksiyonelliği elde ederiz.

---

## **Sonuç**
POJO (Plain Old Java Object), Java'da temel veri taşıyıcı sınıfları oluşturmanın standart ve bağımsız bir yoludur. Çeşitli alanlarda, özellikle **DTO (Data Transfer Object)**, **ORM (Hibernate gibi)**, **JSON/XML Serileştirme** gibi yerlerde yaygın olarak kullanılır.

- POJO, herhangi bir özel Java kütüphanesine veya çerçeveye bağlı değildir.
- Getter ve setter metodları ile çalışır.
- JavaBeans kadar sıkı kurallara sahip değildir.
- Lombok gibi araçlarla daha az kod yazmamızı sağlar.

POJO'lar, Java uygulamalarında veri modellerini oluşturmanın en yaygın ve basit yoludur.

## BEAN
```sh 

```
---

### **Java'da Core Bean Nedir?**
Java'da **Core Bean**, genellikle Spring Framework bağlamında kullanılan bir kavramdır. **Bean**, temel olarak Spring Container tarafından yönetilen ve uygulamanın bir parçası olarak kullanılan bir nesnedir. Spring uygulamalarında, özellikle **IoC (Inversion of Control)** ve **Dependency Injection (Bağımlılık Enjeksiyonu)** mekanizmaları sayesinde Bean nesneleri merkezi bir yönetim altına alınır.

Spring Framework'ün ana bileşeni olan **ApplicationContext** veya **BeanFactory** gibi bileşenler, Core Bean'leri yönetir. Core Bean’ler, uygulamanın farklı bileşenleri arasında bağımlılıkları yönetmek için kullanılır.

---

## **1. Core Bean Kavramı**
Core Bean, genellikle aşağıdaki bileşenleri içeren temel Spring nesnelerini ifade eder:

1. **Service Beans** → İş mantığını içeren servis nesneleri.
2. **Repository Beans** → Veritabanı işlemlerini yöneten bileşenler.
3. **Controller Beans** → MVC mimarisinde kullanılan kontrol bileşenleri.
4. **Configuration Beans** → Yapılandırma ve özelleştirme bileşenleri.
5. **Component Beans** → Genel bileşen olarak kullanılan özel sınıflar.

---

## **2. Bean Tanımlama Yöntemleri**
Spring içinde bir **Core Bean** tanımlamanın birkaç yolu vardır:

### **2.1. XML Tabanlı Tanımlama**
Spring’in eski sürümlerinde Bean tanımlamak için XML kullanılıyordu.

```xml
<beans xmlns="http://www.springframework.org/schema/beans"
    xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
    xsi:schemaLocation="http://www.springframework.org/schema/beans
        http://www.springframework.org/schema/beans/spring-beans.xsd">

    <bean id="myBean" class="com.example.MyService"/>
</beans>
```
Bu XML dosyasında, `MyService` sınıfı bir Bean olarak tanımlanmıştır ve `id="myBean"` ile erişilebilir.

---

### **2.2. Java Anotasyonları ile Bean Tanımlama**
Günümüzde XML yerine anotasyon tabanlı tanımlamalar daha yaygın kullanılıyor.

#### **2.2.1. `@Component` ile Bean Tanımlama**
Spring, `@Component` anotasyonu ile sınıfları otomatik olarak bir Bean olarak yönetir.

```java
import org.springframework.stereotype.Component;

@Component
public class MyService {
    public void serve() {
        System.out.println("Service is working...");
    }
}
```
- Bu sınıf bir Bean olarak tanımlanır ve Spring tarafından otomatik olarak yönetilir.
- **Component Scanning** özelliği ile, Spring `@Component` olan sınıfları tarar ve otomatik olarak bir Bean olarak kaydeder.

---

#### **2.2.2. `@Service`, `@Repository`, `@Controller` ile Bean Tanımlama**
Spring, **Component Scanning** mekanizmasını daha anlamlı hale getirmek için aşağıdaki özel anotasyonları sağlar:

1. `@Service` → Servis katmanında kullanılan sınıflar.
2. `@Repository` → Veritabanı erişim katmanında kullanılan sınıflar.
3. `@Controller` → Web katmanında (Spring MVC) kullanılan kontrolcüler.

```java
import org.springframework.stereotype.Service;

@Service
public class UserService {
    public String getUser() {
        return "John Doe";
    }
}
```

Bu anotasyonlar da `@Component` ile aynı işlevi görür ancak semantik olarak daha anlamlıdır.

---

#### **2.2.3. `@Bean` ile Bean Tanımlama**
Spring’de Bean tanımlamanın bir başka yöntemi de **`@Bean`** anotasyonudur.

```java
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
    public MyService myService() {
        return new MyService();
    }
}
```
Burada:
- `@Configuration` sınıfı, Spring için yapılandırma sınıfı olduğunu belirtir.
- `@Bean` anotasyonu ile bir Bean nesnesi manuel olarak tanımlanmıştır.

---

## **3. Bean Yaşam Döngüsü**
Spring Bean’leri, belirli bir yaşam döngüsü içerisindedir. Bu süreç **Spring Container** tarafından yönetilir.

1. **Bean Tanımlama:** Spring, konfigürasyon dosyası veya anotasyonlar aracılığıyla Bean'i algılar.
2. **Bean Oluşturma:** Bean örneği oluşturulur (new operatörü gibi).
3. **Bağımlılıkların Enjekte Edilmesi:** `@Autowired` gibi anotasyonlarla bağımlılıklar enjekte edilir.
4. **İlk Aşama İşlemleri (Initializing Bean):** Bean ilk oluşturulduğunda bazı başlangıç işlemleri yapılır.
5. **Kullanım:** Bean, Spring Container tarafından yönetilir ve kullanılabilir hale gelir.
6. **Yıkım:** Uygulama kapanırken Bean yok edilir.

---

## **4. Bean Scope (Kapsamı)**
Spring, Bean nesneleri için farklı **kapsamlar (scope)** sunar.

### **4.1. Singleton Scope (Varsayılan)**
- **Tüm uygulama içinde yalnızca bir tane nesne oluşturulur.**
- Aynı Bean tekrar çağrılsa bile aynı nesne döndürülür.

```java
@Component
@Scope("singleton")
public class SingletonBean {
}
```

### **4.2. Prototype Scope**
- **Her çağrıldığında yeni bir nesne oluşturulur.**
- Singleton’ın aksine, her istekte yeni bir nesne döner.

```java
@Component
@Scope("prototype")
public class PrototypeBean {
}
```

### **4.3. Request Scope (Web Uygulamaları için)**
- **Her HTTP isteğinde yeni bir nesne oluşturulur.**
- Sadece Web uygulamalarında kullanılabilir.

```java
@Component
@Scope("request")
public class RequestBean {
}
```

### **4.4. Session Scope**
- **Kullanıcının oturumu boyunca tek bir nesne oluşturulur.**

```java
@Component
@Scope("session")
public class SessionBean {
}
```

---

## **5. Core Bean’lerin Kullanımı**
Bir Bean’i kullanmanın en yaygın yolu **Dependency Injection (Bağımlılık Enjeksiyonu)** ile ona erişmektir.

### **5.1. `@Autowired` ile Bean Enjekte Etme**
Spring, bağımlılıkları otomatik olarak enjekte etmek için `@Autowired` anotasyonunu kullanır.

```java
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MyController {

    private final MyService myService;

    @Autowired
    public MyController(MyService myService) {
        this.myService = myService;
    }

    public void process() {
        myService.serve();
    }
}
```

- `@Autowired`, `MyService` nesnesini otomatik olarak `MyController` içine enjekte eder.

---

## **Sonuç**
Java'da **Core Bean**, Spring Framework içerisinde merkezi bir bileşen olarak kullanılan nesnelerdir. **Dependency Injection, IoC, Bean Scope ve Yaşam Döngüsü** gibi kavramlarla entegre çalışır.

Core Bean’ler:
- XML veya Java tabanlı konfigürasyonla oluşturulabilir.
- `@Component`, `@Service`, `@Repository`, `@Controller`, `@Bean` gibi anotasyonlarla tanımlanabilir.
- Singleton, Prototype, Request, Session gibi farklı kapsamlarla kullanılabilir.
- Dependency Injection mekanizması sayesinde nesnelerin yönetimini Spring üstlenir.

Spring Core Bean mekanizması, uygulamaların yönetilebilir, modüler ve ölçeklenebilir olmasını sağlar.


## Javada static ile constructor nedir ?
```sh 

```
---

# **Java'da `static` ve `constructor` Nedir? Aralarındaki Farklar Nelerdir?**

Java’da `static` ve `constructor`, nesne yönelimli programlamada oldukça önemli iki kavramdır. **İkisi de sınıfların ve nesnelerin yönetimiyle ilgilidir ama farklı işlevlere sahiptirler.**

Bu yazıda, **hem `static` hem de `constructor` kavramlarını ayrı ayrı detaylandıracak, ardından aralarındaki farkları derinlemesine açıklayacağız.**

---

# **🔹 `static` Nedir?**
Java’da `static` bir **anahtar kelimedir** ve sınıf seviyesinde tanımlanan üyeleri (değişkenler, metodlar ve bloklar) belirtmek için kullanılır. **Static üyeler, nesneye bağlı değildir, sınıfa bağlıdır.**

## **🔹 `static` Kullanım Alanları**
1. **Static Değişkenler (`static variables`)**
2. **Static Metodlar (`static methods`)**
3. **Static Bloklar (`static blocks`)**
4. **Static İç Sınıflar (`static nested classes`)**

---

### **📌 1️⃣ `static` Değişkenler (Class Variables)**
Bir değişken `static` olarak tanımlandığında, **bütün nesneler tarafından paylaşılır ve bellekte yalnızca bir kopyası bulunur.**

```java
class Car {
    static int totalCars = 0;  // Static değişken
    String model;

    public Car(String model) {
        this.model = model;
        totalCars++;  // Her nesne oluşturulduğunda artırılır
    }
}

public class Main {
    public static void main(String[] args) {
        Car car1 = new Car("Tesla");
        Car car2 = new Car("BMW");

        System.out.println("Toplam araba sayısı: " + Car.totalCars); // 2
    }
}
```
**📌 Çıktı:**
```
Toplam araba sayısı: 2
```
**✔ `static` değişkenler tüm nesneler tarafından paylaşılır, her nesne için ayrı bir kopyası olmaz.**

---

### **📌 2️⃣ `static` Metodlar (Class Methods)**
`static` metodlar, nesne oluşturmadan çağrılabilir.

```java
class MathUtils {
    static int square(int num) {
        return num * num;
    }
}

public class Main {
    public static void main(String[] args) {
        System.out.println("5'in karesi: " + MathUtils.square(5)); // 25
    }
}
```
**✔ Static metodlar, sadece `static` değişkenlere erişebilir ve `this` kullanamaz.**

---

### **📌 3️⃣ `static` Bloklar (Static Initialization Blocks)**
**`static` blok, sınıf belleğe yüklendiğinde bir kez çalıştırılır.**

```java
class Config {
    static String appName;

    static {
        appName = "MyApp";
        System.out.println("Static blok çalıştı!");
    }
}

public class Main {
    public static void main(String[] args) {
        System.out.println(Config.appName);
    }
}
```
**📌 Çıktı:**
```
Static blok çalıştı!
MyApp
```
✔ **Static bloklar, sınıf yüklenirken bir kere çalışır ve genellikle başlangıç ayarları için kullanılır.**

---

# **🔹 Constructor (Yapıcı Metod) Nedir?**
Bir sınıfın nesnesi oluşturulduğunda **otomatik olarak çağrılan özel bir metottur.**

## **🔹 Constructor’ın Özellikleri:**
1. **Sınıf adıyla aynı isme sahip olmalıdır.**
2. **Geri dönüş tipi yoktur.** (void bile yazılmaz!)
3. **Otomatik olarak çağrılır.**
4. **Overloading (Aşırı Yükleme) destekler.**

---

### **📌 Constructor Örneği**
```java
class Car {
    String model;

    // Constructor (Yapıcı Metod)
    public Car(String model) {
        this.model = model;
        System.out.println(model + " oluşturuldu.");
    }
}

public class Main {
    public static void main(String[] args) {
        Car car1 = new Car("Tesla"); // Constructor çağrılır
        Car car2 = new Car("BMW");
    }
}
```
**📌 Çıktı:**
```
Tesla oluşturuldu.
BMW oluşturuldu.
```
✔ **Her nesne oluşturulduğunda constructor çalışır.**

---

## **🔹 Constructor Overloading (Aşırı Yükleme)**
Bir sınıfta birden fazla constructor tanımlanabilir.

```java
class Person {
    String name;
    int age;

    // Constructor 1 (isim ile)
    public Person(String name) {
        this.name = name;
        this.age = 18;  // Varsayılan yaş
    }

    // Constructor 2 (isim ve yaş ile)
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

public class Main {
    public static void main(String[] args) {
        Person p1 = new Person("Ali");
        Person p2 = new Person("Veli", 25);

        System.out.println(p1.name + ", " + p1.age); // Ali, 18
        System.out.println(p2.name + ", " + p2.age); // Veli, 25
    }
}
```
✔ **Constructor overloading ile farklı parametreler için farklı yapılandırmalar yapabiliriz.**

---

# **🔹 `static` ve `constructor` Arasındaki Farklar**
| **Özellik** | **`static`** | **`constructor`** |
|------------|-------------|----------------|
| **Nesne oluşturma gerekliliği** | Nesne oluşturmadan kullanılabilir. | Nesne oluşturulduğunda çalışır. |
| **Bellekte Konumu** | **Sınıf belleğe yüklendiğinde çalışır.** | **Nesne oluşturulduğunda çalışır.** |
| **Metod tipi** | Normal metodlar olabilir (geri dönüş tipi vardır). | Geri dönüş tipi yoktur (void bile yazılmaz). |
| **Ana kullanım alanı** | Sınıf seviyesinde değişken/metod yönetimi. | Nesne oluşturma sürecini yönetir. |
| **Çağrılma Şekli** | `ClassName.staticMethod()` ile çağrılır. | `new ClassName()` ile otomatik çağrılır. |
| **Kaç kez çalışır?** | Static bloklar **bir kez** çalışır. | Her nesne oluşturulduğunda tekrar çalışır. |
| **Overloading** | Normal metodlar gibi overload edilebilir. | Overloading destekler. |
| **Özel Anahtar Kelime (`this` veya `super`) Kullanımı** | `this` veya `super` kullanılamaz. | `this` veya `super` kullanılabilir. |

---

# **🔹 Sonuç**
- **`static`, sınıf seviyesinde elemanlar tanımlamak için kullanılır ve nesne oluşturmadan çalışır.**
- **`constructor`, nesne oluşturulduğunda çağrılan bir metottur ve nesnenin başlatılmasını sağlar.**
- **Static bloklar yalnızca bir kez çalışırken, constructor her nesne oluşturulduğunda çağrılır.**
- **`static` metodlar ve değişkenler, nesneye değil sınıfa bağlıdır, ancak constructor her nesne için çalışır.**

✔ **Java’da sınıflar oluştururken, `static` ve `constructor` kavramlarını doğru kullanarak kodumuzu daha verimli hale getirebiliriz!** 🚀


## Javada Serializable
```sh 

```
---

# **Java'da `Serializable` Nedir?**
Java'da `Serializable`, **bir nesnenin byte dizisine dönüştürülmesini (serileştirme) ve daha sonra geri okunmasını (deserileştirme) sağlayan bir arayüzdür.** Nesneleri dosyaya kaydetmek, ağ üzerinden göndermek veya kalıcı hale getirmek için kullanılır.

## **🔹 `Serializable` Ne İşe Yarar?**
- Bir nesnenin durumu **diskte saklanabilir** veya **veritabanına kaydedilebilir**.
- Bir nesne **ağ üzerinden iletilebilir**.
- **RMI (Remote Method Invocation)** gibi sistemlerde nesne transferi için kullanılır.
- **Cache mekanizmaları ve oturum yönetimi** gibi alanlarda nesne saklamak için kullanılır.

---

## **🔹 `Serializable` Kullanımı**
Java'da **`Serializable` bir işaretleyici (marker) arayüzdür.** Yani herhangi bir metod içermez. **Bir sınıfı serileştirmek için `implements Serializable` kullanılır.**

📌 **Örnek: `Person` Sınıfını Serileştirme ve Dosyaya Kaydetme**
```java
import java.io.*;

// Serializable arayüzünü uygulayan sınıf
class Person implements Serializable {
    private static final long serialVersionUID = 1L; // Versiyon kontrolü için
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() { return name; }
    public int getAge() { return age; }

    @Override
    public String toString() {
        return "Name: " + name + ", Age: " + age;
    }
}

// Ana program
public class SerializeDemo {
    public static void main(String[] args) {
        Person person = new Person("Ali", 30);

        // Serileştirme işlemi (ObjectOutputStream ile dosyaya yazma)
        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("person.dat"))) {
            out.writeObject(person);
            System.out.println("Nesne başarıyla serileştirildi.");
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Deserileştirme işlemi (ObjectInputStream ile dosyadan okuma)
        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream("person.dat"))) {
            Person readPerson = (Person) in.readObject();
            System.out.println("Nesne başarıyla deserileştirildi: " + readPerson);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
```
**📌 Çıktı:**
```
Nesne başarıyla serileştirildi.
Nesne başarıyla deserileştirildi: Name: Ali, Age: 30
```

---

## **🔹 Serileştirmenin Çalışma Mantığı**
📌 **Adım Adım Süreç:**
1. **Nesne, `writeObject()` metodu ile bir dosyaya kaydedilir.**
2. **Nesne, `readObject()` metodu ile geri okunur.**
3. **Serileştirme sırasında nesnenin tüm alanları (field) kaydedilir.**
4. **Deserileştirme sırasında nesne yeniden oluşturulur ve alanları yüklenir.**

---

## **🔹 `serialVersionUID` Nedir?**
Serileştirilmiş bir nesnenin sınıfı değişirse **`InvalidClassException`** hatası alınabilir.  
Bu sorunu önlemek için **`serialVersionUID` tanımlanır.**

```java
private static final long serialVersionUID = 1L;
```
📌 **Eğer `serialVersionUID` eklenmezse:**
- JVM **otomatik bir UID oluşturur.**
- Sınıfta bir değişiklik olursa UID değişir ve **önceki serileştirilmiş nesneler kullanılamaz.**

📌 **Eğer `serialVersionUID` eklenirse:**
- Eski nesneler, yeni sınıfla **hata vermeden yüklenebilir.**
- Ancak **eklenen yeni alanlar null veya varsayılan değerde kalır.**

📌 **Örnek:**  
Önce aşağıdaki sınıfı kaydettik ve bir nesne oluşturduk:
```java
class Person implements Serializable {
    private static final long serialVersionUID = 1L;
    private String name;
    private int age;
}
```
Sonra sınıfa yeni bir alan ekledik:
```java
class Person implements Serializable {
    private static final long serialVersionUID = 1L;
    private String name;
    private int age;
    private String email; // Yeni alan eklendi
}
```
Eğer eski dosyadan deserileştirme yaparsak **`email` alanı `null` kalır ama hata vermez.** Eğer `serialVersionUID` tanımlanmamış olsaydı, **`InvalidClassException`** hatası alırdık.

---

## **🔹 Serileştirme Kuralları ve İstisnalar**

### **1️⃣ `transient` Anahtar Kelimesi**
Bazı alanların serileştirilmesini istemiyorsak **`transient` anahtar kelimesini kullanırız.**

```java
class Person implements Serializable {
    private static final long serialVersionUID = 1L;
    private String name;
    private int age;
    private transient String password; // Serileştirilmeyecek

    public Person(String name, int age, String password) {
        this.name = name;
        this.age = age;
        this.password = password;
    }
}
```
**📌 Çıktı:**
```bash
Nesne başarıyla serileştirildi.
Nesne başarıyla deserileştirildi: Name: Ali, Age: 30, Password: null
```
- **`transient` alanlar serileştirilmez** ve varsayılan değere (null veya 0) döner.

---

### **2️⃣ `static` Alanlar Serileştirilemez**
```java
class Test implements Serializable {
    private static final long serialVersionUID = 1L;
    private static int counter = 100;
}
```
- **`static` alanlar serileştirilmez** çünkü sınıfa aittir ve nesneye özel değildir.

---

### **3️⃣ Serileştirme ile Miras (Inheritance)**
Eğer bir sınıf `Serializable` değilse, onun alt sınıfları da serileştirilemez.

```java
class Parent {
    int id;
}

class Child extends Parent implements Serializable {
    private static final long serialVersionUID = 1L;
    String name;
}
```
📌 **Burada `Parent` serileştirilebilir mi?** ❌ **Hayır, çünkü `Serializable` implement edilmedi!**  
Eğer `Parent`'ı serileştirmek istiyorsak, **ya `Serializable` yapmalıyız ya da `super` alanlarını manuel serileştirmeliyiz.**

```java
class Parent {
    int id;
}

class Child extends Parent implements Serializable {
    private static final long serialVersionUID = 1L;
    String name;

    private void writeObject(ObjectOutputStream out) throws IOException {
        out.defaultWriteObject(); // Normal serileştirme yap
        out.writeInt(id); // Ekstra: Parent id’yi manuel kaydet
    }

    private void readObject(ObjectInputStream in) throws IOException, ClassNotFoundException {
        in.defaultReadObject(); // Normal deserileştirme yap
        id = in.readInt(); // Ekstra: Parent id’yi geri yükle
    }
}
```
---

## **🔹 Sonuç**
- **`Serializable`**, Java nesnelerini **diskte saklamak veya ağda iletmek için** kullanılır.
- **`serialVersionUID`**, sınıf versiyonlamasında uyumluluğu sağlar.
- **`transient`**, hassas verilerin serileştirilmesini engeller.
- **`static` alanlar serileştirilmez** çünkü sınıfa aittir.
- **Miras kullanıyorsak, üst sınıfların da serileştirildiğinden emin olmalıyız.**

🚀 **Serileştirme, verileri kalıcı hale getirmek için en önemli Java özelliklerinden biridir!** 🚀

## Javada IO(Giriş / Çıkış)
```sh 

```
---
## **Java'da I/O (Input/Output) Nedir?**

**Java'da I/O (Giriş/Çıkış - Input/Output)**, bir programın dış dünyayla veri alışverişi yapmasını sağlayan mekanizmalardır. Bu mekanizmalar, klavye girişi (kullanıcıdan veri alma), dosya okuma/yazma, ağ üzerinden veri transferi gibi işlemleri kapsar. Java'da I/O işlemleri, **java.io** ve **java.nio** (New I/O) paketleri aracılığıyla gerçekleştirilir.

---

## **1. Java I/O Paketleri**
Java'da temel I/O işlemleri için iki ana paket vardır:

1. **java.io**:
    - Geleneksel I/O işlemleri için kullanılır.
    - **Stream (Akış) tabanlıdır**.
    - Yavaş çalışır, ancak kullanımı basittir.
    - **Blocking I/O** mantığıyla çalışır (I/O işlemi tamamlanana kadar program durur).

2. **java.nio (New I/O)**:
    - Daha hızlı ve modern bir yaklaşımdır.
    - **Buffer (Tampon) ve Channel (Kanal) tabanlıdır**.
    - Non-blocking I/O desteği sunar (Asenkron çalışabilir).
    - Büyük veri işlemleri için daha uygundur.

Bu yazıda, geleneksel **java.io** kütüphanesini detaylıca ele alacağız.

---

## **2. Java’da I/O İşlemlerinin Temel Kavramları**
Java'daki I/O işlemleri aşağıdaki temel kavramlar üzerine kuruludur:

### **a) Stream (Akış)**
Java’da **Stream (Akış)**, veri giriş-çıkış işlemlerinin temelidir. Bir akış, **veri kaynağından hedefe veri taşıyan bir soyutlamadır**.

- **InputStream**: Veri giriş işlemlerini yönetir (klavyeden giriş, dosyadan okuma vb.).
- **OutputStream**: Veri çıkış işlemlerini yönetir (ekrana yazma, dosyaya kaydetme vb.).

#### **Akış Türleri:**
1. **Byte Streams (Bayt Akışları)**
    - **Veriyi bayt bazlı işler** (1 byte = 8 bit).
    - **Genellikle resim, video ve ses dosyaları gibi ikili (binary) verileri işlemek için kullanılır**.
    - **Örnekler:**
        - **InputStream** (Giriş Akışı)
        - **OutputStream** (Çıkış Akışı)

2. **Character Streams (Karakter Akışları)**
    - **Metin bazlı verileri işlemek için kullanılır**.
    - **Örnekler:**
        - **Reader (Giriş)**
        - **Writer (Çıkış)**

---

## **3. Java'da I/O Sınıfları ve Kullanımı**
### **a) Byte Streams (Bayt Akışları)**
Bayt akışları, veriyi **byte düzeyinde işler** ve resim, video gibi ikili (binary) veriler için idealdir.

#### **1. FileInputStream - Dosya Okuma**
Bu sınıf, bir dosyadan bayt bayt veri okumanızı sağlar.

```java
import java.io.FileInputStream;
import java.io.IOException;

public class FileInputExample {
    public static void main(String[] args) {
        try (FileInputStream fis = new FileInputStream("example.txt")) {
            int data;
            while ((data = fis.read()) != -1) {
                System.out.print((char) data); // Baytları karaktere çevirerek ekrana yazdır
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
```
✅ **Dosyadan bayt bayt okuma yapar ve içeriği ekrana yazdırır.**

---

#### **2. FileOutputStream - Dosyaya Yazma**
Bu sınıf, bir dosyaya bayt bazlı veri yazmanızı sağlar.

```java
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputExample {
    public static void main(String[] args) {
        String text = "Merhaba, Java I/O!";
        try (FileOutputStream fos = new FileOutputStream("output.txt")) {
            fos.write(text.getBytes()); // Metni bayt dizisine çevirerek dosyaya yaz
            System.out.println("Dosyaya yazma işlemi tamamlandı.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
```
✅ **Metni dosyaya bayt bazında yazdırır.**

---

### **b) Character Streams (Karakter Akışları)**
Karakter akışları, **karakter (char) bazında veri işlemek için kullanılır** ve metin dosyaları için idealdir.

#### **1. FileReader - Dosya Okuma**
Bu sınıf, bir dosyadan **karakter karakter veri okumanızı** sağlar.

```java
import java.io.FileReader;
import java.io.IOException;

public class FileReaderExample {
    public static void main(String[] args) {
        try (FileReader reader = new FileReader("example.txt")) {
            int character;
            while ((character = reader.read()) != -1) {
                System.out.print((char) character);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
```
✅ **Metin dosyasını karakter karakter okur ve ekrana yazdırır.**

---

#### **2. FileWriter - Dosyaya Yazma**
Bu sınıf, bir dosyaya **karakter bazlı** veri yazmanızı sağlar.

```java
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterExample {
    public static void main(String[] args) {
        String text = "Java I/O dersine hoş geldiniz!";
        try (FileWriter writer = new FileWriter("output.txt")) {
            writer.write(text);
            System.out.println("Dosyaya yazma işlemi başarılı!");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
```
✅ **Metni dosyaya karakter bazında yazdırır.**

---

### **c) Buffered Streams (Tamponlu Akışlar)**
BufferedReader ve BufferedWriter gibi sınıflar, **veriyi tampon (buffer) kullanarak daha hızlı okuma/yazma işlemi yapar.**

#### **1. BufferedReader - Hızlı Dosya Okuma**
```java
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class BufferedReaderExample {
    public static void main(String[] args) {
        try (BufferedReader br = new BufferedReader(new FileReader("example.txt"))) {
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line); // Satır satır okuma yapar
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
```
✅ **Dosyayı satır satır okur ve ekrana yazdırır.**

---

#### **2. BufferedWriter - Hızlı Dosya Yazma**
```java
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriterExample {
    public static void main(String[] args) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter("output.txt"))) {
            bw.write("Java I/O çok önemli!");
            bw.newLine();
            bw.write("Tamponlu yazma işlemi başarıyla tamamlandı.");
            System.out.println("Dosya yazıldı.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
```
✅ **Tampon kullanarak veriyi daha hızlı yazdırır.**

---

## **Sonuç ve Özet**
- Java I/O işlemleri **java.io** paketinde tanımlanmıştır.
- **InputStream / OutputStream** bayt bazlı çalışır (Resim, video gibi dosyalar için uygundur).
- **Reader / Writer** karakter bazlı çalışır (Metin dosyaları için uygundur).
- **BufferedReader / BufferedWriter** daha hızlı işlem yapar.
- Dosya okuma/yazma işlemleri genellikle **try-with-resources** yapısı ile kullanılır.

👉 **I/O işlemlerini verimli kullanarak büyük ölçekli projelerde performans kazanabilirsiniz! 🚀**


## Enum
```sh 

```
---
### **Java Enum (Enumerasyon) Nedir?**

Java'da **Enum (Enumerated Type)**, sabit değerler kümesini temsil etmek için kullanılan özel bir veri tipidir. Enum'lar, belirli bir grup sabitin bir arada tutulmasını sağlar ve okunabilirliği artırır.

Enum'lar genellikle **sabit değerlerin daha anlamlı bir şekilde ifade edilmesi**, **hata payının azaltılması** ve **kodun daha güvenli ve sürdürülebilir hale getirilmesi** için kullanılır.

---

## **Enum Tanımlama ve Kullanımı**
Enum’lar `enum` anahtar kelimesi ile tanımlanır ve her enum sabiti varsayılan olarak **public, static ve final** olarak kabul edilir. Enum'lar `class` gibi çalışır ama `extends` edilemez.

```java
// Basit bir Enum tanımlama örneği
public enum Gunler {
    PAZARTESI, SALI, CARSAMBA, PERSEMBE, CUMA, CUMARTESI, PAZAR;
}
```
Burada `Gunler` adında bir enum tanımladık ve içerisine haftanın günlerini ekledik.

Enum kullanımı şu şekildedir:

```java
public class EnumOrnek {
    public static void main(String[] args) {
        Gunler bugun = Gunler.PAZARTESI;
        System.out.println("Bugün: " + bugun);
    }
}
```
**Çıktı:**
```
Bugün: PAZARTESI
```

---

## **Enum İçinde Alan (Field) ve Metot Tanımlama**
Enum’lar, tıpkı sınıflar gibi **alan (field) ve metodlar** içerebilir.

Örneğin, aşağıdaki kodda her bir gün için bir çalışma durumu (true/false) tanımlanmıştır.

```java
public enum Gunler {
    PAZARTESI(true), SALI(true), CARSAMBA(true), PERSEMBE(true), CUMA(true), CUMARTESI(false), PAZAR(false);
    
    private boolean calismaGunu;

    Gunler(boolean calismaGunu) {
        this.calismaGunu = calismaGunu;
    }

    public boolean isCalismaGunu() {
        return calismaGunu;
    }
}
```

Kullanımı:
```java
public class EnumTest {
    public static void main(String[] args) {
        Gunler bugun = Gunler.PAZARTESI;
        System.out.println("Bugün çalışma günü mü? " + bugun.isCalismaGunu());
    }
}
```
**Çıktı:**
```
Bugün çalışma günü mü? true
```

---

## **Enum ile Switch-Case Kullanımı**
Enum’lar `switch-case` içinde çok yaygın kullanılır:

```java
public class EnumSwitchOrnek {
    public static void main(String[] args) {
        Gunler bugun = Gunler.CUMA;

        switch (bugun) {
            case PAZARTESI:
            case SALI:
            case CARSAMBA:
            case PERSEMBE:
            case CUMA:
                System.out.println("Hafta içi, çalışmaya devam!");
                break;
            case CUMARTESI:
            case PAZAR:
                System.out.println("Hafta sonu, tatil!");
                break;
        }
    }
}
```
**Çıktı:**
```
Hafta içi, çalışmaya devam!
```

---

## **Enum Sabitlerini Döngü ile Kullanma**
Enum içindeki tüm sabitleri bir döngü ile dolaşabiliriz.

```java
public class EnumDonguOrnek {
    public static void main(String[] args) {
        for (Gunler gun : Gunler.values()) {
            System.out.println(gun);
        }
    }
}
```
**Çıktı:**
```
PAZARTESI
SALI
CARSAMBA
PERSEMBE
CUMA
CUMARTESI
PAZAR
```

---

## **Enum İçinde Constructor, Metot ve Override Kullanımı**
Bir enum içinde **constructor (yapıcı metot)** ve **override edilebilen metotlar** tanımlanabilir.

```java
public enum Mesaj {
    BASARILI(200, "İşlem başarılı"),
    HATA(500, "Sunucu hatası"),
    BULUNAMADI(404, "Sayfa bulunamadı");

    private final int kod;
    private final String mesaj;

    Mesaj(int kod, String mesaj) {
        this.kod = kod;
        this.mesaj = mesaj;
    }

    public int getKod() {
        return kod;
    }

    public String getMesaj() {
        return mesaj;
    }

    @Override
    public String toString() {
        return kod + " - " + mesaj;
    }
}
```
Kullanımı:

```java
public class EnumTest {
    public static void main(String[] args) {
        System.out.println(Mesaj.BASARILI);
        System.out.println(Mesaj.HATA.getMesaj());
    }
}
```

**Çıktı:**
```
200 - İşlem başarılı
Sunucu hatası
```

---

## **Enum ile Abstract Metot Kullanımı**
Eğer her enum sabiti için farklı bir davranış tanımlamak istiyorsak, abstract metot kullanabiliriz.

```java
public enum Islem {
    TOPLAMA {
        @Override
        public int hesapla(int a, int b) {
            return a + b;
        }
    },
    CIKARMA {
        @Override
        public int hesapla(int a, int b) {
            return a - b;
        }
    };

    public abstract int hesapla(int a, int b);
}
```

Kullanımı:

```java
public class EnumHesaplama {
    public static void main(String[] args) {
        int sonuc = Islem.TOPLAMA.hesapla(5, 3);
        System.out.println("Toplama sonucu: " + sonuc);
    }
}
```

**Çıktı:**
```
Toplama sonucu: 8
```

---

## **Enum’un Avantajları**
1. **Sabit Değerlerin Anlamlı Kullanımı:** Kodun okunurluğunu artırır. (`Gunler.PAZARTESI` yerine `1` gibi sayısal değerler kullanmak hata yapma olasılığını artırır.)
2. **Tip Güvenliği Sağlar:** Enum kullanımı, yanlış değerlerin atanmasını önler. (`String` yerine `enum` kullanmak daha güvenlidir.)
3. **Kapsülleme (Encapsulation) Sağlar:** Enum içinde metotlar, alanlar tanımlanabilir.
4. **Switch-Case Kullanımı ile Kolaylık Sağlar:** Enum’lar `switch-case` bloklarında rahatlıkla kullanılabilir.
5. **Bellek Verimliliği:** Enum nesneleri JVM tarafından `static` olarak saklandığından, her çağrıldığında tekrar oluşturulmazlar.

---

## **Sonuç**
Java Enum, sabit değerleri tanımlamak için güçlü bir yapıdır. Sadece sabit listeleri tutmakla kalmaz, aynı zamanda veri ve metotlar içerebilir, dolayısıyla `enum`'lar nesne yönelimli programlamanın avantajlarından yararlanabilir. Enum'ları uygun şekilde kullanarak, hem kodunuzu daha okunabilir hale getirebilir hem de hata riskini minimize edebilirsiniz.


## Inner Class
```sh 

```
---

# **Java'da Inner Class (İç İçe Sınıflar) Nedir?**
Java'da **Inner Class (İç İçe Sınıflar)**, bir sınıfın içinde başka bir sınıf tanımlanmasını sağlayan yapıdır. Bir **inner class**, dış sınıfın üyesidir ve genellikle **dış sınıfın özel (private) üyelerine erişim sağlamak** amacıyla kullanılır.

---

## **Neden Inner Class Kullanılır?**
1. **Dış sınıfın özel üyelerine erişimi kolaylaştırır.**
2. **Kod organizasyonunu ve okunabilirliği artırır.**
3. **Dış sınıfa sıkı bağlı ve tek başına anlamsız olan sınıfların tanımlanmasını sağlar.**
4. **Gereksiz sınıf dosyası oluşturmayı engeller.**

---

## **Java'da Inner Class Çeşitleri**
Java'da dört farklı türde **Inner Class** bulunur:
1. **Normal Inner Class (Üye İç Sınıf)**
2. **Static Inner Class (Statik İç Sınıf)**
3. **Local Inner Class (Yerel İç Sınıf)**
4. **Anonymous Inner Class (Anonim İç Sınıf)**

---

## **1. Normal Inner Class (Üye İç Sınıf)**
- Bir sınıfın içinde başka bir sınıf olarak tanımlanır.
- **Dış sınıfın her türlü üyesine erişebilir (private dahil).**
- **Dış sınıf olmadan tek başına var olamaz.**

### **Örnek: Normal Inner Class Kullanımı**
```java
class DisSinif {
    private String mesaj = "Merhaba, Inner Class!";
    
    class IcSinif { // İç sınıf
        void yazdir() {
            System.out.println(mesaj); // Dış sınıfın özel değişkenine erişim
        }
    }
}

public class InnerClassOrnek {
    public static void main(String[] args) {
        DisSinif dis = new DisSinif();
        DisSinif.IcSinif ic = dis.new IcSinif(); // İç sınıf nesnesi oluşturma
        ic.yazdir();
    }
}
```
### **Çıktı:**
```
Merhaba, Inner Class!
```
Bu örnekte, **`IcSinif` dış sınıfın private değişkenine erişebilmektedir.**

### **Dikkat Edilmesi Gerekenler:**
- **Inner Class nesnesi oluşturulurken önce dış sınıfın nesnesi oluşturulmalıdır.**
- **Dış sınıfın private değişkenlerine erişebilir.**

---

## **2. Static Inner Class (Statik İç Sınıf)**
- `static` olarak tanımlandığında, **dış sınıfın nesnesine ihtiyaç duymadan kullanılabilir.**
- **Sadece dış sınıfın `static` üyelerine erişebilir.**

### **Örnek: Static Inner Class Kullanımı**
```java
class DisSinif {
    static String veri = "Statik Veri";

    static class IcSinif {
        void yazdir() {
            System.out.println("İç sınıf: " + veri); // Statik değişkene erişim
        }
    }
}

public class StaticInnerClassOrnek {
    public static void main(String[] args) {
        DisSinif.IcSinif ic = new DisSinif.IcSinif(); // Direkt nesne oluşturulabilir
        ic.yazdir();
    }
}
```
### **Çıktı:**
```
İç sınıf: Statik Veri
```

### **Özetle:**
- **Dış sınıfın statik üyelerine doğrudan erişebilir.**
- **Dış sınıfın nesnesi oluşturulmadan iç sınıfın nesnesi oluşturulabilir.**

---

## **3. Local Inner Class (Yerel İç Sınıf)**
- **Bir metodun içinde tanımlanır ve sadece o metodun içinde kullanılabilir.**
- **Metodun içinde tanımlandığı için erişim belirleyicisi (`public`, `private` vs.) kullanılamaz.**
- **Bulunduğu metodun `final` olmayan yerel değişkenlerine erişemez.**

### **Örnek: Local Inner Class Kullanımı**
```java
class DisSinif {
    void disMetod() {
        class YerelIcSinif { // Metot içinde inner class
            void yazdir() {
                System.out.println("Bu bir Yerel Inner Class");
            }
        }

        YerelIcSinif ic = new YerelIcSinif();
        ic.yazdir();
    }
}

public class LocalInnerClassOrnek {
    public static void main(String[] args) {
        DisSinif dis = new DisSinif();
        dis.disMetod(); // Sadece metod çağrıldığında çalışır
    }
}
```
### **Çıktı:**
```
Bu bir Yerel Inner Class
```

### **Özetle:**
- **Bir metot içinde tanımlanır ve sadece o metodun içinde erişilebilir.**
- **Metot çağrılmadan iç sınıfın nesnesi oluşturulamaz.**

---

## **4. Anonymous Inner Class (Anonim İç Sınıf)**
- **İsimsizdir ve genellikle arayüzleri veya soyut sınıfları implement etmek için kullanılır.**
- **Nesne oluşturma sırasında tanımlanır ve hemen kullanılır.**

### **Örnek: Arayüz Kullanımı ile Anonim İç Sınıf**
```java
interface Mesaj {
    void goster();
}

public class AnonymousInnerClassOrnek {
    public static void main(String[] args) {
        Mesaj mesaj = new Mesaj() {
            public void goster() {
                System.out.println("Bu bir Anonim Inner Class");
            }
        };

        mesaj.goster();
    }
}
```
### **Çıktı:**
```
Bu bir Anonim Inner Class
```

### **Örnek: Soyut Sınıf Kullanımı ile Anonim Inner Class**
```java
abstract class Hayvan {
    abstract void sesCikar();
}

public class AnonymousInnerClassOrnek {
    public static void main(String[] args) {
        Hayvan kedi = new Hayvan() {
            void sesCikar() {
                System.out.println("Miyav!");
            }
        };

        kedi.sesCikar();
    }
}
```
### **Çıktı:**
```
Miyav!
```

### **Özetle:**
- **Bir sınıfın veya arayüzün bir kerelik kullanımı için uygundur.**
- **Genellikle olay dinleyicileri (Event Listeners) veya callback mekanizmalarında kullanılır.**

---

## **Inner Class Kullanım Senaryoları**
1. **GUI Programlamada (Swing, JavaFX)**
    - Anonim iç sınıflar, buton tıklama olaylarını yakalamak için yaygın olarak kullanılır.

2. **Çok büyük sınıfları modüler hale getirmek için**
    - Normal `Inner Class` ile büyük kod bloklarını daha okunaklı hale getirmek.

3. **Bağımsız çalışamayan sınıfları gruplamak**
    - Eğer bir sınıf **yalnızca belirli bir sınıfın içinde anlamlıysa**, **Inner Class kullanımı** iyi bir çözümdür.

4. **Güvenlik ve Kapsülleme**
    - Dış sınıfın private üyelerine erişim sağlamak için.

---

## **Sonuç**
- **Inner Class'lar**, dış sınıfa ait mantıksal bileşenleri iç içe organize etmek için kullanılır.
- **Dört temel türü vardır**: **Normal Inner Class, Static Inner Class, Local Inner Class ve Anonymous Inner Class.**
- **Kod organizasyonunu iyileştirir ve gereksiz dosya oluşturmayı engeller.**
- **Anonim sınıflar**, olay dinleme (event handling) ve tek seferlik işlemler için idealdir.

### **Ne Zaman Kullanılmalı?**
- Eğer **bir sınıf, yalnızca belirli bir dış sınıf içinde anlamlıysa**, Inner Class kullanımı mantıklıdır.
- **Gereksiz Inner Class kullanımından kaçınılmalıdır**, çünkü bazen bağımsız sınıflar daha okunaklı ve sürdürülebilir olur.

##  Çoklu İş Parçacığı (Multithreading)
```sh 

```
---

## Çoklu İş Parçacığı (Multithreading)

Çoklu iş parçacığı (multithreading), bir programın birden fazla iş parçacığını (thread) eş zamanlı olarak çalıştırmasını sağlayan bir programlama modelidir. Modern bilgisayarlar ve işletim sistemleri, aynı anda birden fazla işlemi gerçekleştirebilme yeteneğine sahiptir. Multithreading, bu paralel işlem gücünü en iyi şekilde kullanarak programların daha verimli çalışmasını sağlar.

Birçok uygulama, aynı anda birden fazla görevi yerine getirmek zorundadır. Örneğin:
- Bir web tarayıcısı, birden fazla sekmeyi aynı anda işleyebilir.
- Bir oyun motoru, grafik, ses ve fizik hesaplamalarını ayrı iş parçacıklarıyla yönetebilir.
- Bir veritabanı sunucusu, çok sayıda istemciden gelen talepleri eş zamanlı olarak işleyebilir.

Multithreading’in avantajları:
- **Performans Artışı:** İşlemci kaynaklarını daha verimli kullanarak programın daha hızlı çalışmasını sağlar.
- **Daha Hızlı Yanıt Süresi:** Kullanıcı arayüzünü ve arka plan işlemlerini birbirinden ayırarak daha akıcı bir deneyim sunar.
- **Kaynak Paylaşımı:** Aynı bellek alanını paylaşarak daha düşük bellek tüketimi sağlar.
- **İyileştirilmiş CPU Kullanımı:** Birden fazla çekirdeğe sahip işlemcilerden tam kapasite faydalanılabilir.

Ancak, çoklu iş parçacığı kullanımı bazı zorlukları da beraberinde getirir:
- **Senkronizasyon sorunları**
- **Ölçeklenebilirlik problemleri**
- **Deadlock (Ölü Kilitlenme)**
- **Race condition (Yarış Koşulları)**

Şimdi, multithreading ile ilgili temel konulara ayrıntılı şekilde bakalım.

---

## **1. Thread Oluşturma ve Yönetimi**

Bir programda çoklu iş parçacığı kullanımı için işletim sisteminin sağladığı API’ler veya programlama dili seviyesindeki kütüphaneler kullanılır. Java, Python, C++ ve C# gibi diller, thread yönetimi için çeşitli mekanizmalar sağlar.

### **1.1 Thread Nedir?**
Thread, bir programın içinde çalışan en küçük yürütülebilir birimdir. Bir program, birden fazla thread çalıştırarak aynı anda birden fazla işi gerçekleştirebilir.

### **1.2 Thread Nasıl Oluşturulur?**
Farklı programlama dillerinde iş parçacığı oluşturma yöntemleri değişiklik gösterebilir. İşte bazı popüler dillerde iş parçacığı oluşturma örnekleri:

### **Java'da Thread Oluşturma**
Java'da iş parçacığı oluşturmanın iki temel yolu vardır:
1. **Thread sınıfını genişletmek**
2. **Runnable arayüzünü uygulamak**

#### **1. Thread Sınıfını Genişletme**
```java
class MyThread extends Thread {
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(Thread.currentThread().getName() + " çalışıyor...");
        }
    }
}

public class Main {
    public static void main(String[] args) {
        MyThread thread1 = new MyThread();
        MyThread thread2 = new MyThread();
        
        thread1.start();
        thread2.start();
    }
}
```

#### **2. Runnable Arayüzünü Kullanma**
```java
class MyRunnable implements Runnable {
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(Thread.currentThread().getName() + " çalışıyor...");
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Thread thread1 = new Thread(new MyRunnable());
        Thread thread2 = new Thread(new MyRunnable());
        
        thread1.start();
        thread2.start();
    }
}
```

---

### **Python’da Thread Oluşturma**
Python'da threading modülü kullanılarak iş parçacıkları oluşturulabilir.

#### **Threading Kullanarak Thread Oluşturma**
```python
import threading

class MyThread(threading.Thread):
    def run(self):
        for i in range(5):
            print(f"{threading.current_thread().name} çalışıyor...")

thread1 = MyThread()
thread2 = MyThread()

thread1.start()
thread2.start()
```

---

### **C++’da Thread Kullanımı**
C++11 ile birlikte `std::thread` kütüphanesi kullanılarak iş parçacıkları oluşturulabilir.

```cpp
#include <iostream>
#include <thread>

void threadFunction() {
    for (int i = 0; i < 5; i++) {
        std::cout << "Thread çalışıyor..." << std::endl;
    }
}

int main() {
    std::thread t1(threadFunction);
    std::thread t2(threadFunction);

    t1.join();
    t2.join();

    return 0;
}
```

---

## **2. Senkronizasyon**

Çoklu iş parçacıklı programlama yaparken, iş parçacıklarının paylaşılan kaynaklara erişimi senkronize edilmezse beklenmedik hatalar oluşabilir. Bu tür sorunları önlemek için senkronizasyon mekanizmaları kullanılır.

### **2.1 Yarış Koşulu (Race Condition)**
Birden fazla iş parçacığının aynı veri kaynağına erişerek birbirinin işlemini bozmasına "yarış koşulu" (race condition) denir. Örneğin, aynı değişkeni değiştiren iki iş parçacığı beklenmedik sonuçlar üretebilir.

Örnek:
```python
import threading

counter = 0

def increment():
    global counter
    for _ in range(1000000):
        counter += 1

t1 = threading.Thread(target=increment)
t2 = threading.Thread(target=increment)

t1.start()
t2.start()

t1.join()
t2.join()

print("Final Counter:", counter)  # Beklenen değer 2000000 fakat daha düşük olabilir
```
Yukarıdaki kodda, aynı değişkeni iki thread artırıyor ama sonuç beklenenden daha düşük olabilir çünkü işlemler çakışıyor.

### **2.2 Mutex (Mutual Exclusion) ile Senkronizasyon**
Yarış koşullarını engellemek için "mutex" kullanılabilir. Mutex, bir thread'in bir kaynağı kilitlemesini ve diğerlerinin beklemesini sağlar.

Python'da `threading.Lock()` kullanarak bir mutex oluşturulabilir:

```python
import threading

counter = 0
lock = threading.Lock()

def increment():
    global counter
    for _ in range(1000000):
        with lock:
            counter += 1

t1 = threading.Thread(target=increment)
t2 = threading.Thread(target=increment)

t1.start()
t2.start()

t1.join()
t2.join()

print("Final Counter:", counter)  # Beklenen değer 2000000 olur
```

---

### **2.3 Deadlock (Ölü Kilitlenme)**
Deadlock, iki veya daha fazla iş parçacığının birbirlerini bekleyerek sonsuza kadar bloke olma durumudur.

Örneğin:
```python
import threading

lock1 = threading.Lock()
lock2 = threading.Lock()

def task1():
    with lock1:
        print("Task1: lock1 alındı")
        with lock2:
            print("Task1: lock2 alındı")

def task2():
    with lock2:
        print("Task2: lock2 alındı")
        with lock1:
            print("Task2: lock1 alındı")

t1 = threading.Thread(target=task1)
t2 = threading.Thread(target=task2)

t1.start()
t2.start()

t1.join()
t2.join()
```
Burada `task1` ve `task2` birbirlerinin kilidini beklerse, program sonsuza kadar bekleyebilir.

Deadlock önlemek için:
- **Kilitleri her zaman aynı sırada almak**
- **Timeout kullanmak**
- **Avoiding circular waits (Döngüsel beklemelerden kaçınmak)**

---

Bu makalede çoklu iş parçacığı kavramını detaylıca inceledik. Senkronizasyon hataları, deadlock, yarış koşulları gibi konuların nasıl çözülebileceğini öğrendik. Gelişmiş sistemlerde multithreading, performansı artırabilir fakat dikkatli yönetilmezse ciddi sorunlara yol açabilir.


## Eşzamanlılık (Concurrency)
```sh 

```
---

# **Eşzamanlılık (Concurrency) ve Concurrency API**

Eşzamanlılık (Concurrency), bir programın aynı anda birden fazla görevi yerine getirebilmesini sağlayan bir kavramdır. Eşzamanlılık, tek bir işlemcide zaman dilimleriyle (time slicing) sağlanabileceği gibi, çok çekirdekli işlemcilerde gerçekten paralel çalışan iş parçacıklarıyla (multithreading) da gerçekleştirilebilir.

Modern yazılım geliştirme süreçlerinde, özellikle yüksek performans gerektiren uygulamalarda eşzamanlılık çok kritik bir rol oynar. Örneğin:
- **Web sunucuları**, aynı anda yüzlerce hatta binlerce istemciyi yönetir.
- **Oyun motorları**, fizik hesaplamaları, ses işleme ve grafik render işlemlerini aynı anda gerçekleştirir.
- **Veritabanı sistemleri**, farklı istemcilerden gelen talepleri paralel olarak işler.

Eşzamanlılık, doğru yönetilmediği takdirde bazı problemlere neden olabilir:
- **Yarış Koşulları (Race Conditions)**: İki veya daha fazla thread, aynı veri kaynağına eşzamanlı olarak erişirse, yanlış sonuçlar ortaya çıkabilir.
- **Deadlock (Ölü Kilitlenme)**: Thread’ler birbirlerini beklerse, sistem kilitlenebilir.
- **Starvation (Aç Kalma)**: Bazı thread’ler sürekli beklerken, diğerleri kaynakları tüketebilir.

Bu tür problemleri çözmek ve çok iş parçacıklı (multithreaded) uygulamalar geliştirmek için Java Concurrency API gibi gelişmiş kütüphaneler ve mekanizmalar geliştirilmiştir.

---

# **1. Java’da Concurrency API ve Yardımcı Sınıflar**

Java **Concurrency API**, çok iş parçacıklı programlamayı kolaylaştıran ve yönetilebilir hale getiren bir dizi sınıf ve arayüzden oluşur. Bu API sayesinde thread yönetimi, senkronizasyon ve eşzamanlı veri yapıları gibi işlemler daha güvenli ve verimli bir şekilde gerçekleştirilebilir.

### **1.1. Concurrency API Temel Bileşenleri**
Java'nın Concurrency API'si `java.util.concurrent` paketi altında yer alır ve aşağıdaki temel bileşenleri içerir:

1. **Thread Pool (Havuz Yönetimi)**
2. **Senkronizasyon Mekanizmaları (Lock, Semaphore, Monitor, etc.)**
3. **Eşzamanlı Koleksiyonlar (Concurrent Collections)**
4. **Zamanlanmış Görevler (Scheduled Tasks)**
5. **Paralel İşleme (Fork/Join Framework)**
6. **Gelişmiş Yardımcı Sınıflar (CountDownLatch, CyclicBarrier, Phaser vb.)**

Şimdi bu bileşenleri detaylı bir şekilde inceleyelim.

---

## **2. Yardımcı Sınıflar (CountDownLatch, CyclicBarrier vb.)**
Concurrency API, eşzamanlı işlemleri yönetmek için birçok yardımcı sınıf sunar. Bunlardan bazıları:

### **2.1 CountDownLatch**
`CountDownLatch`, belirli bir sayıya kadar geri sayım yapan ve bu sayım sıfır olduğunda bekleyen thread'leri serbest bırakan bir mekanizmadır.

📌 **Kullanım Senaryosu**:
- Büyük bir sistem başlatılırken, tüm bileşenlerin hazır olmasını beklemek.
- Paralel çalışan thread'lerin tamamlanmasını beklemek.

🔹 **Örnek: CountDownLatch Kullanımı**
```java
import java.util.concurrent.CountDownLatch;

class Worker extends Thread {
    private CountDownLatch latch;

    public Worker(CountDownLatch latch) {
        this.latch = latch;
    }

    public void run() {
        System.out.println(Thread.currentThread().getName() + " çalışıyor...");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        latch.countDown();  // Sayacı azalt
    }
}

public class CountDownLatchExample {
    public static void main(String[] args) throws InterruptedException {
        CountDownLatch latch = new CountDownLatch(3);
        
        new Worker(latch).start();
        new Worker(latch).start();
        new Worker(latch).start();

        latch.await();  // Tüm thread’ler bitene kadar bekler
        System.out.println("Tüm iş parçacıkları tamamlandı. Ana işleme devam ediliyor.");
    }
}
```
**Çıktı:**
```
Thread-0 çalışıyor...
Thread-1 çalışıyor...
Thread-2 çalışıyor...
Tüm iş parçacıkları tamamlandı. Ana işleme devam ediliyor.
```
---

### **2.2 CyclicBarrier**
`CyclicBarrier`, belirli sayıda thread'in aynı noktada buluşmasını sağlayan bir bariyer mekanizmasıdır.

📌 **Kullanım Senaryosu**:
- Paralel hesaplamalarda, belirli adımları tamamlamadan bir sonraki aşamaya geçmeyi önlemek.
- Oyun motorlarında, tüm oyuncuların bir turu tamamlamasını beklemek.

🔹 **Örnek: CyclicBarrier Kullanımı**
```java
import java.util.concurrent.CyclicBarrier;

class Task extends Thread {
    private CyclicBarrier barrier;

    public Task(CyclicBarrier barrier) {
        this.barrier = barrier;
    }

    public void run() {
        System.out.println(Thread.currentThread().getName() + " görevini tamamladı.");
        try {
            barrier.await();  // Diğer thread’leri bekler
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName() + " devam ediyor...");
    }
}

public class CyclicBarrierExample {
    public static void main(String[] args) {
        CyclicBarrier barrier = new CyclicBarrier(3, () -> System.out.println("Tüm görevler tamamlandı!"));

        new Task(barrier).start();
        new Task(barrier).start();
        new Task(barrier).start();
    }
}
```
**Çıktı:**
```
Thread-0 görevini tamamladı.
Thread-1 görevini tamamladı.
Thread-2 görevini tamamladı.
Tüm görevler tamamlandı!
Thread-0 devam ediyor...
Thread-1 devam ediyor...
Thread-2 devam ediyor...
```
---

### **2.3 Phaser**
Phaser, CyclicBarrier ve CountDownLatch’in daha esnek bir alternatifidir. Birden fazla aşamalı işlemi yönetmek için kullanılır.

📌 **Kullanım Senaryosu**:
- Çok aşamalı iş akışlarını senkronize etmek.
- Belirli işlemlerin bir grup halinde tamamlanmasını sağlamak.

---

## **3. Concurrency API ile Thread Havuzu Yönetimi**
`ExecutorService`, birden fazla iş parçacığını verimli bir şekilde yönetmek için kullanılır.

🔹 **Örnek: Thread Havuzu Kullanımı**
```java
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class WorkerTask implements Runnable {
    public void run() {
        System.out.println(Thread.currentThread().getName() + " görevini çalıştırıyor...");
    }
}

public class ExecutorServiceExample {
    public static void main(String[] args) {
        ExecutorService executor = Executors.newFixedThreadPool(3);

        for (int i = 0; i < 5; i++) {
            executor.execute(new WorkerTask());
        }

        executor.shutdown();
    }
}
```
**Çıktı:**
```
pool-1-thread-1 görevini çalıştırıyor...
pool-1-thread-2 görevini çalıştırıyor...
pool-1-thread-3 görevini çalıştırıyor...
pool-1-thread-1 görevini çalıştırıyor...
pool-1-thread-2 görevini çalıştırıyor...
```
---

## **Sonuç**
- **CountDownLatch**: Belli bir sayıya ulaşana kadar bekler.
- **CyclicBarrier**: Tüm thread’lerin belirli bir noktada buluşmasını sağlar.
- **Phaser**: Daha esnek bir senkronizasyon aracı.
- **ExecutorService**: Thread havuzu yönetimi sağlar.

Concurrency API, çok iş parçacıklı uygulamaları daha yönetilebilir hale getirerek performans ve güvenilirlik sağlar. Bu yapılar, büyük ölçekli yazılım projelerinde kritik öneme sahiptir.


## MVC Nedir ?
```sh 

```
---
### **Java'da MVC (Model-View-Controller) Nedir?**
MVC (Model-View-Controller), yazılım geliştirme süreçlerinde yaygın olarak kullanılan bir mimari desendir. Java uygulamalarında özellikle **Spring Framework, Java Swing, JavaFX ve JSP/Servlet** gibi teknolojilerde sıkça kullanılır. MVC, uygulama bileşenlerini üç ana katmana ayırarak, kodun modülerliğini ve sürdürülebilirliğini artırır.

---

## **1. MVC Mimarisinin Temel Bileşenleri**
MVC, üç ana bileşenden oluşur:

1. **Model (Veri Katmanı)**
2. **View (Görünüm Katmanı)**
3. **Controller (Kontrol Katmanı)**

---

### **1. Model (M) – Veri Katmanı**
**Model, uygulamanın veri yönetiminden sorumlu bileşenidir.** Veri kaynağı (veritabanı, API vb.) ile etkileşim kurarak, bilgileri işler ve gerektiğinde günceller.

#### **Model Katmanının Görevleri**
- Veritabanı işlemlerini gerçekleştirir (CRUD - Create, Read, Update, Delete).
- İş mantığını (business logic) içerir.
- Controller tarafından çağrılır ve verileri View’a gönderir.

#### **Model Örneği (Java)**
```java
public class User {
    private int id;
    private String name;
    private String email;

    // Constructor
    public User(int id, String name, String email) {
        this.id = id;
        this.name = name;
        this.email = email;
    }

    // Getter ve Setter metotları
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }
}
```
Bu örnekte `User` sınıfı, bir kullanıcıyı temsil eden Model katmanıdır.

---

### **2. View (V) – Görünüm Katmanı**
**View, kullanıcıya gösterilen arayüz bileşenlerini içerir.** Java uygulamalarında View genellikle şu teknolojilerle oluşturulur:

- **Swing / JavaFX**: Masaüstü uygulamaları için.
- **JSP / Thymeleaf / HTML + JavaScript**: Web tabanlı uygulamalar için.

#### **View Katmanının Görevleri**
- Kullanıcıya verileri sunar.
- Kullanıcıdan giriş alır ve Controller’a gönderir.
- Kullanıcı deneyimi ile ilgili tasarım ve arayüzü içerir.

#### **View Örneği (Java Swing)**
```java
import javax.swing.*;
import java.awt.*;

public class UserView {
    public void showUserDetails(String name, String email) {
        JFrame frame = new JFrame("User Details");
        frame.setSize(300, 200);
        frame.setLayout(new GridLayout(2, 1));

        JLabel nameLabel = new JLabel("Name: " + name);
        JLabel emailLabel = new JLabel("Email: " + email);

        frame.add(nameLabel);
        frame.add(emailLabel);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
```
Bu kod, `showUserDetails()` metodu ile kullanıcı bilgilerini bir Swing GUI penceresinde görüntüler.

---

### **3. Controller (C) – Kontrol Katmanı**
**Controller, Model ve View arasında bağlantı kuran bileşendir.** Kullanıcının girdilerini işler, Model’e gönderir ve güncellenen veriyi View’a yönlendirir.

#### **Controller Katmanının Görevleri**
- Kullanıcının eylemlerine tepki verir.
- Model ile View arasında veri alışverişini sağlar.
- İş mantığını yönetir.

#### **Controller Örneği (Java)**
```java
public class UserController {
    private User model;
    private UserView view;

    public UserController(User model, UserView view) {
        this.model = model;
        this.view = view;
    }

    public void updateView() {
        view.showUserDetails(model.getName(), model.getEmail());
    }
}
```
Bu kod, `User` modelinden aldığı bilgileri `UserView` arayüzüne aktarır.

---

## **2. MVC'nin Çalışma Mekanizması**
1. Kullanıcı bir işlem gerçekleştirir (örn: butona tıklar, form gönderir).
2. **Controller**, bu isteği alır ve işler.
3. **Controller**, gerekli işlemleri yapmak için **Model**’e başvurur.
4. **Model**, veriyi işler ve günceller.
5. **Controller**, güncellenen Model bilgisini **View**'a iletir.
6. **View**, güncellenmiş veriyi kullanıcıya gösterir.

---

## **3. Java'da MVC Kullanım Örnekleri**
Java'da MVC mimarisi **masaüstü ve web uygulamalarında** geniş çapta kullanılır:

### **1. Swing ile MVC**
- **Model:** Kullanıcı veya ürün gibi nesneler.
- **View:** JFrame, JLabel, JTextField gibi bileşenler.
- **Controller:** Kullanıcı etkileşimlerini yöneten sınıf.

### **2. Web Uygulamaları için MVC**
Java web uygulamalarında **Spring MVC, JSP/Servlet** teknolojileri ile uygulanır.

#### **Spring Boot ile Basit MVC Örneği**
**Model Katmanı (User.java)**
```java
@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String email;
    
    // Getter - Setter
}
```

**Controller Katmanı (UserController.java)**
```java
@RestController
@RequestMapping("/users")
public class UserController {
    @Autowired
    private UserRepository userRepository;

    @GetMapping("/{id}")
    public ResponseEntity<User> getUser(@PathVariable Long id) {
        Optional<User> user = userRepository.findById(id);
        return user.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }
}
```

**View Katmanı (user.html - Thymeleaf)**
```html
<!DOCTYPE html>
<html>
<head>
    <title>User Details</title>
</head>
<body>
    <h1>User Details</h1>
    <p>Name: <span th:text="${user.name}"></span></p>
    <p>Email: <span th:text="${user.email}"></span></p>
</body>
</html>
```

---

## **4. MVC'nin Avantajları ve Dezavantajları**
### **Avantajları**
✅ **Kodun Modülerliği:** Model, View ve Controller ayrı katmanlarda olduğu için kod yönetimi kolaydır.  
✅ **Bakımı Kolay:** Bir bileşende yapılan değişiklik diğerlerini etkilemez.  
✅ **Test Edilebilirlik:** Her katman ayrı test edilebilir.  
✅ **Yeniden Kullanılabilirlik:** Aynı Model veya Controller farklı View’lerle kullanılabilir.

### **Dezavantajları**
❌ **Başlangıçta Fazla Kod Yazma Gereksinimi:** Küçük projeler için karmaşık olabilir.  
❌ **Fazladan Katmanlar Performans Maliyeti Getirebilir:** Büyük ölçekli projelerde optimize edilmesi gerekir.

---

## **Sonuç**
Java'da **MVC mimarisi**, uygulamaların sürdürülebilirliğini ve genişletilebilirliğini artıran güçlü bir mimari desenidir. **Spring Boot, Java Swing, JavaFX ve JSP gibi teknolojilerde** yaygın olarak kullanılır. Model, View ve Controller bileşenleri sayesinde **katmanlı bir yapı sunarak, kodun okunabilirliğini ve test edilebilirliğini iyileştirir**.

Bu mimariyi kullanarak, hem masaüstü hem de web tabanlı uygulamalar geliştirebilirsiniz! 🚀

## **5. Java 8 ve Sonrasında Interface Geliştirmeleri**
Java 8 ile birlikte **interface'ler artık gövdesi olan metotlara sahip olabilir**. Bunlar:
1. **Default Metodlar** (default methods)
2. **Static Metodlar** (static methods)

### **5.1 Default Methods (Varsayılan Metodlar)**
Interface içinde **default** anahtar kelimesiyle metot tanımlanabilir. Bu metotların bir gövdesi olur ve tüm implementasyonlar bu metodu miras alabilir.

```java
interface Vehicle {
    default void start() {
        System.out.println("Araç çalıştırıldı!");
    }
}

class Car implements Vehicle {
    // start() metodunu override etmek zorunda değiliz!
}

public class DefaultMethodExample {
    public static void main(String[] args) {
        Car car = new Car();
        car.start(); // Çıktı: Araç çalıştırıldı!
    }
}
```
**Faydası:** Eğer bir interface’e yeni bir metod eklersek, onu implement eden eski kodlar bozulmaz.

---

### **5.2 Static Methods (Statik Metodlar)**
Java 8 ile interface içinde **static metotlar** tanımlanabilir. Bunlar interface'e özgüdür ve çağırmak için interface adı kullanılır.

```java
interface Utility {
    static void printMessage(String message) {
        System.out.println(message);
    }
}

public class StaticMethodExample {
    public static void main(String[] args) {
        Utility.printMessage("Merhaba, Java 8!");
    }
}
```
**Faydası:** Yardımcı metotları (utility methods) interface içinde gruplamak.

---

## **6. Marker Interfaces (İşaretleyici Arayüzler)**
Bazı interface'ler **hiçbir metod içermez** ama yine de bir sınıfın belirli bir kategoriye ait olduğunu belirtmek için kullanılır. Bu tür interface'lere **Marker Interface** denir.

### **Örnek: Serializable Interface**
```java
import java.io.Serializable;

class Person implements Serializable {
    String name;
    int age;
}
```
Burada `Person` sınıfı `Serializable` interface’ini implement ediyor, fakat herhangi bir metod yazmak zorunda değil. JVM, `Serializable` interface’ini kullanarak nesneleri **dizi (byte stream) halinde kaydedebilir veya gönderebilir.**

Diğer **Marker Interface’ler**:
- `Cloneable`
- `Remote`

---

## **Sonuç**
- **Interface, bir sınıfın uygulaması gereken metodları belirler.**
- **Soyut (abstract) metodlar içerir ve bu metodların implement edilmesi gerekir.**
- **Bir sınıf birden fazla interface implement edebilir.**
- **Java 8 ile gelen `default` ve `static` metodlar sayesinde, interface'ler daha güçlü hale gelmiştir.**
- **Marker Interface’ler, bir sınıfın belirli bir yeteneğe sahip olduğunu göstermek için kullanılır.**

**Java'da Interface kullanımı, esneklik ve modülerlik sağladığı için yaygın olarak tercih edilir. 🚀**


## CSV Nedir ?
```sh 

```
---
### **CSV (Comma-Separated Values) Nedir?**
CSV, **Comma-Separated Values (Virgülle Ayrılmış Değerler)** anlamına gelen bir dosya formatıdır. Verileri **düz metin dosyası** olarak saklar ve her satır, bir veri kaydını temsil eder. **Sütunlar ise genellikle virgül (`,`) ile ayrılır.**

### **CSV Formatının Temel Yapısı**
- **Her satır bir kaydı temsil eder.**
- **Veri alanları (sütunlar) virgülle ayrılır.**
- **Genellikle `.csv` uzantılı bir dosyada saklanır.**
- **Veri tabanı tablolarına benzer bir yapıdadır.**

---

### **Örnek CSV Formatı**
Aşağıdaki CSV dosyasında **öğrenci bilgileri** bulunmaktadır:

```
1,Ali,Kaya,75.5,88.0,82.2,2001-05-20,UNDERGRADUATE
2,Ayşe,Demir,60.0,75.0,69.0,1999-07-10,GRADUATE
3,Mehmet,Yıldız,85.0,90.0,88.0,2000-02-15,PHD
```

Buradaki **sütunlar şunlardır:**
| ID | Ad | Soyad | Vize | Final | Sonuç Notu | Doğum Tarihi | Eğitim Türü |
|----|----|-------|------|-------|------------|-------------|-------------|
| 1  | Ali  | Kaya  | 75.5 | 88.0 | 82.2       | 2001-05-20  | UNDERGRADUATE |
| 2  | Ayşe | Demir | 60.0 | 75.0 | 69.0       | 1999-07-10  | GRADUATE |
| 3  | Mehmet | Yıldız | 85.0 | 90.0 | 88.0   | 2000-02-15  | PHD |

---

### **CSV'nin Kullanım Alanları**
📌 **Veri Depolama:** Küçük ölçekli uygulamalarda verileri saklamak için kullanılır.  
📌 **Veri Transferi:** Farklı sistemler arasında veri alışverişi için yaygın olarak kullanılır.  
📌 **Tablolar ve Raporlama:** Excel, Google Sheets gibi programlarda açılıp düzenlenebilir.  
📌 **Veritabanı Entegrasyonu:** CSV formatındaki veriler, veritabanına kolayca aktarılabilir.

---

### **CSV ile JSON Karşılaştırması**
| **Özellik**   | **CSV** | **JSON** |
|--------------|--------|--------|
| **Veri Yapısı** | Düz metin, satır-sütun bazlı | Hiyerarşik, nesne tabanlı |
| **İnsan Okunabilirliği** | Kolay okunur | Daha yapılandırılmış, bazen karmaşık olabilir |
| **Dosya Boyutu** | Daha küçük | Daha büyük |
| **Destekleyen Programlar** | Excel, Google Sheets, Python, Java, Veritabanları | JavaScript, Python, Web API’leri |

---

### **CSV Kullanımı Java'da Neden Önemlidir?**
✔ **Hafiftir:** Karmaşık veritabanları gerektirmez.  
✔ **Kolay Kullanılır:** `BufferedReader` ve `BufferedWriter` ile kolayca okunup yazılabilir.  
✔ **Esnektir:** Çeşitli programlar arasında veri alışverişi yapmak için uygundur.  
✔ **Performanslıdır:** JSON veya XML gibi diğer formatlara göre daha hızlı işlenebilir.

---

Bu yüzden sizin kodunuzda **CSV formatı**, öğrencileri dosyaya yazmak ve tekrar yüklemek için kullanılıyor.  
👉 **Öğrenci bilgilerini bir satır olarak kaydediyor ve tekrar nesneye dönüştürüyor.** 🚀


## Interface Nedir ?
```sh 

```
---

# **Java'da Interface (Arayüz) Nedir?**
Java'da **interface (arayüz)**, bir sınıfın uygulayabileceği bir **sözleşmeyi (contract)** tanımlayan bir yapıdır. Interface, bir sınıfın belirli metodları uygulamasını garanti eder, ancak metodların içeriğini (implementasyonunu) belirlemez. Yani, bir interface sadece metod imzalarını tanımlar ve bu metodları uygulayan sınıflar, bu metodları kendilerine uygun şekilde doldurmalıdır.

Java'daki interface'ler **çoklu kalıtımı (multiple inheritance)** desteklemek ve **bağımsız modüler kod yazılmasını** sağlamak için kullanılır. **Polimorfizm (çok biçimlilik)** ve **bağımsızlık (decoupling)** gibi nesne yönelimli programlama (OOP) prensiplerini destekler.

---

## **1. Interface Tanımı ve Kullanımı**
### **Temel Interface Tanımı**
Bir interface, **`interface`** anahtar kelimesiyle tanımlanır. İçinde **soyut (abstract) metodlar** ve **sabit değişkenler (constants)** barındırabilir.

```java
interface Animal {
    void eat();  // Soyut metod
    void sleep();
}
```
- **Metodlar:** Varsayılan olarak **public ve abstract** olur, bu yüzden `public abstract` yazmaya gerek yoktur.
- **Değişkenler:** Interface içindeki tüm değişkenler varsayılan olarak **public, static ve final** olur.

---

## **2. Interface Kullanımı (Implement Edilmesi)**
Bir sınıf, **`implements`** anahtar kelimesini kullanarak bir interface'i uygular (implement eder).

### **Örnek: Bir Interface’i Uygulama**
```java
interface Animal {
    void eat();
    void sleep();
}

// Dog sınıfı, Animal interface'ini uyguluyor.
class Dog implements Animal {
    @Override
    public void eat() {
        System.out.println("Köpek yemek yiyor.");
    }

    @Override
    public void sleep() {
        System.out.println("Köpek uyuyor.");
    }
}

public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.eat();  // Çıktı: Köpek yemek yiyor.
        dog.sleep(); // Çıktı: Köpek uyuyor.
    }
}
```
Burada:
- **`Dog` sınıfı**, `Animal` interface'ini uygulamak zorunda olduğu için `eat()` ve `sleep()` metodlarını tanımlamak zorundadır.
- Eğer bir sınıf, bir interface’i uygular ancak tüm metodlarını tanımlamazsa, **abstract** olarak işaretlenmelidir.

---

## **3. Interface İçinde Değişkenler (Sabitler)**
Bir interface içinde tanımlanan değişkenler, **otomatik olarak public, static ve final olur**. Yani interface içindeki değişkenler **sabit (constant)** değerlerdir.

### **Örnek: Interface İçinde Sabit Kullanımı**
```java
interface MathConstants {
    double PI = 3.141592653589793; // public, static, final olarak kabul edilir.
}

// PI değerini kullanan bir sınıf
class Circle {
    public double getArea(double radius) {
        return MathConstants.PI * radius * radius;
    }
}

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle();
        System.out.println("Dairenin Alanı: " + circle.getArea(5));
    }
}
```
**Önemli Not:** Interface içindeki değişkenler **değiştirilemez**, çünkü **final** olarak kabul edilir.

---

## **4. Çoklu Kalıtım (Multiple Inheritance) ve Interface**
Java, **class’lar arasında çoklu kalıtımı (multiple inheritance) desteklemez**, ancak birden fazla interface uygulamaya izin verir. Bu, kodun daha esnek ve modüler olmasını sağlar.

### **Örnek: Bir Sınıfın Birden Fazla Interface’i Uygulaması**
```java
interface Flyable {
    void fly();
}

interface Swimmable {
    void swim();
}

class Bird implements Flyable, Swimmable {
    @Override
    public void fly() {
        System.out.println("Kuş uçuyor.");
    }

    @Override
    public void swim() {
        System.out.println("Kuş yüzebiliyor.");
    }
}

public class Main {
    public static void main(String[] args) {
        Bird bird = new Bird();
        bird.fly();  // Çıktı: Kuş uçuyor.
        bird.swim(); // Çıktı: Kuş yüzebiliyor.
    }
}
```
**Burada:**
- `Bird` sınıfı hem `Flyable` hem de `Swimmable` interface’ini uyguluyor.
- Java, birden fazla interface uygulamayı desteklediği için `Bird` sınıfı birden fazla interface'in metodlarını yazabiliyor.

---


## Kalıtım Nedir ?
```sh 

```
---
## **Java'da Kalıtım (Inheritance) Nedir?**

**Kalıtım (Inheritance)**, nesne yönelimli programlamada (OOP) en temel kavramlardan biridir. Kalıtım, bir sınıfın (class), başka bir sınıfın özelliklerini (alanlarını/field) ve davranışlarını (metotlarını) miras almasını sağlar. Java'da kalıtım, **code reusability (kod tekrar kullanımı)** ve **hiyerarşik organizasyon** sağlamak için kullanılır.

---

## **1. Kalıtımın Temel Mantığı**
Bir **alt sınıf (subclass, child class)**, bir **üst sınıftan (superclass, parent class)** miras alır. Alt sınıf, üst sınıfta tanımlanan değişkenleri ve metotları tekrar yazmaya gerek kalmadan kullanabilir ve üzerine yeni özellikler ekleyebilir.

Java'da bir sınıf başka bir sınıfı miras almak için **`extends`** anahtar kelimesini kullanır.

### **Örnek: Basit Kalıtım**
```java
// Üst sınıf (Parent / Superclass)
class Hayvan {
    String isim;

    void sesCikar() {
        System.out.println("Hayvan ses çıkarıyor...");
    }
}

// Alt sınıf (Child / Subclass)
class Kedi extends Hayvan {
    void miyavla() {
        System.out.println("Kedi miyavlıyor: Miyav Miyav!");
    }
}

public class Main {
    public static void main(String[] args) {
        Kedi kedi = new Kedi();
        kedi.isim = "Pamuk"; // Üst sınıftan miras alınan özellik
        kedi.sesCikar();  // Üst sınıftan miras alınan metot
        kedi.miyavla();  // Alt sınıfa özgü metot

        System.out.println("Kedinin Adı: " + kedi.isim);
    }
}
```
### **Çıktı:**
```
Hayvan ses çıkarıyor...
Kedi miyavlıyor: Miyav Miyav!
Kedinin Adı: Pamuk
```

---

## **2. Kalıtım Türleri**
Java'da **çoklu kalıtım (multiple inheritance)** **sınıflar arasında desteklenmez**, ancak farklı türde kalıtımlar vardır:

### **A. Tekli Kalıtım (Single Inheritance)**
Bir sınıfın yalnızca **bir** sınıftan miras almasıdır.
```java
class A { /* ... */ }
class B extends A { /* ... */ } // B sınıfı, A sınıfından türedi.
```

### **B. Çok Katmanlı Kalıtım (Multilevel Inheritance)**
Bir sınıf, başka bir sınıftan türemiş bir sınıfı miras alır. **A → B → C** şeklinde bir zincir oluşur.
```java
class A {
    void mesaj() {
        System.out.println("Bu A sınıfı.");
    }
}

class B extends A { }

class C extends B { }

public class Main {
    public static void main(String[] args) {
        C c = new C();
        c.mesaj(); // A sınıfından miras alındı
    }
}
```
### **Çıktı:**
```
Bu A sınıfı.
```

### **C. Hiyerarşik Kalıtım (Hierarchical Inheritance)**
Birden fazla alt sınıfın aynı üst sınıftan türemesi durumudur.
```java
class Hayvan {
    void beslen() {
        System.out.println("Hayvan besleniyor...");
    }
}

class Kedi extends Hayvan {
    void miyavla() {
        System.out.println("Kedi miyavlıyor.");
    }
}

class Köpek extends Hayvan {
    void havla() {
        System.out.println("Köpek havlıyor.");
    }
}

public class Main {
    public static void main(String[] args) {
        Kedi kedi = new Kedi();
        kedi.beslen();
        kedi.miyavla();

        Köpek kopek = new Köpek();
        kopek.beslen();
        kopek.havla();
    }
}
```
### **Çıktı:**
```
Hayvan besleniyor...
Kedi miyavlıyor.
Hayvan besleniyor...
Köpek havlıyor.
```

### **D. Java'da Çoklu Kalıtım (Multiple Inheritance) Desteklenmez**
Java, **class** düzeyinde **çoklu kalıtımı** desteklemez. Çünkü **birden fazla üst sınıftan aynı isimde metodlar miras alınırsa** bir çakışma (ambiguity) sorunu ortaya çıkar.

---

## **3. `super` Anahtar Kelimesi**
**`super`**, alt sınıftan üst sınıfa erişmek için kullanılır.

- **Üst sınıfın constructor'ını çağırmak için**: `super(parametreler)`
- **Üst sınıfın metodunu çağırmak için**: `super.metodAdi()`
- **Üst sınıfın değişkenine erişmek için**: `super.degiskenAdi`

### **Örnek: `super` Kullanımı**
```java
class Hayvan {
    String isim = "Genel Hayvan";

    void sesCikar() {
        System.out.println("Hayvan sesi çıkarıyor...");
    }
}

class Kedi extends Hayvan {
    String isim = "Kedi";

    void sesCikar() {
        super.sesCikar(); // Üst sınıfın metodunu çağırır
        System.out.println("Miyav Miyav!");
    }

    void yazdir() {
        System.out.println("Alt sınıftaki isim: " + isim);
        System.out.println("Üst sınıftaki isim: " + super.isim);
    }
}

public class Main {
    public static void main(String[] args) {
        Kedi kedi = new Kedi();
        kedi.sesCikar();
        kedi.yazdir();
    }
}
```
### **Çıktı:**
```
Hayvan sesi çıkarıyor...
Miyav Miyav!
Alt sınıftaki isim: Kedi
Üst sınıftaki isim: Genel Hayvan
```

---

## **4. `final` Anahtar Kelimesi ile Kalıtım Kısıtlaması**
**`final`** anahtar kelimesiyle bir sınıfın veya metodun miras alınması engellenebilir:

### **A. `final` ile Sınıfın Miras Alınmasını Engelleme**
```java
final class Hayvan { } 

class Kedi extends Hayvan { } // HATA: 'Hayvan' miras alınamaz!
```

### **B. `final` ile Metodun Override Edilmesini Engelleme**
```java
class Hayvan {
    final void sesCikar() {
        System.out.println("Hayvan sesi çıkarıyor...");
    }
}

class Kedi extends Hayvan {
    void sesCikar() { // HATA: final metod override edilemez!
        System.out.println("Miyav Miyav!");
    }
}
```

---

## **Sonuç**
- **Kalıtım**, **kod tekrarını azaltır** ve **daha düzenli kod yazmayı sağlar**.
- **`extends` anahtar kelimesi** ile miras alınır.
- **`super` anahtar kelimesi** üst sınıfın özelliklerine/metotlarına erişmek için kullanılır.
- **`final` anahtar kelimesi**, miras alınmayı veya metodun override edilmesini engelleyebilir.
- Java **çoklu kalıtımı desteklemez**, ancak **hiyerarşik ve çok katmanlı kalıtım** mümkündür.

Bu bilgilerle, Java'da kalıtımı verimli bir şekilde kullanabilir ve OOP prensiplerini daha iyi anlayabilirsiniz! 🚀


## Polymorphism Nedir ?
```sh 

```
---

# **Java'da Polymorphism (Çok Biçimlilik) Nedir?**

**Polymorphism (Çok Biçimlilik)**, nesne yönelimli programlamanın (OOP) en önemli kavramlarından biridir. **"Poly" (çok) ve "Morph" (biçim)"** kelimelerinden türemiştir. **Aynı isimli bir metodun, farklı şekillerde davranabilmesini sağlar**. Bu sayede, **kod tekrarını azaltır**, **esneklik sağlar** ve **bakımı kolaylaştırır**.

Java'da **Polymorphism** iki şekilde gerçekleşir:
1. **Metot Overloading (Metot Aşırı Yükleme) → Compile-time Polymorphism**
2. **Metot Overriding (Metot Geçersiz Kılma) → Runtime Polymorphism**

---

## **1. Compile-Time Polymorphism (Derleme Zamanı Polymorphism - Metot Overloading)**
Bu tür **polymorphism**, **aynı isimde bir metodun farklı parametreler ile tanımlanmasıyla** elde edilir. Derleme zamanında hangi metodun çağrılacağı bellidir.

### **Metot Overloading (Metot Aşırı Yükleme)**
- Aynı sınıf içinde **aynı isimli metodun farklı parametreler** ile tanımlanmasıdır.
- **Dönüş tipi değişse bile**, sadece dönüş tipinin değişmesi **overloading için yeterli değildir**.
- **JVM (Java Virtual Machine) hangi metodun çağrılacağını derleme (compile-time) sırasında belirler.**

### **Örnek 1: Metot Overloading**
```java
class HesapMakinesi {
    // İki sayıyı toplama metodu
    int topla(int a, int b) {
        return a + b;
    }

    // Üç sayıyı toplama metodu (Aynı isim, farklı parametre sayısı)
    int topla(int a, int b, int c) {
        return a + b + c;
    }

    // Ondalıklı sayıları toplama metodu (Aynı isim, farklı parametre türü)
    double topla(double a, double b) {
        return a + b;
    }
}

public class Main {
    public static void main(String[] args) {
        HesapMakinesi h = new HesapMakinesi();

        System.out.println(h.topla(5, 10));        // 15
        System.out.println(h.topla(5, 10, 20));    // 35
        System.out.println(h.topla(3.5, 2.5));     // 6.0
    }
}
```
### **Çıktı:**
```
15
35
6.0
```
> **Not:** Java, hangi metodun çalıştırılacağını **parametre türlerine ve sayısına göre** derleme zamanında belirler.

---

## **2. Runtime Polymorphism (Çalışma Zamanı Polymorphism - Metot Overriding)**
Bu tür **polymorphism**, **alt sınıfın (subclass), üst sınıftan (superclass) aldığı bir metodu kendi içinde tekrar tanımlamasıyla** sağlanır. **Hangi metodun çağrılacağı çalışma zamanında belirlenir.**

### **Metot Overriding (Metot Geçersiz Kılma)**
- **Üst sınıfta (parent class) tanımlı bir metodun, alt sınıfta (child class) tekrar tanımlanmasıdır.**
- **Metod ismi, dönüş tipi ve parametre listesi aynı olmalıdır.**
- **Alt sınıfta metodun davranışı değiştirilebilir.**
- **Overriding işlemi için `@Override` anotasyonu kullanılır (zorunlu değildir ama önerilir).**
- **Polymorphism sayesinde, bir üst sınıf referansı ile alt sınıf nesneleri çağrılabilir.**

### **Örnek 2: Metot Overriding**
```java
class Hayvan {
    void sesCikar() {
        System.out.println("Hayvan ses çıkarıyor...");
    }
}

class Kedi extends Hayvan {
    @Override
    void sesCikar() {
        System.out.println("Miyav Miyav!");
    }
}

class Köpek extends Hayvan {
    @Override
    void sesCikar() {
        System.out.println("Hav Hav!");
    }
}

public class Main {
    public static void main(String[] args) {
        Hayvan h1 = new Kedi();  // Üst sınıf referansı ile alt sınıf nesnesi
        Hayvan h2 = new Köpek(); // Üst sınıf referansı ile alt sınıf nesnesi

        h1.sesCikar(); // Çalışma zamanında "Miyav Miyav!" çalışır
        h2.sesCikar(); // Çalışma zamanında "Hav Hav!" çalışır
    }
}
```
### **Çıktı:**
```
Miyav Miyav!
Hav Hav!
```
> **Not:** `h1` ve `h2` nesneleri **üst sınıfın (Hayvan) referansı ile tanımlandı**, ancak **alt sınıfların (Kedi, Köpek) metodları çalıştırıldı**. İşte bu çalışma zamanı polymorphism'idir.

---

## **3. Polymorphism'in Faydaları**
1. **Kod tekrarını azaltır ve yeniden kullanılabilirliği artırır.**
2. **Esnek ve ölçeklenebilir kod yazmayı sağlar.**
3. **İlerleyen seviyede "Abstraction" ve "Interface" ile birlikte güçlü tasarımlar oluşturulmasını sağlar.**

---

## **4. `super` Anahtar Kelimesi ile Overriding Kullanımı**
Bir alt sınıfta, **üst sınıfın metodunu çağırmak için** `super.metodAdi()` kullanılır.

### **Örnek 3: `super` ile Overriding**
```java
class Arac {
    void hizGoster() {
        System.out.println("Araç hız gösteriyor...");
    }
}

class Araba extends Arac {
    @Override
    void hizGoster() {
        super.hizGoster(); // Üst sınıfın metodunu çağırır
        System.out.println("Araba 120 km/h hız gösteriyor.");
    }
}

public class Main {
    public static void main(String[] args) {
        Araba araba = new Araba();
        araba.hizGoster();
    }
}
```
### **Çıktı:**
```
Araç hız gösteriyor...
Araba 120 km/h hız gösteriyor.
```
---

## **5. `final` ile Polymorphism'i Kısıtlama**
Java'da `final` anahtar kelimesi kullanılarak bir metodun **override edilmesi engellenebilir**.

### **Örnek 4: `final` ile Overriding Engelleme**
```java
class Hayvan {
    final void sesCikar() {
        System.out.println("Hayvan sesi çıkarıyor...");
    }
}

class Kedi extends Hayvan {
    // @Override
    // void sesCikar() { // HATA! final metod override edilemez
    //     System.out.println("Miyav Miyav!");
    // }
}
```
> `sesCikar` metodu `final` olduğu için **Kedi sınıfında değiştirilemez (override edilemez).**

---

## **Özet**
| Polymorphism Türü | Açıklama | Kullanılan Teknik |
|-------------------|----------|------------------|
| **Compile-time Polymorphism** | Aynı sınıf içinde aynı isimde metodlar, farklı parametrelerle tanımlanır. | **Method Overloading (Metot Aşırı Yükleme)** |
| **Runtime Polymorphism** | Üst sınıftaki bir metod, alt sınıfta tekrar tanımlanır ve çalışma zamanında çağrılır. | **Method Overriding (Metot Geçersiz Kılma)** |

### **Sonuç**
- **Overloading**, aynı metodun **farklı parametrelerle** tanımlanmasını sağlar.
- **Overriding**, alt sınıfların **üst sınıf metodlarını değiştirerek özelleştirmesine** olanak tanır.
- **Polymorphism**, kodu daha **esnek, yönetilebilir ve genişletilebilir** hale getirir.

Bu kavramlar Java'nın temel prensiplerinden biridir ve yazılım geliştirmede büyük avantajlar sağlar. 🚀


## Abstract Nedir ?
```sh 

```
---

# **Java'da Abstract Nedir? (Detaylı Açıklama)**

Java'da **abstract** kelimesi, "soyut" anlamına gelir ve nesne yönelimli programlamada (OOP - Object Oriented Programming) kullanılan önemli bir kavramdır. Java'da **abstract sınıflar (abstract class)** ve **abstract metotlar (abstract methods)**, kodun daha esnek ve yeniden kullanılabilir olmasını sağlamak için kullanılır.

Bu yazıda, **abstract** kavramını en ince detayına kadar inceleyeceğiz.

---

## **1. Java'da Abstract Sınıf (Abstract Class) Nedir?**
### **Tanım:**
- **Abstract sınıf**, doğrudan bir nesnesi oluşturulamayan (instantiate edilemeyen) ve alt sınıflar tarafından miras alınması gereken bir sınıftır.
- İçinde **abstract (soyut) metotlar** ve **normal metotlar** bulunabilir.
- **Abstract metotlar**, gövdesi olmayan (sadece tanımı yapılan) metotlardır. Alt sınıflar tarafından **override (ezilerek uygulanması)** zorunludur.

### **Örnek Durum:**
Gerçek dünyadan bir örnek düşünelim:
- "Hayvan" genel bir kavramdır. Ancak bir **"Hayvan" nesnesi oluşturamayız** çünkü hayvanın türü belli değildir.
- Ancak **"Kedi", "Köpek" gibi türetilmiş sınıflar** oluşturabiliriz.
- İşte bu noktada, **"Hayvan" sınıfını abstract olarak tanımlarız** ve alt sınıfların ("Kedi", "Köpek") bu yapıyı kullanmasını sağlarız.

---

## **2. Java'da Abstract Sınıf Kullanımı (Örnekler ve Açıklamalar)**

### **2.1 Basit Bir Abstract Sınıf Örneği**
```java
// Abstract sınıf oluşturuluyor
abstract class Hayvan {
    // Abstract metod (gövdesi yok, alt sınıflar implement etmek zorunda)
    abstract void sesCikar();
    
    // Normal metod (gövdesi var, alt sınıflar miras alabilir)
    void yasamDongusu() {
        System.out.println("Bütün hayvanlar doğar, büyür ve ölür.");
    }
}

// Kedi sınıfı, Hayvan sınıfından miras alıyor
class Kedi extends Hayvan {
    // Abstract metodu override ediyor
    void sesCikar() {
        System.out.println("Miyav!");
    }
}

// Köpek sınıfı, Hayvan sınıfından miras alıyor
class Kopek extends Hayvan {
    // Abstract metodu override ediyor
    void sesCikar() {
        System.out.println("Hav hav!");
    }
}

public class Main {
    public static void main(String[] args) {
        // Hayvan sınıfının nesnesi oluşturulamaz!
        // Hayvan h = new Hayvan();  // Hata verir!

        Hayvan kedi = new Kedi();
        kedi.sesCikar();  // Çıktı: Miyav!
        kedi.yasamDongusu(); // Çıktı: Bütün hayvanlar doğar, büyür ve ölür.

        Hayvan kopek = new Kopek();
        kopek.sesCikar();  // Çıktı: Hav hav!
        kopek.yasamDongusu(); // Çıktı: Bütün hayvanlar doğar, büyür ve ölür.
    }
}
```

### **Kod Açıklamaları:**
- **`Hayvan` sınıfı abstract olarak tanımlandı.**
- `sesCikar()` metodu **abstract metod** olarak tanımlandı, bu yüzden **alt sınıflar bunu kesinlikle override (ezerek) etmek zorunda.**
- `yasamDongusu()` metodu ise **normal bir metod** olduğu için alt sınıflar bunu miras aldı.
- `Kedi` ve `Köpek` sınıfları `Hayvan` sınıfını **extend (miras alarak)** etti ve `sesCikar()` metodunu kendi ihtiyaçlarına göre doldurdu.

---

## **3. Abstract Sınıfın Kuralları ve Özellikleri**
### **3.1 Abstract Sınıfın İçinde Neler Olabilir?**
| **Özellik** | **Abstract Sınıfta Kullanımı** |
|------------|--------------------------------|
| **Abstract metod** | Evet (Gövdesiz olarak tanımlanmalı) |
| **Normal metod (gövdesi olan metodlar)** | Evet |
| **Değişkenler (fields)** | Evet (Ancak `final` olmamalı) |
| **Constructors (Yapıcı metodlar)** | Evet |
| **Static metodlar** | Evet (Ancak abstract olamazlar) |

---

## **4. Abstract Metot Nedir?**
### **Tanım:**
- **Abstract metot**, sadece **tanımlanmış** ancak **gövdesi olmayan** bir metottur.
- **Alt sınıflar (subclasses), bu metodu override etmek zorundadır.**

### **Örnek:**
```java
abstract class Sekil {
    abstract void alanHesapla(); // Gövdesi olmayan abstract metod
}

class Kare extends Sekil {
    int kenar;

    Kare(int kenar) {
        this.kenar = kenar;
    }

    void alanHesapla() {
        System.out.println("Karenin Alanı: " + (kenar * kenar));
    }
}

class Daire extends Sekil {
    double yaricap;

    Daire(double yaricap) {
        this.yaricap = yaricap;
    }

    void alanHesapla() {
        System.out.println("Dairenin Alanı: " + (Math.PI * yaricap * yaricap));
    }
}

public class Main {
    public static void main(String[] args) {
        Sekil kare = new Kare(4);
        kare.alanHesapla(); // Çıktı: Karenin Alanı: 16

        Sekil daire = new Daire(3);
        daire.alanHesapla(); // Çıktı: Dairenin Alanı: 28.27
    }
}
```
- `Sekil` sınıfı abstract olarak tanımlandı.
- `alanHesapla()` metodu **abstract metod** olduğu için alt sınıflar bunu kesinlikle implement etmek zorunda.
- `Kare` ve `Daire` sınıfları bu metodu kendi ihtiyaçlarına göre doldurdu.

---

## **5. Abstract ile Interface Farkı**
| **Karşılaştırma** | **Abstract Class** | **Interface** |
|-------------------|-------------------|--------------|
| **Tanım** | Normal ve abstract metodları içeren bir sınıf | Sadece metod imzaları (Java 8+ ile varsayılan metodlar eklenebilir) |
| **Metodlar** | Abstract + Normal metodlar olabilir | Tüm metodlar varsayılan olarak abstract’tır (Java 8+ ile default metodlar eklenebilir) |
| **Değişkenler** | Değişkenler olabilir | Değişkenler **public static final** olmalıdır |
| **Miras (Inheritance)** | Sadece **bir abstract class** extend edilebilir | Birden fazla interface **implement edilebilir** |

---

## **6. Avantajları ve Dezavantajları**
### **Avantajlar:**
✅ **Kod tekrarını önler:** Soyut sınıflar, ortak davranışları miras yoluyla tekrar kullanmayı sağlar.  
✅ **Geliştirmeyi kolaylaştırır:** Alt sınıflar, abstract metodları kendi ihtiyaçlarına göre doldurabilir.  
✅ **Daha iyi yapı sağlar:** Programcıları belli metodları kullanmaya zorlar, böylece yapı korunur.

### **Dezavantajlar:**
❌ **Çok fazla kullanılırsa karmaşıklık yaratabilir.**  
❌ **Bir sınıf yalnızca bir abstract sınıftan türeyebilir.** (Interface ile birden fazla kalıtım yapılabilir.)

---

## **Sonuç**
- **Abstract sınıflar**, kalıtım (inheritance) kullanarak ortak özellikleri paylaşan sınıflar için idealdir.
- **Abstract metotlar**, alt sınıfların override etmesini zorunlu kılar.
- **Abstract sınıf ile interface arasındaki farkları bilmek**, en iyi uygulamaları seçmek için önemlidir.

Java'da **abstract yapılar, kodun daha düzenli ve yönetilebilir olmasını sağlar.**



## Record
```sh 

```
---
# **Java'da Record (Kayıt) Nedir?**
Java 14 ile birlikte **Record** yapısı tanıtıldı ve Java 16 itibarıyla **tamamen kararlı (stable)** hale geldi. **Record**, özellikle veri taşıma nesneleri (DTO - Data Transfer Object) için optimize edilmiş, **immutable (değiştirilemez)** ve **daha az kod gerektiren** bir veri yapısıdır.

### **Record Neden Kullanılır?**
Record’lar, özellikle **veri saklamak** ve **bu verilere erişimi sağlamak** amacıyla kullanılan sınıflardır. Geleneksel Java sınıflarına göre avantajları şunlardır:
- **Daha az kod yazma gereksinimi**: Getter, constructor, `equals()`, `hashCode()` ve `toString()` gibi metotları otomatik olarak oluşturur.
- **Immutable (Değiştirilemez) yapı**: Bir Record nesnesinin alanları (`fields`) değiştirilemez.
- **Daha iyi performans**: JVM tarafından optimize edilmiştir.

---

## **Record Tanımlama ve Kullanımı**
Bir **Record** tanımlamak için `record` anahtar kelimesi kullanılır. İçerisinde **field’ları (alanları)** tanımladıktan sonra, Java otomatik olarak **constructor, getter metotları, `equals()`, `hashCode()` ve `toString()` metotlarını oluşturur.**

Örnek:
```java
public record Kisi(String ad, int yas) { }
```
Bu tanımlama, aşağıdaki klasik sınıfın yaptığı işi otomatik olarak gerçekleştirir:

```java
public class Kisi {
    private final String ad;
    private final int yas;

    public Kisi(String ad, int yas) {
        this.ad = ad;
        this.yas = yas;
    }

    public String getAd() { return ad; }
    public int getYas() { return yas; }

    @Override
    public boolean equals(Object o) { /* eşitlik kontrolü */ }
    
    @Override
    public int hashCode() { /* hash hesaplama */ }

    @Override
    public String toString() { return "Kisi[ad=" + ad + ", yas=" + yas + "]"; }
}
```
**Görüldüğü gibi `record`, büyük miktarda kod yazmayı önlüyor!**

---

## **Record Kullanımı**
Bir `record` nesnesi oluşturma ve kullanma:
```java
public class RecordOrnek {
    public static void main(String[] args) {
        Kisi kisi = new Kisi("Ahmet", 25);
        
        System.out.println(kisi.ad());  // "Ahmet"
        System.out.println(kisi.yas()); // 25
        System.out.println(kisi);       // Kisi[ad=Ahmet, yas=25]
    }
}
```
### **Çıktı:**
```
Ahmet
25
Kisi[ad=Ahmet, yas=25]
```

---

## **Record Özellikleri**
### **1. Getter Metotları**
Record içindeki değişkenlere erişmek için `getter` metotları kullanılır. Ancak, **getter metotlarının adı, değişken adıyla aynıdır** (Yani `getAd()` yerine doğrudan `ad()` kullanılır):

```java
public record Kitap(String ad, String yazar) { }

public class Test {
    public static void main(String[] args) {
        Kitap kitap = new Kitap("1984", "George Orwell");
        System.out.println(kitap.ad());   // 1984
        System.out.println(kitap.yazar()); // George Orwell
    }
}
```

### **2. Immutable (Değiştirilemez) Olması**
Bir `record` nesnesi **değiştirilemez (immutable)** olduğu için, bir nesne oluşturulduktan sonra **alanları değiştirilemez**:

```java
Kisi kisi = new Kisi("Mehmet", 30);
kisi.ad = "Ali"; // HATA! Record'lar immutable’dır.
```
Bu özellik sayesinde, Record’lar **veri taşıma nesneleri** (DTO) olarak çok güvenlidir.

### **3. equals(), hashCode() ve toString() Otomatik Oluşturulur**
Record kullanımı ile Java, `equals()`, `hashCode()` ve `toString()` metotlarını otomatik oluşturur.

Örnek:
```java
Kisi kisi1 = new Kisi("Ahmet", 25);
Kisi kisi2 = new Kisi("Ahmet", 25);

System.out.println(kisi1.equals(kisi2)); // true
System.out.println(kisi1.hashCode()); // Aynı hashCode üretir
System.out.println(kisi2.hashCode());
```

**Çıktı:**
```
true
1034248974
1034248974
```
Bu metotlar **içerik bazlı karşılaştırma** yapar, yani iki nesne içindeki **alanlar aynıysa, nesneler eşit kabul edilir.**

---

## **Record İçinde Metot Tanımlama**
Record'lar içinde normal Java sınıflarında olduğu gibi metotlar tanımlanabilir:

```java
public record Daire(double yariCap) {
    public double alan() {
        return Math.PI * yariCap * yariCap;
    }
}
```
Kullanımı:
```java
Daire daire = new Daire(10);
System.out.println(daire.alan()); // 314.159...
```

---

## **Record İçinde Statik Alan ve Metotlar**
Record içinde **static alanlar** ve **static metotlar** kullanılabilir:

```java
public record Araba(String marka, String model) {
    static String kategori = "Otomobil";

    public static String getKategori() {
        return kategori;
    }
}
```
Kullanımı:
```java
System.out.println(Araba.getKategori()); // "Otomobil"
```

---

## **Record İçinde Custom Constructor Kullanımı**
Record'larda **custom constructor (özelleştirilmiş yapıcı metot)** tanımlanabilir.

Örnek:
```java
public record Person(String ad, int yas) {
    public Person {
        if (yas < 0) {
            throw new IllegalArgumentException("Yaş negatif olamaz!");
        }
    }
}
```
Eğer negatif bir yaş verilirse, `IllegalArgumentException` fırlatılır:

```java
Person kisi = new Person("Ali", -5); // HATA!
```
**Çıktı:**
```
Exception in thread "main" java.lang.IllegalArgumentException: Yaş negatif olamaz!
```

---

## **Record ve Interface Kullanımı**
Record'lar **interface** implement edebilir:

```java
interface Sekil {
    double alan();
}

public record Dikdortgen(double genislik, double yukseklik) implements Sekil {
    public double alan() {
        return genislik * yukseklik;
    }
}
```
Kullanımı:
```java
Dikdortgen dikdortgen = new Dikdortgen(10, 5);
System.out.println(dikdortgen.alan()); // 50.0
```

---

## **Record'ların Kısıtlamaları**
1. **Değiştirilemez (Immutable) Olması**
    - Record içindeki değişkenler `final` olduğu için **değiştirilemez**.

2. **Extends Kullanılamaz (Miras Alamaz)**
    - Record'lar **kalıtım desteklemez** (`extends` kullanamazsınız). Çünkü zaten `final` olarak tanımlıdır.

   ```java
   public class AltKisi extends Kisi { } // HATA! Record’lar extend edilemez.
   ```

3. **Lombok'a Alternatif Ama Her Zaman Uygun Değil**
    - Record, `Lombok` gibi kütüphanelere bir alternatif olsa da **tüm projeler için uygun olmayabilir**. Eğer mutable (değiştirilebilir) veri modelleri gerekiyorsa, klasik `class` kullanımı daha uygun olur.

---

## **Sonuç**
Java Record'lar, özellikle **veri taşıma nesneleri (DTO)** oluşturmak için harika bir özelliktir. Geleneksel `class`'lara kıyasla **daha az kod** yazarak, **immutable** ve **performanslı** veri yapıları oluşturmanızı sağlar. Eğer **kalıtım gerekmiyorsa** ve **sadece veri saklamak istiyorsanız**, Record kullanımı oldukça mantıklıdır.

## Record Örneği
```sh 

```
---


Mevcut kodlarınıza **Java Record** özelliğini eklemek için, `StudentDto` sınıfını bir **Record** olarak yeniden yazabiliriz. Java 14 ile gelen **record** yapısı, sınıfları immutable (değiştirilemez) hale getirir ve **boilerplate kodları** (getter, setter, equals, hashCode, toString) otomatik oluşturur.

### **Güncellenmiş StudentDto.java (Record Kullanımı)**
Aşağıdaki gibi `StudentDto` sınıfınızı bir **Record** haline getirdim:

```java
package com.hamitmizrak.project_step2_file;

import com.hamitmizrak.project.step2.EStudentType;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Date;

// Java Record Kullanımı
public record StudentDto(
        Integer id,
        String name,
        String surname,
        EStudentType eStudentType, // Enum Öğrenci Türü
        Double midTerm,      // Vize notu
        Double finalTerm,    // Final notu
        Double resultTerm,   // Sonuç Notu: (Vize%40 + Final%60)
        LocalDate birthDate, // Doğum günü
        Date createdDate     // Sistem otomatik tarihi
) implements Serializable {

    // Serileştirme
    private static final long serialVersionUID = 5563646556456565465L;

    // Constructor (Vize ve Final notuna göre otomatik result hesaplama)
    public StudentDto(Integer id, String name, String surname, Double midTerm, Double finalTerm, LocalDate birthDate, EStudentType eStudentType) {
        this(id, name, surname, eStudentType, midTerm, finalTerm, calculateResult(midTerm, finalTerm), birthDate, new Date(System.currentTimeMillis()));
    }

    // Not hesaplama metodu
    private static Double calculateResult(Double midTerm, Double finalTerm) {
        if (midTerm == null || finalTerm == null) return 0.0;
        return (midTerm * 0.4 + finalTerm * 0.6);
    }
}
```

---

### **Neden Record Kullandık? Avantajları Neler?**
✅ **Immutable (Değiştirilemez) Yapı**: Record nesneleri varsayılan olarak final olduğu için değiştirilemez. Bu da çoklu iş parçacıklı (multithreading) ortamlarda veri bütünlüğünü korur.  
✅ **Boilerplate Kodları Otomatik Üretiyor**: Getter, toString, equals ve hashCode metodları otomatik olarak tanımlanır, manuel yazmaya gerek yok.  
✅ **Daha Az Kod**: Geleneksel Java sınıflarında birçok getter/setter tanımlamak yerine, sadece **record** ile ilgili alanları belirterek işlem yapabiliriz.  
✅ **Veri Taşıma Nesneleri (DTO) için İdeal**: Özellikle veri transferi amacıyla kullanılan nesneler için **record** mükemmel bir seçimdir.  
✅ **Thread-Safe**: İçeriği değiştirilemez olduğu için **eşzamanlı (concurrent)** çalışmalarda güvenli kullanım sağlar.

---

### **Mevcut Sisteme Nasıl Entegre Edilecek?**
1. **Güncellenmiş `StudentDto.java` dosyanızı ekleyin.**
2. **`StudentManagementSystem` içinde `StudentDto` nesnesi oluştururken `new StudentDto(...)` yerine doğrudan `new StudentDto(..., ..., ..., ...)` kullanabilirsiniz.**
3. **Getter metodlarına ihtiyacınız olmayacak.** Örneğin:
   ```java
   System.out.println(studentDto.name()); // Eskiden getName() idi
   ```
4. **Setter metodları olmadığı için `StudentDto` nesnesi immutable olacak.** Yeni değerlerle bir `StudentDto` nesnesi oluşturmanız gerekecek.

---

Bu güncelleme ile kodunuz daha temiz, güvenli ve performanslı hale gelecektir. Record'ları kullanarak kodunuzu daha modern hale getirmiş oldunuz! 🚀


## Record Dezavantajları
```sh 

```
---

### **Java Record Kullanmanın Dezavantajları**
Java'da **record** kullanımı birçok avantaj sağlasa da, bazı durumlarda **klasik sınıflara göre bazı dezavantajları** olabilir. İşte bu dezavantajlar:

---

## **1. Immutable (Değiştirilemez) Yapı**
**❌ Dezavantaj:**
- `record` nesneleri değiştirilemez (immutable) olduğu için, bir alanın güncellenmesi gerektiğinde **yeni bir nesne oluşturmak** zorundayız.
- Büyük veri nesnelerinde, **her güncelleme için yeni bir nesne yaratılması performans kaybına** yol açabilir.

**Örnek:**
```java
StudentDto student = new StudentDto(1, "Ali", "Veli", 50.0, 80.0, LocalDate.of(2000, 5, 10), EStudentType.UNDERGRADUATE);
student.name = "Ahmet"; // ❌ Derleme hatası! Record'lar değiştirilemez.
```
**Çözüm:**
- Değişiklik gerektiğinde, eski nesne yerine yeni bir `StudentDto` oluşturmalısınız:
```java
StudentDto updatedStudent = new StudentDto(student.id(), "Ahmet", student.surname(), student.midTerm(), student.finalTerm(), student.birthDate(), student.eStudentType());
```
Bu, özellikle sık güncellenen nesnelerde **gereksiz bellek kullanımı (memory overhead)** ve **GC (Garbage Collection) yükü** oluşturabilir.

---

## **2. Kalıtımı (Inheritance) Desteklemez**
**❌ Dezavantaj:**
- `record` sınıfları **kalıtımı desteklemez** (`extends` kullanamazsınız).
- Java’da OOP prensiplerine uyan klasik sınıflarda **bir temel sınıfı (base class) genişletebilirken**, `record` kullanarak bunu yapamazsınız.

**Örnek:**
```java
public record StudentDto(Integer id, String name) extends Person { } // ❌ Hata! Record'lar kalıtım desteklemez.
```
**Çözüm:**
- Eğer miras almanız gereken bir sınıf varsa, klasik bir **sınıf (class)** kullanmalısınız.
- Ancak `record`, **interface (arayüz) uygulayabilir**:
```java
public record StudentDto(Integer id, String name) implements Serializable { }
```

---

## **3. Getter ve Setter Özelleştirememe**
**❌ Dezavantaj:**
- `record` otomatik olarak `getter` metotları oluşturur. Ancak, bu metotların adını değiştiremez veya özelleştiremezsiniz.
- Setter metodu olmadığı için, özel validasyon (doğrulama) ekleyemezsiniz.

**Örnek:**
```java
public record StudentDto(Integer id, String name) {
    public String getFullName() { // ❌ Klasik getter metodu yazamazsınız!
        return name();
    }
}
```
**Çözüm:**
- Özel bir metot tanımlayabilirsiniz ama `getter` adlarını değiştiremezsiniz.
```java
public record StudentDto(Integer id, String name) {
    public String fullName() {  // ✅ Getter değil, normal bir metod!
        return name.toUpperCase();
    }
}
```
---

## **4. Büyük Veriler İçin Performans Sorunları**
**❌ Dezavantaj:**
- `record` nesneleri immutable olduğu için, **büyük veri yapılarında gereksiz kopyalama (copying overhead)** oluşabilir.
- Çok fazla alan içeren bir `record`, her değişiklikte **yeni bir nesne oluşturduğu için bellek tüketimi artabilir**.

**Örnek:**
```java
StudentDto student1 = new StudentDto(1, "Ali", "Veli", 50.0, 80.0, LocalDate.of(2000, 5, 10), EStudentType.UNDERGRADUATE);
StudentDto student2 = new StudentDto(student1.id(), student1.name(), student1.surname(), 55.0, student1.finalTerm(), student1.birthDate(), student1.eStudentType());
```
Burada, sadece `midTerm` değiştirilecek ama **tamamen yeni bir nesne oluşturuluyor**. Eğer milyonlarca `StudentDto` nesneniz varsa, bu **bellek (heap) yükü** oluşturabilir.

**Çözüm:**
- Eğer sık güncelleme gerektiren nesneleriniz varsa, `record` yerine klasik **mutable sınıflar** kullanın.

---

## **5. Varsayılan Constructor Kısıtlamaları**
**❌ Dezavantaj:**
- `record`’lar, varsayılan olarak **tüm alanları parametre olarak almak zorundadır**.
- Varsayılan (default) bir constructor tanımlamak ve bazı değerleri atlamak zordur.

**Örnek:**
```java
public record StudentDto(Integer id, String name) {
    public StudentDto() {  // ❌ Hata! Parametresiz constructor desteklenmez.
        this(0, "Bilinmeyen");
    }
}
```
**Çözüm:**
- `record` içinde, özel bir constructor tanımlayabilirsiniz ama **tüm alanları mutlaka vermeniz gerekir**.
```java
public record StudentDto(Integer id, String name) {
    public StudentDto() {
        this(0, "Bilinmeyen"); // ✅ Geçerli constructor
    }
}
```

---

## **6. Özel İşlevsellik (Business Logic) İçin Kısıtlamalar**
**❌ Dezavantaj:**
- `record` nesneleri **veri taşıma (DTO)** amacıyla tasarlandığı için, içinde **fazla iş mantığı (business logic) barındırmak uygun değildir**.
- Eğer bir sınıfta iş mantığı (örneğin, **not hesaplama, validasyon, iş kuralları**) barındırmak istiyorsanız, **record yerine klasik sınıfları kullanmanız daha uygundur**.

**Örnek:**
```java
public record StudentDto(Integer id, String name, Double midTerm, Double finalTerm) {
    public Double calculateResult() { // ✅ İş mantığı ekleyebiliriz ama önerilmez.
        return (midTerm * 0.4) + (finalTerm * 0.6);
    }
}
```
Burada küçük hesaplamalar yapabiliriz, ancak `record`'lar büyük iş mantıklarını içermemelidir.

**Çözüm:**
- İş mantıklarını başka bir hizmet (service) sınıfına taşıyın:
```java
public class StudentService {
    public static Double calculateResult(StudentDto student) {
        return (student.midTerm() * 0.4) + (student.finalTerm() * 0.6);
    }
}
```

---

## **Sonuç: Record Kullanmalı mıyım?**
| **Özellik**               | **Record Kullanımı Uygun** | **Record Kullanımı Uygun Değil** |
|---------------------------|---------------------------|---------------------------------|
| **Immutable nesne**       | ✅ Evet                   | ❌ Hayır                        |
| **DTO veya Veri Modeli**  | ✅ Evet                   | ❌ Hayır                        |
| **Kapsamlı iş mantığı**   | ❌ Hayır                  | ✅ Evet                         |
| **Kalıtım (Inheritance)** | ❌ Hayır                  | ✅ Evet                         |
| **Sık güncellenen nesneler** | ❌ Hayır              | ✅ Evet                         |
| **Getter/Setter özelleştirme** | ❌ Hayır          | ✅ Evet                         |

### **Kullanmalısınız Eğer:**
✅ **DTO (Data Transfer Object) gibi basit veri taşıma sınıfları** oluşturuyorsanız.  
✅ **Immutable nesneler istiyorsanız** ve değişiklik gerekmiyorsa.  
✅ **Kısa ve temiz kod yazmak istiyorsanız**.

### **Kullanmamalısınız Eğer:**
❌ **Veri değiştirmeniz (mutable nesneler) gerekiyorsa**.  
❌ **Kapsamlı iş mantıkları barındıran bir sınıf oluşturuyorsanız**.  
❌ **Büyük nesneler oluşturup sık güncelliyorsanız**, bellek yönetimi açısından sorun yaratabilir.  
❌ **Kalıtım (inheritance) kullanmanız gerekiyorsa**.

---

### **Genel Değerlendirme**
- Küçük ve **basit veri sınıfları** için **Record** harika bir seçimdir. ✅
- Büyük, sık değiştirilen veya **iş mantığı içeren sınıflar** için **klasik sınıflar daha iyi bir seçenektir**. 🚀

## Record Dezavantajları
```sh 

```
---

## Lambda Expresion Nedir ?
```sh 

```
---
### Java'da Lambda Expression Nedir? (Detaylı Anlatım)

Lambda ifadeleri (Lambda Expressions), Java 8 ile birlikte gelen ve **fonksiyonel programlama paradigmalarına** destek sağlayan bir özelliktir. Java, geleneksel olarak **nesne yönelimli** bir dil olduğu için, bir fonksiyonu bağımsız bir varlık olarak tanımlamak mümkün değildi. Ancak **Java 8 ile birlikte, fonksiyonları ilk sınıf vatandaş (first-class citizen) olarak kullanma imkanı** getiren Lambda Expressions ve Functional Interfaces gibi yapılar eklenmiştir.

Lambda ifadeleri, **anonim fonksiyonlar** olarak düşünülebilir. Yani, adı olmayan bir fonksiyon tanımlamak için kullanılırlar ve genellikle **bir arabirimin (interface) tek bir metot içeren haliyle (Functional Interface)** kullanılırlar.

---

## 🔹 Lambda Expression'ın Temel Yapısı

Lambda ifadelerinin genel sözdizimi şu şekildedir:

```java
(parameters) -> expression
```

Veya **gövdesi birden fazla satırdan oluşuyorsa:**

```java
(parameters) -> { statements; }
```

Burada:
- **(parameters)** → Metoda geçilecek parametrelerdir.
- **->** → Lambda operatörüdür, yani "şu işlemi yap" anlamına gelir.
- **expression veya { statements; }** → Lambda'nın gövdesidir, yani çalıştırılacak kod bloğudur.

---

## 🔹 Lambda Expression ile Gelen Avantajlar
1. **Daha az kod yazımı:** Geleneksel anonim sınıflara göre daha kısa ve okunaklıdır.
2. **Kodun okunabilirliğini artırır:** Lambda ifadeleri ile işlevsellik daha belirgin hale gelir.
3. **Performans iyileştirmesi:** Geleneksel anonim sınıflara göre daha hızlıdır çünkü Lambda ifadeleri **JVM tarafından optimize edilir**.
4. **Paralel programlamaya uygunluk:** Java 8 ile gelen **Stream API** ile birlikte kullanıldığında, Lambda ifadeleri çok daha etkili hale gelir.

---

## 🔹 Functional Interface ile Kullanımı
Lambda ifadeleri **sadece tek bir metodu olan (Single Abstract Method - SAM) arabirimlerde kullanılabilir**. Java'da bu tür arabirimlere **Functional Interface** (Fonksiyonel Arayüz) denir.

Java'da **@FunctionalInterface** adında özel bir anotasyon bulunmaktadır. **Bu anotasyon, bir arabirimin yalnızca bir tane soyut metot içermesini garanti eder.**

Örnek bir **Functional Interface**:

```java
@FunctionalInterface
interface MyFunctionalInterface {
    void showMessage(String message);
}
```

Yukarıdaki arayüzü **Lambda Expression** ile kullanabiliriz:

```java
public class LambdaExample {
    public static void main(String[] args) {
        MyFunctionalInterface messagePrinter = (message) -> System.out.println("Mesaj: " + message);
        messagePrinter.showMessage("Merhaba Lambda!");
    }
}
```

### 🔹 Kodu İnceleyelim:
1. **MyFunctionalInterface** adında bir fonksiyonel arayüz oluşturduk.
2. **Lambda ifadesi ile `showMessage` metodunu tanımladık.**
3. `showMessage("Merhaba Lambda!")` çağrıldığında, **Lambda ifadesinin içerisindeki kod bloğu çalışacaktır.**

---

## 🔹 Lambda Expression Örnekleri

### 1️⃣ **Tek Parametreli ve Tek Satırlık Lambda**
```java
interface Square {
    int calculate(int x);
}

public class LambdaDemo {
    public static void main(String[] args) {
        Square square = x -> x * x;
        System.out.println("Sonuç: " + square.calculate(5)); // Çıktı: Sonuç: 25
    }
}
```
- `x -> x * x;` ifadesi, `Square` arayüzündeki `calculate` metodunu tanımlar.

---

### 2️⃣ **Çoklu Parametre Kullanımı**
```java
interface Addable {
    int add(int a, int b);
}

public class LambdaDemo {
    public static void main(String[] args) {
        Addable adder = (a, b) -> a + b;
        System.out.println("Toplam: " + adder.add(10, 20)); // Çıktı: Toplam: 30
    }
}
```

---

### 3️⃣ **Blok Kullanımı ve Return İfadesi**
```java
interface Multiply {
    int product(int a, int b);
}

public class LambdaDemo {
    public static void main(String[] args) {
        Multiply multiplication = (a, b) -> {
            int result = a * b;
            return result;
        };
        System.out.println("Çarpım: " + multiplication.product(10, 5)); // Çıktı: Çarpım: 50
    }
}
```
- **Birden fazla satırdan oluşan ifadeler için `{}` blokları kullanılır.**
- **`return` ifadesi kullanılabilir.**

---

## 🔹 Java'da Lambda Kullanım Alanları

### ✅ **1. Thread (İş Parçacıkları) Kullanımı**
Lambda ifadeleri **Thread (İş Parçacıkları)** ile kullanılabilir:

```java
public class LambdaThreadExample {
    public static void main(String[] args) {
        // Geleneksel Yöntem
        Runnable runnable1 = new Runnable() {
            @Override
            public void run() {
                System.out.println("Thread çalışıyor...");
            }
        };
        new Thread(runnable1).start();

        // Lambda ile
        Runnable runnable2 = () -> System.out.println("Lambda ile Thread çalışıyor...");
        new Thread(runnable2).start();
    }
}
```

---

### ✅ **2. Java Collections API ile Kullanım**
Lambda ifadeleri, **List ve Map gibi koleksiyonların işlenmesini** kolaylaştırır.

```java
import java.util.Arrays;
import java.util.List;

public class LambdaListExample {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Ahmet", "Mehmet", "Ayşe", "Fatma");
        
        // Geleneksel Döngü
        for (String name : names) {
            System.out.println(name);
        }
        
        // Lambda ile
        names.forEach(name -> System.out.println(name));
    }
}
```

---

### ✅ **3. Java Stream API ile Kullanım**
Lambda ifadeleri, **Stream API** ile birleştirildiğinde oldukça güçlüdür:

```java
import java.util.Arrays;
import java.util.List;

public class LambdaStreamExample {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(5, 10, 15, 20, 25);

        // Tüm sayıların karesini al ve ekrana yazdır
        numbers.stream().map(n -> n * n).forEach(System.out::println);
    }
}
```
Bu kod:
1. `numbers.stream()` ile bir **akış (stream)** oluşturur.
2. `.map(n -> n * n)` ile her elemanı **karesiyle değiştirir**.
3. `.forEach(System.out::println)` ile sonuçları ekrana yazdırır.

---

## 🔹 Sonuç
- **Lambda Expressions**, Java'da **daha fonksiyonel** bir programlama yaklaşımı sağlar.
- **Anonim sınıflara** göre **daha kısa** ve **performanslıdır**.
- **Functional Interface** yapıları ile birlikte **kod okunabilirliğini artırır**.
- **Stream API, Thread ve Koleksiyonlar** gibi birçok yerde oldukça kullanışlıdır.

Lambda ifadeleri, **Java 8 ve sonrası için en önemli yeniliklerden biridir** ve fonksiyonel programlamanın Java dünyasına entegrasyonunda büyük bir adımdır. 🚀



## Inner Class Nedir ?
```sh 

```
---

# **Java’da Inner Class (İç İçe Sınıflar) Detaylı Anlatım**

Java'da **Inner Class** (İç İçe Sınıf), bir sınıfın içinde tanımlanmış başka bir sınıftır. Java’da inner class kullanımı, kodun organize edilmesini kolaylaştırır, dış sınıfın üyelerine erişimi sağlar ve kapsülleme (encapsulation) avantajları sunar.

---

## **1. Inner Class Nedir?**
Java'da bir sınıfı başka bir sınıfın içinde tanımlarsak, buna **Inner Class** (İç Sınıf) denir. **Inner Class**, genellikle dış (outer) sınıfa bağlıdır ve bağımsız olarak çalışamaz.

- **Dış sınıf (Outer Class)**: İç sınıfı kapsayan ana sınıftır.
- **İç sınıf (Inner Class)**: Dış sınıfın içinde tanımlanan sınıftır.

### **Örnek: Basit Inner Class Kullanımı**
```java
class OuterClass { // Dış Sınıf
    private String outerField = "Dış sınıf değişkeni";

    // İç Sınıf
    class InnerClass {
        void display() {
            System.out.println("İç sınıftan erişilen: " + outerField);
        }
    }
}

public class Main {
    public static void main(String[] args) {
        OuterClass outer = new OuterClass();  // Dış sınıf nesnesi oluştur
        OuterClass.InnerClass inner = outer.new InnerClass();  // İç sınıf nesnesi oluştur
        inner.display();  // Çıktı: İç sınıftan erişilen: Dış sınıf değişkeni
    }
}
```
**Açıklamalar:**
- **InnerClass**, **OuterClass** içinde tanımlanmıştır.
- **InnerClass**, **OuterClass**'ın özel değişkenlerine (`private outerField`) doğrudan erişebilir.
- **InnerClass** nesnesi oluşturmak için önce **OuterClass** nesnesi oluşturulmalıdır.

---

## **2. Inner Class Türleri**
Java'da **4 çeşit inner class** vardır:

1. **Regular Inner Class (Normal İç Sınıf)**
2. **Static Nested Class (Statik İç Sınıf)**
3. **Method Local Inner Class (Metod İçinde Tanımlanan İç Sınıf)**
4. **Anonymous Inner Class (Anonim İç Sınıf)**

---

## **2.1. Regular Inner Class (Normal İç Sınıf)**
**Dış sınıfın içinde, statik olmayan bir sınıftır.** İç sınıfa erişmek için önce dış sınıfın nesnesi oluşturulmalıdır.

### **Örnek: Normal Inner Class Kullanımı**
```java
class Outer {
    private String message = "Merhaba, ben dış sınıfım!";

    class Inner {
        void showMessage() {
            System.out.println(message);  // Dış sınıfın private değişkenine erişim
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Outer outer = new Outer();  // Dış sınıf nesnesi
        Outer.Inner inner = outer.new Inner();  // İç sınıf nesnesi
        inner.showMessage();  // Çıktı: Merhaba, ben dış sınıfım!
    }
}
```
### **Özellikler:**
✔ Dış sınıfın private değişkenlerine erişebilir.  
✔ İç sınıfa, dış sınıfın nesnesi üzerinden ulaşılır.  
✔ Dış sınıf olmadan iç sınıfın bağımsız çalışması mümkün değildir.

---

## **2.2. Static Nested Class (Statik İç Sınıf)**
**Statik iç sınıflar**, **dış sınıfın bir örneğine (instance) ihtiyaç duymadan doğrudan kullanılabilir.**

### **Örnek: Static Inner Class Kullanımı**
```java
class Outer {
    static String staticMessage = "Statik değişken!";

    // Statik İç Sınıf
    static class StaticInner {
        void display() {
            System.out.println("Statik İç Sınıf: " + staticMessage);
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Outer.StaticInner inner = new Outer.StaticInner();  // Dış sınıfın nesnesine gerek yok
        inner.display();  // Çıktı: Statik İç Sınıf: Statik değişken!
    }
}
```
### **Özellikler:**
✔ **Dış sınıfın nesnesine ihtiyaç duymaz.**  
✔ **Sadece dış sınıfın `static` üyelerine erişebilir.**  
✔ **Bağımsız bir sınıf gibi çalışabilir.**

---

## **2.3. Method Local Inner Class (Metod İçinde Tanımlanan İç Sınıf)**
**Bir metodun içinde tanımlanan iç sınıftır.** Yalnızca o metodun içinde kullanılabilir.

### **Örnek: Method Local Inner Class Kullanımı**
```java
class Outer {
    void outerMethod() {
        class MethodInner {  // Metodun içinde tanımlı iç sınıf
            void show() {
                System.out.println("Merhaba, ben metod içindeki iç sınıfım!");
            }
        }
        MethodInner inner = new MethodInner(); // İç sınıf nesnesi oluştur
        inner.show();
    }
}

public class Main {
    public static void main(String[] args) {
        Outer outer = new Outer();
        outer.outerMethod();  // Çıktı: Merhaba, ben metod içindeki iç sınıfım!
    }
}
```
### **Özellikler:**
✔ **Sadece tanımlandığı metod içinde kullanılabilir.**  
✔ **Dış sınıfın üyelerine erişebilir.**  
✔ **Metod tamamlandığında bellekten silinir.**

---

## **2.4. Anonymous Inner Class (Anonim İç Sınıf)**
**İsmi olmayan (anonymous) ve genellikle bir arayüzü veya sınıfı genişleten (extend) veya bir arayüzü uygulayan (implement) tek seferlik sınıflardır.**

### **Örnek: Anonim İç Sınıf ile Arayüz Kullanımı**
```java
interface Message {
    void showMessage();
}

public class Main {
    public static void main(String[] args) {
        // Anonim İç Sınıf
        Message obj = new Message() {
            public void showMessage() {
                System.out.println("Anonim İç Sınıftan Merhaba!");
            }
        };
        obj.showMessage();  // Çıktı: Anonim İç Sınıftan Merhaba!
    }
}
```
### **Örnek: Anonim İç Sınıf ile Abstract Sınıf Kullanımı**
```java
abstract class Animal {
    abstract void makeSound();
}

public class Main {
    public static void main(String[] args) {
        Animal dog = new Animal() {
            void makeSound() {
                System.out.println("Hav hav! (Anonim Sınıf)");
            }
        };
        dog.makeSound();  // Çıktı: Hav hav! (Anonim Sınıf)
    }
}
```
### **Özellikler:**
✔ **Tek seferlik kullanım içindir.**  
✔ **Soyut sınıfları ve arayüzleri doğrudan implemente edebilir.**  
✔ **Yeni bir sınıf tanımlamadan anında kullanılabilir.**

---

## **Sonuç ve Karşılaştırma**
| Inner Class Türü | Bağımsız mı? | Dış Sınıfın Nesnesine İhtiyaç Duyar mı? | Kullanım Alanı |
|------------------|-------------|---------------------------------|-----------------|
| **Regular Inner Class** | ❌ Hayır | ✅ Evet | Dış sınıfın üyelerine erişim sağlamak için |
| **Static Nested Class** | ✅ Evet | ❌ Hayır | Dış sınıf nesnesi olmadan bağımsız çalışma |
| **Method Local Inner Class** | ❌ Hayır | ✅ Evet | Sadece belirli bir metod içinde kullanılmak üzere |
| **Anonymous Inner Class** | ❌ Hayır | ✅ Evet | Tek seferlik kullanım için (arayüz veya abstract class) |

---

## **Sonuç**
Java’daki **inner class’lar**, kodu daha organize hale getirmek, dış sınıfın üyelerine erişmek ve encapsulation sağlamak için güçlü bir mekanizmadır. **Hangi tür iç sınıfı kullanacağınızı, ihtiyacınıza göre seçmelisiniz!** 🚀

## Generics Nedir ?
```sh 

```
---
# **Java'da Generics (Jenerikler) Nedir?**
Generics, Java'da **tip güvenliğini artırmak, kod tekrarını azaltmak ve runtime hatalarını compile-time'da yakalamak için** kullanılan bir özelliktir. **Jenerik yapılar, sınıflara, arayüzlere ve metotlara farklı veri tiplerini dinamik olarak atayabilmemizi sağlar.**

---

## **📌 Neden Generics Kullanılır?**
Generics kullanılmadan önce, `Object` sınıfı yaygın olarak kullanılıyordu. Ancak `Object`, farklı türleri saklayabildiği için **tip dönüşümleri (type casting) gerektiğinden** runtime hatalarına sebep olabiliyordu.

### 🔴 **Generics Olmadan (Eski Yöntem – Type Safety Yok)**
```java
import java.util.ArrayList;

public class WithoutGenerics {
    public static void main(String[] args) {
        ArrayList list = new ArrayList(); // Tip belirtilmemiş
        list.add("Merhaba");
        list.add(100); // Farklı bir tür eklenebiliyor

        String message = (String) list.get(0); // Type casting gerekiyor
        System.out.println(message);

        String number = (String) list.get(1); // ClassCastException HATASI!
        System.out.println(number);
    }
}
```
### ❌ **Sorunlar:**
- **Tip güvenliği yok:** Aynı `ArrayList` içine farklı türler eklenebilir.
- **Type casting zorunlu:** `Object` tipinden spesifik tipe dönüşüm gerekir.
- **Runtime hataları:** Yanlış casting yapılırsa **`ClassCastException`** oluşur.

---

## **✅ Generics ile Daha Güvenli Kod**
```java
import java.util.ArrayList;

public class WithGenerics {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>(); // Generics ile tür belirtilmiş
        list.add("Merhaba");
        // list.add(100); // ❌ Derleme hatası verir!

        String message = list.get(0); // Type casting gerekmez
        System.out.println(message);
    }
}
```
### **🎯 Avantajlar:**
✔ **Tip güvenliği sağlanır:** Yanlış veri eklenemez.  
✔ **Type casting ihtiyacı ortadan kalkar:** Direkt doğru tipte veri çekilir.  
✔ **Daha okunaklı ve güvenli kod yazılır.**

---

# **📌 Generics Nerelerde Kullanılır?**
- **Sınıflar (`Generic Class`)**
- **Arayüzler (`Generic Interface`)**
- **Metotlar (`Generic Method`)**
- **Wildcard (`?` ile jenerik parametreler)**

---

# **1️⃣ Generics ile Sınıf Tanımlama (`Generic Class`)**
Bir sınıfı **herhangi bir veri tipiyle çalışabilecek hale getirmek** için generics kullanabiliriz.

### 🎯 **Örnek 1: Generic Bir Kutu (`Box<T>`) Sınıfı**
```java
// T => Type (Kullanıcı tarafından belirlenecek)
public class Box<T> {
    private T item; // Değişken türü dinamik

    public void setItem(T item) {
        this.item = item;
    }

    public T getItem() {
        return item;
    }
}

// Kullanımı
public class Main {
    public static void main(String[] args) {
        Box<String> stringBox = new Box<>();
        stringBox.setItem("Merhaba, Java!");
        System.out.println(stringBox.getItem()); // Çıktı: Merhaba, Java!

        Box<Integer> intBox = new Box<>();
        intBox.setItem(42);
        System.out.println(intBox.getItem()); // Çıktı: 42
    }
}
```
### **💡 Açıklamalar:**
✔ `T` (Type Parameter) yerine **String, Integer, Double gibi veri tipleri** atanabilir.  
✔ **Tek bir sınıf ile** farklı veri tipleri saklanabilir.  
✔ **Kod tekrarını önler.**

---

# **2️⃣ Generics ile Arayüz Tanımlama (`Generic Interface`)**
Bir interface’in farklı türler ile çalışmasını sağlamak için generics kullanılabilir.

### 🎯 **Örnek: Generics Kullanarak DAO Arayüzü (`IDaoGenerics<T>`)**
```java
// T: Öğrenci, Öğretmen gibi herhangi bir nesne olabilir.
public interface IDaoGenerics<T> {
    void save(T t);
    T findById(int id);
    void delete(int id);
}
```

**Arayüzü Kullanacak Bir Sınıf:**
```java
public class StudentDao implements IDaoGenerics<StudentDto> {
    @Override
    public void save(StudentDto student) {
        System.out.println("Öğrenci kaydedildi: " + student.getName());
    }

    @Override
    public StudentDto findById(int id) {
        return new StudentDto(id, "Ahmet", "Yılmaz", 85.0, 90.0, java.time.LocalDate.of(2000, 5, 10), EStudentType.UNDERGRADUATE);
    }

    @Override
    public void delete(int id) {
        System.out.println("Öğrenci silindi: " + id);
    }
}
```
✔ **Kod tekrarını önler**  
✔ **Farklı veri türleriyle çalışabilir** (Öğrenci, Öğretmen, Ders vs.)

---

# **3️⃣ Generics ile Metot Tanımlama (`Generic Method`)**
Belirli bir sınıfa bağlı olmadan **herhangi bir veri tipiyle çalışan metotlar** yazabiliriz.

### 🎯 **Örnek: Generic Bir Swap (Değiştirme) Metodu**
```java
public class GenericMethodExample {
    public static <T> void swap(T[] array, int i, int j) {
        T temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    public static void main(String[] args) {
        Integer[] numbers = {1, 2, 3, 4};
        swap(numbers, 0, 2);
        for (int num : numbers) {
            System.out.print(num + " "); // Çıktı: 3 2 1 4
        }
    }
}
```
✔ **Her türde veri ile çalışabilir**  
✔ **Kod tekrarını azaltır**

---

# **4️⃣ Wildcard (`?` - Joker Karakter) Kullanımı**
Bazen bir generics sınıfında **herhangi bir tipte veri kullanabileceğimiz bir yapı** isteriz.

### 🎯 **Örnek: Üst Sınıf Kısıtlaması (`? extends Number`)**
```java
public class WildcardExample {
    public static void printList(List<? extends Number> list) {
        for (Number num : list) {
            System.out.println(num);
        }
    }

    public static void main(String[] args) {
        List<Integer> intList = List.of(1, 2, 3);
        List<Double> doubleList = List.of(2.5, 3.6);

        printList(intList);   // Çalışır
        printList(doubleList); // Çalışır
    }
}
```
✔ **? extends Number** → Sadece `Integer`, `Double`, `Float` gibi `Number` türevleri kabul edilir.  
✔ **Joker karakter sayesinde** farklı türleri destekleyen metotlar yazabiliriz.

---

# **🚀 Sonuç: Generics Kullanmanın Avantajları**
✅ **Tip güvenliği sağlar** (Yanlış veri eklenemez)  
✅ **Kod tekrarını azaltır** (Aynı kod farklı veri türleriyle çalışır)  
✅ **Okunabilirliği artırır** (Casting ihtiyacını ortadan kaldırır)  
✅ **Performansı artırır** (Compile-time hatalarını yakalar)

Java generics sayesinde daha **esnek, güvenli ve performanslı kod** yazabiliriz. 🚀


## Collection Nedir ?
```sh 

```
---

# **Java'da Collection Nedir? (Detaylı Açıklama)**

Java'da **Collection (Koleksiyonlar)**, birden fazla veriyi belirli bir yapı içerisinde saklamak, yönetmek ve işlemek için kullanılan bir çerçevedir (framework). Java Collection Framework (JCF), çeşitli veri yapıları ve algoritmalar içerir ve bunlar, Java'da veri yönetimini oldukça esnek ve verimli hale getirir.

## **1. Collection Framework Nedir?**
Java Collection Framework, Java’nın veri yapılarıyla çalışma yeteneğini geliştiren bir yapıdır. Java SE 2 ile birlikte gelmiştir ve veri yapıları ile algoritmaları içeren, **verimli veri depolama, erişim ve manipülasyon mekanizmaları** sağlayan bir çerçevedir.

Collection framework, **Array, LinkedList, Stack, Queue, HashMap, TreeSet gibi çeşitli veri yapıları** içerir. Bu framework, koleksiyonları oluşturma, düzenleme, sıralama ve arama işlemlerini kolaylaştıran birçok yardımcı sınıf ve metod içerir.

## **2. Java Collection Framework İçerisindeki Bileşenler**
Java Collection Framework, temel olarak şu bileşenlerden oluşur:
1. **Interfaces (Arayüzler)** → Collection, List, Set, Queue, Map vb.
2. **Classes (Sınıflar)** → ArrayList, LinkedList, HashSet, TreeSet, HashMap, TreeMap vb.
3. **Algorithms (Algoritmalar)** → Sıralama, arama, değiştirme vb.

---

# **3. Collection Arayüzleri (Interfaces)**
Java'daki Collection Framework, çeşitli **arayüzler** kullanarak farklı veri yapılarını temsil eder. Bu arayüzler, koleksiyonların nasıl çalışması gerektiğini belirleyen kuralları tanımlar. En temel arayüz **Collection** arayüzüdür ve diğer arayüzler buradan türetilmiştir.

## **3.1 Collection Arayüzü (Temel Arayüz)**
Tüm koleksiyon türleri için ortak olan temel bir arayüzdür. List, Set ve Queue gibi arayüzler **Collection** arayüzünden türetilmiştir. **Map arayüzü** ise Collection’dan türetilmemiştir çünkü Map bir anahtar-değer (key-value) tabanlı veri yapısıdır.

```java
public interface Collection<E> extends Iterable<E> { 
    boolean add(E e);
    boolean remove(Object o);
    boolean contains(Object o);
    int size();
    boolean isEmpty();
    Iterator<E> iterator();
}
```

---

## **3.2 List Arayüzü (Ordered - Sıralı Veri)**
- **List**, öğeleri belirli bir sıralamada saklayan ve aynı elemandan birden fazla içerebilen bir koleksiyon türüdür.
- Elemanlara **indeks** ile erişilebilir.
- List'ler veri ekleme, çıkarma ve güncelleme gibi işlemler için kullanılır.

### **List’i Uygulayan Sınıflar:**
- **ArrayList**
- **LinkedList**
- **Vector** (Çok nadiren kullanılır)
- **Stack** (Vector'dan türetilmiştir)

```java
List<String> myList = new ArrayList<>();
myList.add("Java");
myList.add("Python");
myList.add("C++");
System.out.println(myList.get(1)); // Python
```

### **ArrayList vs LinkedList**
| Özellik | ArrayList | LinkedList |
|---------|----------|------------|
| Erişim Hızı | Hızlı (O(1)) | Yavaş (O(n)) |
| Ekleme/Silme | Yavaş (O(n)) | Hızlı (O(1) baştan/baştan silme) |
| Bellek Kullanımı | Daha az bellek kullanır | Daha fazla bellek kullanır (düğümler nedeniyle) |

---

## **3.3 Set Arayüzü (Benzersiz - Unique Elemanlar)**
- **Set**, **aynı elemandan birden fazla içeremez**.
- Elemanlar sırasız olabilir.
- Elemanlar, koleksiyona belirli bir kurala göre eklenir.

### **Set’i Uygulayan Sınıflar:**
- **HashSet** (Hızlıdır, sıralama yok)
- **LinkedHashSet** (Ekleme sırasını korur)
- **TreeSet** (Kendi içinde sıralı)

```java
Set<String> mySet = new HashSet<>();
mySet.add("Java");
mySet.add("Python");
mySet.add("Java");  // Tekrar eden eleman eklenmez!
System.out.println(mySet); // [Java, Python]
```

---

## **3.4 Queue Arayüzü (İlk Giren İlk Çıkar - FIFO)**
- **Queue**, elemanları bir sıraya koyar ve ekleme/çıkarmayı belirli bir düzene göre yapar.
- **FIFO (First In, First Out)** mantığıyla çalışır.

### **Queue’yi Uygulayan Sınıflar:**
- **PriorityQueue** (Öncelik bazlı sıralama)
- **LinkedList** (Queue olarak kullanılabilir)
- **ArrayDeque** (Çift yönlü kuyruk)

```java
Queue<Integer> queue = new LinkedList<>();
queue.add(10);
queue.add(20);
queue.add(30);
System.out.println(queue.poll()); // 10 (ilk eklenen çıkar)
```

---

## **3.5 Map Arayüzü (Key-Value - Anahtar-Değer)**
- **Map**, bir anahtar (key) ve bu anahtara bağlı bir değer (value) saklayan koleksiyon türüdür.
- **Anahtarlar benzersizdir**, ancak değerler tekrar edebilir.
- **Collection arayüzünden türememiştir.**

### **Map’i Uygulayan Sınıflar:**
- **HashMap** (Sırasız, en hızlı performans)
- **LinkedHashMap** (Eklenme sırasını korur)
- **TreeMap** (Anahtarları sıralı tutar)

```java
Map<String, Integer> myMap = new HashMap<>();
myMap.put("Elma", 3);
myMap.put("Armut", 5);
myMap.put("Muz", 7);
System.out.println(myMap.get("Elma")); // 3
```

---

# **4. Collection Framework’te Kullanılan Önemli Metotlar**
Collection sınıflarında en yaygın kullanılan metodlar şunlardır:

| Metot | Açıklama |
|------------|-------------|
| `add(E e)` | Eleman ekler |
| `remove(Object o)` | Elemanı kaldırır |
| `size()` | Eleman sayısını döndürür |
| `isEmpty()` | Boş olup olmadığını kontrol eder |
| `clear()` | Tüm elemanları temizler |
| `contains(Object o)` | Elemanın var olup olmadığını kontrol eder |
| `iterator()` | Koleksiyon üzerinde döngü yapmayı sağlar |

---

# **5. Java Collections Algoritmaları (Collections Utility Sınıfı)**
Java, `Collections` sınıfı altında birçok yardımcı algoritma sunar. Bunlar:
- **sort()** → Listeyi sıralar
- **reverse()** → Listeyi ters çevirir
- **shuffle()** → Liste elemanlarını karıştırır
- **binarySearch()** → Liste içinde ikili arama yapar
- **max()** ve **min()** → En büyük ve en küçük elemanı bulur

```java
List<Integer> numbers = new ArrayList<>(Arrays.asList(10, 5, 8, 3, 2));
Collections.sort(numbers);
System.out.println(numbers); // [2, 3, 5, 8, 10]
```

---

# **Sonuç**
Java Collection Framework, büyük veri kümelerini yönetmeyi kolaylaştırır ve verimli veri işleme sağlar. **List, Set, Queue ve Map** arayüzleri, farklı ihtiyaçlara göre özelleştirilmiş veri yapıları sunar.

Koleksiyonlarla çalışırken hangi yapının kullanılacağını **veri yapısının gereksinimlerine göre** seçmek önemlidir.

## Java 8 gelen özellikler Nedir ?
```sh 

```
---

Java 8, Mart 2014'te piyasaya sürüldü ve Java ekosisteminde devrim niteliğinde yenilikler getirdi. Özellikle **Lambda Expressions, Stream API, Functional Interfaces, Default Methods, Optional Class ve Date/Time API** gibi özellikler, Java'yı daha modern, işlevsel ve verimli bir dil haline getirdi. İşte Java 8 ile gelen yeniliklerin detaylı açıklaması:

---

## 1. **Lambda Expressions (Lambda İfadeleri)**
Java 8 ile birlikte fonksiyonel programlamaya daha yakın bir yapı geldi. Lambda ifadeleri sayesinde daha kısa ve okunabilir kod yazılabiliyor.

### **Öncesi (Java 7)**
```java
interface MathOperation {
    int operation(int a, int b);
}

public class LambdaExample {
    public static void main(String[] args) {
        MathOperation addition = new MathOperation() {
            @Override
            public int operation(int a, int b) {
                return a + b;
            }
        };
        System.out.println(addition.operation(5, 10));
    }
}
```

### **Java 8 ile (Lambda Kullanımı)**
```java
@FunctionalInterface
interface MathOperation {
    int operation(int a, int b);
}

public class LambdaExample {
    public static void main(String[] args) {
        MathOperation addition = (a, b) -> a + b;
        System.out.println(addition.operation(5, 10));
    }
}
```
✅ **Faydaları:** Daha az kod yazılır, okunabilirlik artar, anonim sınıflara gerek kalmaz.

---

## 2. **Functional Interfaces (Fonksiyonel Arayüzler)**
Java 8 ile birlikte **`@FunctionalInterface`** notasyonu geldi. Fonksiyonel arayüzler, yalnızca **bir adet abstract metot** içeren arayüzlerdir. Lambda ifadeleri ile birlikte kullanılır.

### **Örnek:**
```java
@FunctionalInterface
interface Greeting {
    void sayMessage(String message);
}

public class FunctionalInterfaceExample {
    public static void main(String[] args) {
        Greeting greet = message -> System.out.println("Hello, " + message);
        greet.sayMessage("Java 8!");
    }
}
```
Java 8, bazı **hazır fonksiyonel arayüzler** de sunar:
- **Predicate<T>** → `boolean test(T t)` → Koşul kontrolleri için.
- **Function<T, R>** → `R apply(T t)` → Bir değeri dönüştürmek için.
- **Consumer<T>** → `void accept(T t)` → Parametre alır, bir işlem yapar ama geriye değer döndürmez.
- **Supplier<T>** → `T get()` → Parametre almaz, bir değer üretir.

---

## 3. **Method References (Metot Referansları)**
Lambda ifadelerinin daha sade bir alternatifi olan **Method References**, halihazırda var olan metotları çağırmak için kullanılır.

### **Örnek:**
```java
class Printer {
    static void printMessage(String message) {
        System.out.println(message);
    }
}

public class MethodReferenceExample {
    public static void main(String[] args) {
        Consumer<String> printer = Printer::printMessage;
        printer.accept("Hello, Method Reference!");
    }
}
```
✅ **Faydası:** Lambda'yı daha da sade hale getirir.

---

## 4. **Stream API**
Java 8 ile gelen **Stream API**, koleksiyonlar (List, Set, Map) üzerinde fonksiyonel programlama yöntemleriyle işlem yapmayı sağlar.

### **Öncesi (Java 7 - Geleneksel Döngü)**
```java
List<String> names = Arrays.asList("Ali", "Veli", "Ayşe", "Fatma");
for (String name : names) {
    if (name.startsWith("A")) {
        System.out.println(name);
    }
}
```

### **Java 8 ile (Stream API Kullanımı)**
```java
List<String> names = Arrays.asList("Ali", "Veli", "Ayşe", "Fatma");
names.stream()
     .filter(name -> name.startsWith("A"))
     .forEach(System.out::println);
```
✅ **Faydaları:** Daha kısa ve okunabilir kod, paralel işlem yapma imkanı (parallelStream()), kodun fonksiyonel hale gelmesi.

---

## 5. **Default Methods (Varsayılan Metotlar)**
Arayüzlerde metotların **default** olarak uygulanabilmesini sağlar. Böylece eski kodlar bozulmadan yeni özellikler eklenebilir.

### **Örnek:**
```java
interface Vehicle {
    default void start() {
        System.out.println("Araç çalıştırıldı!");
    }
}

class Car implements Vehicle {
}

public class DefaultMethodExample {
    public static void main(String[] args) {
        Car car = new Car();
        car.start(); // "Araç çalıştırıldı!" çıktısını verir.
    }
}
```
✅ **Faydaları:** Geriye dönük uyumluluk korunur, bir arayüzü değiştirmek eski kodları bozmaz.

---

## 6. **Optional Class**
`Optional<T>` sınıfı, **NullPointerException (NPE) hatalarını önlemek** için kullanılır.

### **Öncesi (Java 7 - Null Kontrolü)**
```java
public String getName(User user) {
    if (user != null) {
        return user.getName();
    } else {
        return "Unknown";
    }
}
```

### **Java 8 ile (Optional Kullanımı)**
```java
import java.util.Optional;

public class OptionalExample {
    public static void main(String[] args) {
        Optional<String> name = Optional.ofNullable(null);
        System.out.println(name.orElse("Unknown"));
    }
}
```
✅ **Faydaları:** Null kontrolü gerektirmez, kod daha güvenli hale gelir.

---

## 7. **New Date/Time API (Yeni Tarih/Saat API)**
Java 8, **`java.time`** paketi ile modern bir tarih/saat API’si sundu. **Eski `java.util.Date` ve `Calendar` sınıflarına göre çok daha güçlüdür.**

### **Örnek:**
```java
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateTimeExample {
    public static void main(String[] args) {
        LocalDate date = LocalDate.now();
        LocalTime time = LocalTime.now();
        LocalDateTime dateTime = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");

        System.out.println("Tarih: " + date);
        System.out.println("Saat: " + time);
        System.out.println("Formatlı Tarih/Saat: " + dateTime.format(formatter));
    }
}
```
✅ **Faydaları:** Immutable yapılar, thread-safe, daha esnek ve kolay kullanım.

---

## 8. **Collectors API**
`Collectors` sınıfı, `Stream` API ile birlikte çalışarak veri kümelerini **gruplama, filtreleme ve toplama** işlemleri yapmaya yardımcı olur.

### **Örnek:**
```java
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CollectorsExample {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Ali", "Veli", "Ayşe", "Fatma");
        List<String> filteredNames = names.stream()
                                          .filter(name -> name.startsWith("A"))
                                          .collect(Collectors.toList());

        System.out.println(filteredNames); // ["Ali", "Ayşe"]
    }
}
```
✅ **Faydaları:** Daha kolay veri manipülasyonu sağlar.

---

## 9. **Nashorn JavaScript Engine**
Java 8, **Nashorn JavaScript motorunu** ekledi. Java içinde JavaScript çalıştırmayı sağlar.

### **Örnek:**
```java
import javax.script.*;

public class NashornExample {
    public static void main(String[] args) throws ScriptException {
        ScriptEngine engine = new ScriptEngineManager().getEngineByName("Nashorn");
        engine.eval("print('Hello from JavaScript');");
    }
}
```

---

Bu detaylı açıklamalar ile Java 8’in sunduğu tüm önemli yenilikleri kapsadık! 🚀



## Java 8 gelen özelliklerden stream nedir ?
```sh 

```
---

### **Java 8 Stream API Nedir? (Detaylı Anlatım)**

Java 8 ile gelen **Stream API**, koleksiyonlar (List, Set, Map vb.), diziler veya I/O işlemleri gibi veri kaynakları üzerinde fonksiyonel programlamayı destekleyen bir yapı sunar. Stream API, veri işleme sürecini daha okunaklı, daha basit ve daha performanslı hale getiren bir mekanizmadır.

Stream, bir veri yapısındaki elemanları işlemek için ardışık işlemler zinciri sağlar. Genellikle **map, filter, reduce, collect** gibi işlemleri fonksiyonel programlama paradigması ile gerçekleştirmek için kullanılır.

---

## **1. Stream API'nin Temel Özellikleri**
1. **İşlevsel Programlamayı Destekler**: Java'nın geleneksel döngü mantığının aksine, Stream API lambda ifadeleri ile işlevsel programlama sunar.
2. **İçsel (Internal) İterasyon Kullanır**: Döngülerde olduğu gibi harici (external) iterasyon yerine, Stream API veriyi kendisi işler.
3. **Parallel Processing Desteği**: Paralel işlemeye izin verir ve performansı artırabilir.
4. **Immutable (Değiştirilemez) ve Stateless (Durumsuz)**: Stream işlemleri, orijinal veri yapısını değiştirmez ve stateless çalışır.
5. **Lazy (Tembel) Değerlendirme Kullanır**: Yalnızca terminal işlemi çağrıldığında çalışmaya başlar.
6. **Pipeline (Boru Hattı) Mantığı ile Çalışır**: Bir akış, ardışık operasyonlar şeklinde düzenlenebilir.

---

## **2. Stream API Kullanımı**
Stream API, **java.util.stream** paketinde bulunur. Koleksiyonlardan bir Stream oluşturmak için farklı yollar mevcuttur:

### **2.1. Stream Nasıl Oluşturulur?**
Stream nesnesi oluşturmanın çeşitli yolları vardır:

### **A) Koleksiyonlardan Stream Oluşturma**
```java
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamExample {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Java", "Python", "C++", "Go");

        // Listeyi Stream'e dönüştürme
        Stream<String> stream = list.stream();

        // Stream içeriğini ekrana yazdırma
        stream.forEach(System.out::println);
    }
}
```
Bu yöntem, bir **List** veya **Set** gibi koleksiyonlardan stream oluşturmak için kullanılır.

---

### **B) Dizilerden Stream Oluşturma**
```java
import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamFromArray {
    public static void main(String[] args) {
        String[] array = {"Apple", "Banana", "Cherry"};

        // Diziden Stream oluşturma
        Stream<String> stream = Arrays.stream(array);
        stream.forEach(System.out::println);

        // Primitive int dizisi için
        int[] numbers = {1, 2, 3, 4, 5};
        IntStream intStream = Arrays.stream(numbers);
        intStream.forEach(System.out::println);
    }
}
```

---

### **C) Stream.of() ile Stream Oluşturma**
```java
Stream<String> stream = Stream.of("One", "Two", "Three");
stream.forEach(System.out::println);
```
Bu yöntem, doğrudan elemanlardan Stream oluşturmak için kullanılır.

---

### **D) Infinite Stream (Sonsuz Stream)**
```java
import java.util.stream.Stream;

public class InfiniteStreamExample {
    public static void main(String[] args) {
        Stream<Integer> infiniteStream = Stream.iterate(1, n -> n + 1);

        // İlk 10 elemanı al
        infiniteStream.limit(10).forEach(System.out::println);
    }
}
```
Bu örnekte `iterate` metodu ile sonsuz bir Stream oluşturulmuş ve `limit(10)` ile ilk 10 elemanı alınmıştır.

---

## **3. Stream API Metotları**
Stream API'de iki tür metod bulunur:
1. **Ara İşlemler (Intermediate Operations)** → Yeni bir Stream üretir, genellikle `filter()`, `map()`, `sorted()` gibi metotlar.
2. **Terminal İşlemler (Terminal Operations)** → Stream'i işler ve sonlandırır, genellikle `collect()`, `forEach()`, `count()`, `reduce()` gibi metotlar.

---

### **3.1. Ara İşlemler (Intermediate Operations)**

#### **A) filter() - Filtreleme**
Belirtilen bir şarta göre Stream içindeki elemanları filtreler.

```java
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamFilterExample {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Ali", "Ayşe", "Mehmet", "Ahmet");

        // "A" harfi ile başlayan isimleri filtrele
        List<String> filteredNames = names.stream()
                .filter(name -> name.startsWith("A"))
                .collect(Collectors.toList());

        System.out.println(filteredNames);
    }
}
```

---

#### **B) map() - Dönüştürme**
Her elemanı bir başka formata dönüştürmek için kullanılır.

```java
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamMapExample {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("java", "python", "c++");

        // Büyük harfe çevir
        List<String> upperCaseNames = names.stream()
                .map(String::toUpperCase)
                .collect(Collectors.toList());

        System.out.println(upperCaseNames);
    }
}
```

---

#### **C) sorted() - Sıralama**
Stream içindeki elemanları sıralar.

```java
import java.util.Arrays;
import java.util.List;

public class StreamSortedExample {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(5, 2, 9, 1, 7);

        numbers.stream()
                .sorted()
                .forEach(System.out::println);
    }
}
```

---

### **3.2. Terminal İşlemler (Terminal Operations)**

#### **A) collect() - Sonuçları Toplama**
Stream içindeki verileri liste, set veya map gibi yapılara toplar.

```java
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamCollectExample {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Ali", "Veli", "Zeynep", "Murat");

        List<String> collectedList = names.stream()
                .filter(name -> name.length() > 3)
                .collect(Collectors.toList());

        System.out.println(collectedList);
    }
}
```

---

#### **B) reduce() - Özetleme (Reduction)**
Stream elemanlarını birleştirmek için kullanılır.

```java
import java.util.Arrays;
import java.util.List;

public class StreamReduceExample {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);

        int sum = numbers.stream()
                .reduce(0, Integer::sum);

        System.out.println("Toplam: " + sum);
    }
}
```

---

## **Sonuç**
- Java 8 Stream API, koleksiyonlar ve diziler gibi veri yapıları üzerinde **daha okunaklı, performanslı ve fonksiyonel işlemler** yapmayı sağlar.
- `map()`, `filter()`, `sorted()`, `collect()`, `reduce()` gibi işlemlerle güçlü veri manipülasyonu sağlar.
- `parallelStream()` ile paralel işlemler yapılabilir.

Stream API, Java 8’in getirdiği en güçlü özelliklerden biridir ve modern Java programlamada oldukça yaygın kullanılmaktadır. 🚀


## Javada Annotation Nedir ?
```sh 

```
---
Java'da **Annotation (Notasyon)**, kod hakkında ek bilgi sağlayan bir **metadata** (üst bilgi) mekanizmasıdır. Annotation'lar, kodun derlenmesi, çalıştırılması veya analiz edilmesi sırasında derleyici, çalışma zamanı araçları veya IDE tarafından işlenebilir.

---

# **Annotation Nedir?**
Annotation’lar, bir programın kaynak koduna eklenen özel işaretlerdir ve **sınıflara, metotlara, değişkenlere, parametrelere ve diğer bileşenlere uygulanabilir**. Ancak, programın mantığını doğrudan etkilemezler. Annotation’lar, derleyici direktifleri, hata yakalama bilgileri ve çalışma zamanı işlemleri için kullanılır.

Java'daki **annotation'lar genellikle framework'ler ve kütüphaneler tarafından kullanılır**. Örneğin, Spring, Hibernate ve JUnit gibi framework'lerde annotation’lar, yapılandırma ve otomasyon süreçlerini kolaylaştırır.

---

# **Annotation Kullanım Alanları**
Annotation’lar üç ana kategoride kullanılır:

1. **Derleyici Direktifleri (Compiler Instructions)**
    - Derleyiciye hata veya uyarı mesajları hakkında bilgi verir.
    - Örneğin: `@Override`, `@SuppressWarnings`

2. **Kod Üretme (Code Generation)**
    - Çeşitli araçlar tarafından kod üretmek için kullanılır.
    - Örneğin: `@Entity`, `@Getter`, `@Setter` (Lombok)

3. **Çalışma Zamanında (Runtime Processing)**
    - Çalışma zamanı işlemleri için **Reflection API** ile kullanılabilir.
    - Örneğin: `@Autowired`, `@Transactional` (Spring Framework)

---

# **Java'da Annotation Türleri**
Java’da annotation’lar üç farklı şekilde sınıflandırılabilir:

### **1. Java'nın Varsayılan (Built-in) Annotation’ları**
Java’nın kendi içinde sunduğu bazı annotation’lar şunlardır:

| Annotation | Açıklama |
|------------|----------|
| `@Override` | Bir metotun üst sınıftaki metodu ezdiğini belirtir. |
| `@Deprecated` | Bir metot veya sınıfın kullanım dışı olduğunu belirtir. |
| `@SuppressWarnings` | Derleyicinin belirli uyarıları göz ardı etmesini sağlar. |
| `@FunctionalInterface` | Bir arayüzün yalnızca bir metot içermesi gerektiğini belirtir. |
| `@SafeVarargs` | Değişken uzunlukta parametre listesi (varargs) kullanan metotlarda güvenli kullanım sağlanmasını belirtir. |
| `@Native` | Sabit (constant) değişkenlerin `native code` içinde kullanılacağını belirtir. |

Örnek:
```java
class Base {
    void show() {
        System.out.println("Base class");
    }
}

class Derived extends Base {
    @Override
    void show() {  // `@Override` kullanımı
        System.out.println("Derived class");
    }
}
```

---

### **2. Meta-Annotation (Annotation’ları Anotasyonlama)**
Java’da annotation’ların nasıl çalıştığını ve hangi alanlarda geçerli olduğunu belirleyen meta-annotation’lar vardır.

| Meta-Annotation | Açıklama |
|-----------------|----------|
| `@Target` | Annotation’ın uygulanabileceği öğeleri belirtir (sınıf, metot, alan, parametre, vb.). |
| `@Retention` | Annotation’ın ne kadar süreyle saklanacağını belirtir. |
| `@Inherited` | Annotation’ın alt sınıflar tarafından miras alınmasını sağlar. |
| `@Documented` | Annotation’ın Javadoc’ta görünmesini sağlar. |
| `@Repeatable` | Aynı annotation’ın birden fazla kez kullanılmasını sağlar. |

Örnek:
```java
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

// Bu annotation yalnızca metodlara uygulanabilir.
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@interface MyAnnotation {
    String value() default "Varsayılan Değer";
}
```

---

### **3. Kullanıcı Tanımlı (Custom) Annotation’lar**
Kendi annotation’larımızı oluşturabiliriz.

Örnek olarak bir **loglama** annotation’ı yapalım:
```java
import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME) // Çalışma zamanında erişilebilir
@Target(ElementType.METHOD) // Yalnızca metotlara uygulanabilir
@interface LogExecutionTime {
}
```

Şimdi bu annotation’ı bir metotta kullanalım:
```java
class Test {
    @LogExecutionTime
    void process() {
        System.out.println("Bu metot loglanacak.");
    }
}
```
Bu annotation’ı **Reflection API** ile işleyebiliriz:
```java
import java.lang.reflect.Method;

public class AnnotationProcessor {
    public static void main(String[] args) throws Exception {
        Method method = Test.class.getMethod("process");
        
        if (method.isAnnotationPresent(LogExecutionTime.class)) {
            System.out.println("process() metodu LogExecutionTime annotation’ı ile işaretlenmiştir.");
        }
    }
}
```
Bu kodun çıktısı:
```
process() metodu LogExecutionTime annotation’ı ile işaretlenmiştir.
```

---

# **Annotation’ların Retention Policy (Saklama Politikaları)**
Bir annotation’ın hangi aşamada saklanacağını belirlemek için `@Retention` kullanılır.

| Retention Policy | Açıklama |
|------------------|----------|
| `SOURCE` | Yalnızca kaynak kodda bulunur, derleme sırasında atılır. |
| `CLASS` | Derleme aşamasında derlenmiş kodda bulunur, ancak çalışma zamanında erişilemez. |
| `RUNTIME` | Çalışma zamanında Reflection API ile erişilebilir. |

Örnek:
```java
@Retention(RetentionPolicy.RUNTIME)
@interface RuntimeAnnotation {
}
```

---

# **İleri Düzey Kullanım: Annotation İşleyici (Processor)**
Çalışma zamanında annotation'ları okumak için **Reflection API** kullanılır.

Örneğin:
```java
import java.lang.reflect.Method;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@interface MyTest {
}

class Demo {
    @MyTest
    void testMethod() {
        System.out.println("Test metodu çalıştı.");
    }
}

public class AnnotationProcessor {
    public static void main(String[] args) {
        for (Method method : Demo.class.getDeclaredMethods()) {
            if (method.isAnnotationPresent(MyTest.class)) {
                try {
                    method.invoke(new Demo()); // Metodu çağır
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
```
Bu kod `@MyTest` annotation’ına sahip metotları çalıştırır.

Çıktı:
```
Test metodu çalıştı.
```

---

# **Sonuç**
- **Annotation’lar**, Java’da meta-veri (metadata) eklemek için kullanılan mekanizmalardır.
- **Framework ve kütüphanelerde yaygın olarak kullanılırlar** (Spring, Hibernate, Lombok, JUnit).
- **Üç temel türü vardır**: Java’nın kendi annotation’ları, meta-annotation’lar ve kullanıcı tanımlı annotation’lar.
- **Çalışma zamanında işlenebilir** ve **Reflection API** ile okunabilir.
- **Modern Java uygulamalarında, özellikle Spring Boot gibi framework’lerde merkezi bir rol oynar.**


## Javada Optional
```sh 

```
---

Java'da `Optional<T>` sınıfı, **null referanslarını güvenli bir şekilde ele almak için** kullanılır. `Optional`, **"null safety"** sağlayarak, `NullPointerException` hatalarını minimize etmeye yardımcı olur.

---

## **1. Optional Nedir?**
`Optional`, `java.util` paketinde bulunan ve **içinde bir değer olup olmadığını temsil eden bir kapsayıcı (container)** sınıftır.

- **Boş olabilir (`Optional.empty()`)**
- **Bir değer içerebilir (`Optional.of(T value)`)**

Java 8 ile tanıtılmıştır ve özellikle **null kontrollerini daha okunaklı ve güvenli hale getirmek için** kullanılır.

---

## **2. Optional Nasıl Kullanılır?**
### **2.1. Optional ile Değer Oluşturma**
```java
import java.util.Optional;

public class Main {
    public static void main(String[] args) {
        // Değer içeren bir Optional nesnesi
        Optional<String> optionalWithValue = Optional.of("Merhaba, Java!");

        // Boş bir Optional nesnesi
        Optional<String> emptyOptional = Optional.empty();

        // Nullable bir değer içerebilen Optional
        Optional<String> nullableOptional = Optional.ofNullable(null); // Boş Optional döner

        System.out.println("Optional Değer: " + optionalWithValue.orElse("Varsayılan Değer"));
        System.out.println("Boş Optional: " + emptyOptional.orElse("Varsayılan Değer"));
    }
}
```
---
## **3. Optional Kullanım Senaryoları**
### **3.1. Optional ile Null Kontrolü**
**Klasik Null Kontrolü:**
```java
public String getUserName(User user) {
    if (user != null) {
        return user.getName();
    } else {
        return "Bilinmeyen Kullanıcı";
    }
}
```
**Optional ile Null Kontrolü:**
```java
public String getUserName(User user) {
    return Optional.ofNullable(user)
                   .map(User::getName)
                   .orElse("Bilinmeyen Kullanıcı");
}
```
💡 **Avantaj:** Daha okunaklı ve hatasız bir kod yapısı sağlanır.

---

### **3.2. Optional ile Değer Varlığını Kontrol Etme**
```java
Optional<String> optionalValue = Optional.of("Java 8");

// Eğer değer varsa, yazdır
optionalValue.ifPresent(value -> System.out.println("Değer: " + value));
```
💡 **Avantaj:** `null` kontrolü yapmadan doğrudan işlem yapmamızı sağlar.

---

### **3.3. Optional ile Varsayılan Değer Kullanımı**
```java
String result = optionalValue.orElse("Varsayılan Değer");
System.out.println(result);
```
💡 **Avantaj:** Eğer `optionalValue` içinde değer varsa onu döndürür, yoksa varsayılan değeri döndürür.

Alternatif olarak:
```java
String result = optionalValue.orElseGet(() -> "Varsayılan Değer");
```
💡 **Fark:** `orElse()` her zaman çalışır, ancak `orElseGet()` sadece `Optional` boşsa çalışır.

---

### **3.4. Optional ile Exception Fırlatma**
```java
String value = optionalValue.orElseThrow(() -> new IllegalArgumentException("Değer bulunamadı!"));
```
💡 **Avantaj:** Eğer değer boşsa, belirli bir hata fırlatabiliriz.

---

## **4. Optional ile Fonksiyonel Programlama**
### **4.1. map() Kullanımı**
Eğer `Optional` içinde bir değer varsa, `map()` ile bu değeri dönüştürebiliriz.
```java
Optional<String> name = Optional.of("Java");
Optional<Integer> nameLength = name.map(String::length);
System.out.println(nameLength.orElse(0)); // Çıktı: 4
```
💡 **Avantaj:** Null kontrolü yapmadan, doğrudan değer üzerinde işlem yapabiliriz.

---

### **4.2. flatMap() Kullanımı**
`Optional<Optional<T>>` gibi iç içe `Optional` oluşmasını engellemek için `flatMap()` kullanılır.
```java
class User {
    private Optional<String> email;

    public Optional<String> getEmail() {
        return email;
    }
}

User user = new User();
Optional<String> email = Optional.of(user).flatMap(User::getEmail);
```
💡 **Avantaj:** İç içe Optional kullanımını önler.

---

## **5. Optional Kullanılmaması Gereken Durumlar**
**1️⃣ DTO veya Entity içinde Optional Kullanımı:**
- `Optional` bir sınıfın alanı olarak kullanılmamalıdır. Çünkü `Optional` serileştirilmeye uygun değildir.

```java
// KÖTÜ KULLANIM ❌
class User {
    private Optional<String> email; // Kullanılmamalı!
}
```
- Bunun yerine, normal değişken kullanın:
```java
// DOĞRU KULLANIM ✅
class User {
    private String email;
}
```

**2️⃣ Koleksiyonlar İçinde Optional Kullanımı:**
- Koleksiyon içinde `Optional` kullanmak yerine, boş koleksiyon döndürmek daha iyidir.
```java
// KÖTÜ KULLANIM ❌
List<Optional<String>> emails;

// DOĞRU KULLANIM ✅
List<String> emails = Collections.emptyList();
```

---

## **Sonuç**
✅ `Optional<T>` sınıfı, `null` kontrolünü daha okunaklı ve güvenli hale getirir.  
✅ `if (obj != null)` gibi geleneksel `null` kontrollerini azaltır.  
✅ Fonksiyonel programlama prensiplerine uygun olarak çalışır.  
❌ DTO'lar ve koleksiyonlar içinde kullanılmamalıdır.

💡 **Özetle**, Java'da `Optional`, **null kaynaklı hataları önlemek ve kodun daha temiz olmasını sağlamak** için harika bir araçtır! 🚀


## Javada Cipher (AES/DES/HASHING) Nedir ?
```sh 

```                                                                            
---

Pom.xml
<!-- Java Cryptography Extension (JCE) İçin Gerekli -->
<dependency>
<groupId>javax.xml.bind</groupId>
<artifactId>jaxb-api</artifactId>
<version>2.3.1</version>
</dependency>

<!-- Java'da Şifreleme (AES) İçin Apache Commons Codec -->
<dependency>
    <groupId>commons-codec</groupId>
    <artifactId>commons-codec</artifactId>
    <version>1.15</version>
</dependency>

Java'da **Cipher** sınıfı, Java Cryptography Extension (JCE) API’si tarafından sağlanan bir şifreleme mekanizmasıdır ve şifreleme (encryption) ve şifre çözme (decryption) işlemleri için kullanılır. **Cipher** sınıfı, **AES, DES, RSA, HASHING (MD5, SHA-256 gibi)** gibi birçok algoritmayı destekler.

---

## **Cipher Sınıfı Nedir?**
`javax.crypto.Cipher` sınıfı, Java'da **kriptografik dönüşümler** (cryptographic transformations) gerçekleştirmek için kullanılır. Bu dönüşümler şunları içerebilir:
- Veri şifreleme (Encryption)
- Veri şifre çözme (Decryption)
- Veri imzalama (Signing)
- Veri doğrulama (Verification)

Bir **Cipher** nesnesi aşağıdaki **modlardan** biriyle çalışabilir:
1. **ENCRYPT_MODE** → Şifreleme modu (Veriyi şifreler)
2. **DECRYPT_MODE** → Şifre çözme modu (Şifrelenmiş veriyi çözer)
3. **WRAP_MODE** → Anahtar sarmalama (Key Wrapping)
4. **UNWRAP_MODE** → Anahtar çözme (Key Unwrapping)

Cipher, genellikle bir anahtar (Key) ve bir algoritma belirterek kullanılır.

---

# **1. AES (Advanced Encryption Standard)**
### **Nedir?**
- AES, **simetrik şifreleme algoritmasıdır**. (Aynı anahtar hem şifreleme hem de şifre çözme için kullanılır.)
- **Blok şifreleme algoritmasıdır** ve 128-bit blok boyutuna sahiptir.
- **Anahtar boyutları**: 128-bit, 192-bit ve 256-bit olabilir.
- **Güvenli ve yaygın olarak kullanılan bir algoritmadır.** (Bankacılık, VPN, Wi-Fi şifreleme vb.)

### **AES ile Şifreleme ve Çözme Kodu**
```java
import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;
import java.util.Base64;

public class AESExample {
    public static void main(String[] args) throws Exception {
        // AES Anahtarı oluştur
        KeyGenerator keyGenerator = KeyGenerator.getInstance("AES");
        keyGenerator.init(128); // 128-bit anahtar
        SecretKey secretKey = keyGenerator.generateKey();

        // Cipher nesnesini AES için başlat
        Cipher cipher = Cipher.getInstance("AES");

        String originalText = "Merhaba, AES Şifreleme!";
        
        // Şifreleme (Encryption)
        cipher.init(Cipher.ENCRYPT_MODE, secretKey);
        byte[] encryptedBytes = cipher.doFinal(originalText.getBytes());
        String encryptedText = Base64.getEncoder().encodeToString(encryptedBytes);
        System.out.println("Şifrelenmiş Metin: " + encryptedText);

        // Şifre Çözme (Decryption)
        cipher.init(Cipher.DECRYPT_MODE, secretKey);
        byte[] decryptedBytes = cipher.doFinal(Base64.getDecoder().decode(encryptedText));
        String decryptedText = new String(decryptedBytes);
        System.out.println("Çözülen Metin: " + decryptedText);
    }
}
```

#### **AES ile Şifreleme Modları**
AES şifreleme **farklı blok şifreleme modları** ile kullanılabilir:
1. **ECB (Electronic Codebook)** → Zayıf, tekrar eden blokları aynı şekilde şifreler.
2. **CBC (Cipher Block Chaining)** → Önceki bloğun çıktısını XOR ile karıştırarak daha güvenli hale getirir.
3. **CFB (Cipher Feedback)** → Akış şifrelemesi gibi çalışır.
4. **OFB (Output Feedback)** → Blokları bağımsız olarak şifreler.
5. **GCM (Galois Counter Mode)** → Kimlik doğrulamalı şifreleme sağlar.

AES **CBC Modu** kullanımı:
```java
Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
```

---

# **2. DES (Data Encryption Standard)**
### **Nedir?**
- **Simetrik bir şifreleme algoritmasıdır.** (AES gibi aynı anahtarı kullanır.)
- **Blok boyutu**: 64-bit
- **Anahtar uzunluğu**: 56-bit
- **Eskimiş bir algoritmadır ve günümüzde pek güvenli değildir.** (AES’e göre zayıf)

### **DES ile Şifreleme ve Çözme**
```java
import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;
import java.util.Base64;

public class DESExample {
    public static void main(String[] args) throws Exception {
        // DES Anahtarı oluştur
        KeyGenerator keyGenerator = KeyGenerator.getInstance("DES");
        SecretKey secretKey = keyGenerator.generateKey();

        // Cipher nesnesini DES için başlat
        Cipher cipher = Cipher.getInstance("DES");

        String originalText = "Merhaba, DES Şifreleme!";
        
        // Şifreleme
        cipher.init(Cipher.ENCRYPT_MODE, secretKey);
        byte[] encryptedBytes = cipher.doFinal(originalText.getBytes());
        String encryptedText = Base64.getEncoder().encodeToString(encryptedBytes);
        System.out.println("Şifrelenmiş Metin: " + encryptedText);

        // Şifre Çözme
        cipher.init(Cipher.DECRYPT_MODE, secretKey);
        byte[] decryptedBytes = cipher.doFinal(Base64.getDecoder().decode(encryptedText));
        String decryptedText = new String(decryptedBytes);
        System.out.println("Çözülen Metin: " + decryptedText);
    }
}
```
**DES, zayıf olduğu için AES tercih edilmelidir.**

---

# **3. RSA (Rivest-Shamir-Adleman)**
### **Nedir?**
- **Asimetrik şifreleme algoritmasıdır.** (Şifreleme ve şifre çözme için farklı anahtarlar kullanılır.)
- **Genellikle dijital imzalar ve anahtar değişimi için kullanılır.**
- **Anahtar uzunluğu**: 1024-bit, 2048-bit, 4096-bit olabilir.
- **Çok güvenlidir ancak yavaştır.**

### **RSA ile Şifreleme ve Çözme**
```java
import javax.crypto.Cipher;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.util.Base64;

public class RSAExample {
    public static void main(String[] args) throws Exception {
        // RSA Anahtar Çifti Oluştur
        KeyPairGenerator keyPairGenerator = KeyPairGenerator.getInstance("RSA");
        keyPairGenerator.initialize(2048);
        KeyPair keyPair = keyPairGenerator.generateKeyPair();

        // Cipher nesnesini RSA için başlat
        Cipher cipher = Cipher.getInstance("RSA");

        String originalText = "Merhaba, RSA Şifreleme!";
        
        // Şifreleme (Public Key kullanarak)
        cipher.init(Cipher.ENCRYPT_MODE, keyPair.getPublic());
        byte[] encryptedBytes = cipher.doFinal(originalText.getBytes());
        String encryptedText = Base64.getEncoder().encodeToString(encryptedBytes);
        System.out.println("Şifrelenmiş Metin: " + encryptedText);

        // Şifre Çözme (Private Key kullanarak)
        cipher.init(Cipher.DECRYPT_MODE, keyPair.getPrivate());
        byte[] decryptedBytes = cipher.doFinal(Base64.getDecoder().decode(encryptedText));
        String decryptedText = new String(decryptedBytes);
        System.out.println("Çözülen Metin: " + decryptedText);
    }
}
```

---

# **4. HASHING (SHA-256, MD5, SHA-512)**
- **Hash fonksiyonları tek yönlüdür ve geri çevrilemez.**
- **Parola saklama ve veri bütünlüğü sağlama işlemlerinde kullanılır.**
- **MD5, SHA-1 artık güvenli değildir. SHA-256 veya SHA-512 tercih edilmelidir.**

### **SHA-256 Hashleme**
```java
import java.security.MessageDigest;
import java.util.Base64;

public class HashingExample {
    public static void main(String[] args) throws Exception {
        String password = "123456";
        
        MessageDigest digest = MessageDigest.getInstance("SHA-256");
        byte[] hash = digest.digest(password.getBytes());
        
        String hashedPassword = Base64.getEncoder().encodeToString(hash);
        System.out.println("SHA-256 Hash: " + hashedPassword);
    }
}
```

---

Bu açıklamalarla birlikte, **AES, DES, RSA ve Hashing algoritmalarının** Java'da nasıl kullanıldığını tam detaylı olarak öğrenmiş oldunuz. 🚀



## Javada Composition
```sh 

```
---

## **Java'da Composition (Bileşim) Nedir?**

### **1. Tanım**
Composition (Bileşim), bir sınıfın başka bir sınıfı nesne olarak içermesi anlamına gelir. Bu, OOP'nin (Nesne Yönelimli Programlama) en önemli özelliklerinden biridir ve "Has-A (Sahip Olma)" ilişkisini ifade eder. Yani, bir sınıf başka bir sınıfa "sahiptir" ve onun özelliklerini kendi içinde kullanabilir.

Inheritance (Miras) ile karşılaştırıldığında, composition genellikle **daha esnek ve güçlü bir ilişki** sunar. Çünkü miras (inheritance), kalıtım hiyerarşisi oluştururken, composition doğrudan nesneleri kullanarak sınıflar arasında ilişki kurar.

---

### **2. Composition’un Temel Mantığı**
Composition şu mantık üzerine kuruludur:

- Bir sınıfın, başka bir sınıfın yeteneklerini kullanabilmesi için, o sınıfın bir **örneğini (instance)** içinde bulundurur.
- Bir nesne, içerdiği nesnenin metodlarını çağırarak, bileşen nesnenin fonksiyonlarını kendi içinde kullanabilir.
- Kalıtımda olduğu gibi bir is-a (bir şeydir) ilişkisi değil, **has-a (bir şeye sahiptir) ilişkisi** oluşturur.

---

### **3. Composition’un Avantajları**
1. **Daha Esnek ve Daha Az Bağımlı Kod:**
    - Kalıtımda, bir sınıf başka bir sınıftan türediğinde tüm özelliklerini alır. Ancak, bu bağımlılığı artırır ve değişiklikleri zorlaştırır.
    - Composition'da ise, yalnızca ihtiyacımız olan özellikleri nesne olarak dahil ederiz.

2. **Çoklu Kullanım (Reusability):**
    - Bileşim ile yazılan sınıflar, bağımsız bileşenlerden oluştuğu için birden fazla yerde tekrar kullanılabilir.

3. **Daha Kolay Bakım (Maintainability):**
    - Değişiklik yapmak daha kolaydır çünkü sınıflar birbirinden bağımsız çalışabilir.

4. **Daha Güçlü Enkapsülasyon (Encapsulation):**
    - Composition, kapsüllemeyi daha iyi destekler çünkü iç içe geçen nesneler arasında doğrudan bir kalıtım bağı bulunmaz.

---

### **4. Java'da Composition Örneği**

Diyelim ki bir **Araba (Car)** sınıfımız var ve bir **Motor (Engine)** sınıfına ihtiyaç duyuyor. Burada **Araba**, bir **Motor**'a sahip olmalıdır.

```java
// Motor sınıfı
class Engine {
    private String type;
    
    public Engine(String type) {
        this.type = type;
    }
    
    public void start() {
        System.out.println(type + " motor çalıştırıldı.");
    }
}

// Araba sınıfı
class Car {
    private Engine engine; // Composition burada gerçekleşiyor
    
    public Car(Engine engine) {
        this.engine = engine;
    }
    
    public void startCar() {
        System.out.println("Araba çalıştırılıyor...");
        engine.start(); // İçerdiği motorun start() metodunu çağırıyoruz
    }
}

// Ana sınıf (Main)
public class Main {
    public static void main(String[] args) {
        Engine myEngine = new Engine("V8"); // Motor nesnesi oluşturduk
        Car myCar = new Car(myEngine); // Arabayı motor ile ilişkilendirdik
        myCar.startCar(); // Aracı çalıştır
    }
}
```

### **Çıktı**
```
Araba çalıştırılıyor...
V8 motor çalıştırıldı.
```

Burada **Car (Araba) sınıfı, Engine (Motor) sınıfını içererek bir has-a ilişkisi oluşturdu**. Arabanın motoru olmadan çalışması mümkün değildir.

---

### **5. Inheritance (Kalıtım) ile Composition Karşılaştırması**
Composition ve kalıtım farklı konseptlerdir. Peki, ne zaman composition ne zaman kalıtım kullanmalıyız?

| **Özellik**         | **Inheritance (Kalıtım)** | **Composition (Bileşim)** |
|---------------------|----------------------|----------------------|
| **İlişki Türü**     | "Is-A" (Bir şeydir)   | "Has-A" (Bir şeye sahiptir) |
| **Bağımlılık**      | Alt sınıf üst sınıfa bağımlıdır. | Daha bağımsızdır, sınıflar daha esnektir. |
| **Esneklik**        | Değiştirmek zordur, miras alındığında tüm özellikler gelir. | Bir nesne içindeki bileşenler ayrı ayrı yönetilebilir. |
| **Kullanım Durumu** | Mevcut bir sınıfın yeteneklerini genişletmek için. | Bir sınıfın başka bir sınıfın özelliklerine sahip olmasını sağlamak için. |

#### **Örnek**
- **Kalıtım (Inheritance) Kullanımı:**
  ```java
  class Animal {
      void makeSound() {
          System.out.println("Hayvan ses çıkarıyor.");
      }
  }
  
  class Dog extends Animal {
      void bark() {
          System.out.println("Köpek havlıyor.");
      }
  }
  
  public class Main {
      public static void main(String[] args) {
          Dog dog = new Dog();
          dog.makeSound(); // Kalıtım yoluyla Animal sınıfının metodunu kullanabilir
          dog.bark();
      }
  }
  ```
  **Çıktı:**
  ```
  Hayvan ses çıkarıyor.
  Köpek havlıyor.
  ```

- **Composition Kullanımı:**
  ```java
  class Heart {
      void pump() {
          System.out.println("Kalp kan pompalıyor.");
      }
  }
  
  class Human {
      private Heart heart;
      
      public Human() {
          heart = new Heart(); // Composition
      }
      
      void live() {
          System.out.println("İnsan yaşıyor...");
          heart.pump();
      }
  }
  
  public class Main {
      public static void main(String[] args) {
          Human human = new Human();
          human.live();
      }
  }
  ```
  **Çıktı:**
  ```
  İnsan yaşıyor...
  Kalp kan pompalıyor.
  ```

Burada **İnsan ve Kalp** arasında bir "Has-A" ilişkisi vardır. **İnsan bir kalp değildir, fakat bir kalbe sahiptir**. İşte bu, composition’un en büyük farkıdır.

---

### **6. Composition Kullanım Senaryoları**
Composition genellikle şu durumlarda kullanılır:
- **Karmaşık nesneleri modellemek için:** Örneğin, bir **Üniversite** içinde **Bölümler**, **Öğrenciler**, **Öğretmenler** bulunabilir.
- **Kapsüllemeyi güçlendirmek için:** Sınıflar arasında sıkı bağımlılık olmadan yönetim sağlar.
- **Kalıtımın gereksiz bağımlılığından kaçınmak için:** Örneğin, bir **Araç** sınıfı hem **Benzinli** hem **Elektrikli** motorları destekleyebilir. Kalıtım yerine motoru ayrı bir bileşen olarak tutmak daha mantıklıdır.

---

### **7. Sonuç**
Composition, **OOP'de daha esnek ve modüler bir yapı sağlar**. Bir sınıfın başka bir sınıfın özelliklerini **kalıtım yerine bileşim yoluyla** kullanmasını sağlar. Özellikle **bağımlılıkları azaltmak, kod tekrarını önlemek ve daha sürdürülebilir yazılım geliştirmek** için önemlidir.

Eğer bir nesne diğer bir nesneyi **sahipleniyorsa (has-a relationship)** ve o nesnenin fonksiyonlarını kullanıyorsa, Composition kullanmalısınız. Eğer bir nesne başka bir nesnenin özelliklerini tamamen devralıyorsa ve **o nesne onun bir türevidir (is-a relationship)**, o zaman kalıtım kullanabilirsiniz.


## Thread Oluşturma ve Yönetimi
```sh 

```
---

# **Java'da Thread Oluşturma ve Yönetimi**

Java'da **Thread (İş Parçacığı)**, programların paralel çalışmasını sağlamak için kullanılan bir mekanizmadır. Thread'ler, programın farklı bölümlerini aynı anda çalıştırarak performansı artırır ve CPU kullanımını optimize eder. Java'da **çoklu iş parçacığı (multithreading)**, bir uygulamanın birden fazla iş parçacığını aynı anda çalıştırmasını sağlar.

---

## **1. Thread Nedir?**
Thread, bir programın bağımsız olarak çalıştırılabilen en küçük yürütülebilir birimidir. Java'da her uygulama, varsayılan olarak **main thread** ile başlar. Ekstra iş parçacıkları oluşturarak, işlemler paralel bir şekilde yürütülebilir.

Örneğin, bir web sunucusu aynı anda birden fazla isteği işleyebilmek için birden fazla thread kullanır. Bir grafik arayüz uygulamasında, kullanıcı girişleri ve arka plan işlemleri farklı thread'ler tarafından yönetilir.

---

## **2. Java'da Thread Nasıl Oluşturulur?**
Java'da thread oluşturmanın iki temel yolu vardır:

1. **Thread sınıfını genişletmek (Extending the Thread Class)**
2. **Runnable arayüzünü (Interface) uygulamak (Implementing Runnable Interface)**

### **2.1 Thread Sınıfını Genişletmek**
Java'da `Thread` sınıfını genişleterek (extend ederek) yeni bir thread oluşturabiliriz. `run()` metodu, thread çalıştırıldığında ne yapılacağını belirtir.

**Örnek:**
```java
class MyThread extends Thread {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(Thread.currentThread().getName() + " - Değer: " + i);
            try {
                Thread.sleep(1000); // 1 saniye beklet
            } catch (InterruptedException e) {
                System.out.println("Thread kesintiye uğradı!");
            }
        }
    }
}

public class ThreadExample {
    public static void main(String[] args) {
        MyThread thread1 = new MyThread();
        MyThread thread2 = new MyThread();

        thread1.start(); // Yeni bir iş parçacığı başlatır
        thread2.start();
    }
}
```
**Çıktı:**
```
Thread-0 - Değer: 1
Thread-1 - Değer: 1
Thread-0 - Değer: 2
Thread-1 - Değer: 2
...
```
> **Not:** `start()` metodu `run()` metodunu çağırır ve thread'i başlatır. Eğer `run()` doğrudan çağrılırsa, thread olarak çalışmaz, normal bir metot çağrısı olur.

---

### **2.2 Runnable Arayüzünü Uygulamak**
Thread oluşturmanın daha iyi bir yolu, `Runnable` arayüzünü uygulamaktır. Java'da bir sınıfın yalnızca bir üst sınıfı olabileceğinden (`Thread` sınıfını genişletmek kalıtımı sınırlar), `Runnable` arayüzü kullanmak daha esnek bir yaklaşımdır.

**Örnek:**
```java
class MyRunnable implements Runnable {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(Thread.currentThread().getName() + " - Sayı: " + i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println("Thread kesintiye uğradı!");
            }
        }
    }
}

public class RunnableExample {
    public static void main(String[] args) {
        Thread thread1 = new Thread(new MyRunnable());
        Thread thread2 = new Thread(new MyRunnable());

        thread1.start();
        thread2.start();
    }
}
```

**Avantajları:**
- Java çoklu kalıtımı desteklemediği için `Runnable` kullanarak başka bir sınıfı da genişletebiliriz.
- Daha temiz bir kod yapısı sağlar.

---

## **3. Thread Yönetimi**
Birden fazla iş parçacığı kullanırken, thread'leri yönetmek oldukça önemlidir. Java'da thread yönetimi için çeşitli metotlar ve teknikler vardır.

### **3.1 Thread Metotları**
Aşağıda `Thread` sınıfında bulunan önemli metotlar verilmiştir:

| Metot | Açıklama |
|--------|---------|
| `start()` | Thread'i başlatır ve `run()` metodunu çağırır. |
| `run()` | Thread içinde çalıştırılacak kodu içerir. |
| `sleep(ms)` | Thread'in belirtilen milisaniye kadar uyumasını sağlar. |
| `join()` | Çağrılan thread bitene kadar diğerlerini bekletir. |
| `yield()` | Mevcut thread'in çalışmasını duraklatır ve diğer thread'lere şans verir. |
| `setPriority(int)` | Thread'in önceliğini belirler (1-10 arası). |
| `getPriority()` | Thread'in mevcut önceliğini döndürür. |
| `isAlive()` | Thread çalışıyorsa `true`, değilse `false` döndürür. |
| `interrupt()` | Thread'i kesmek için kullanılır. |

---

### **3.2 Thread Önceliği (Priority)**
Her thread'in bir önceliği vardır ve **1 ile 10** arasında bir değer alabilir.

- `Thread.MIN_PRIORITY` (1) → En düşük öncelik
- `Thread.NORM_PRIORITY` (5) → Varsayılan öncelik
- `Thread.MAX_PRIORITY` (10) → En yüksek öncelik

**Örnek:**
```java
class PriorityThread extends Thread {
    public void run() {
        System.out.println(Thread.currentThread().getName() + " Öncelik: " + Thread.currentThread().getPriority());
    }
}

public class PriorityExample {
    public static void main(String[] args) {
        PriorityThread t1 = new PriorityThread();
        PriorityThread t2 = new PriorityThread();
        
        t1.setPriority(Thread.MIN_PRIORITY);
        t2.setPriority(Thread.MAX_PRIORITY);

        t1.start();
        t2.start();
    }
}
```

---

### **3.3 Thread Senkronizasyonu**
Çoklu thread'ler paylaşılan kaynaklara erişirken **veri tutarsızlığı** oluşabilir. Bunu önlemek için **synchronized** anahtar kelimesi kullanılır.

**Örnek:**
```java
class Counter {
    private int count = 0;

    public synchronized void increment() {
        count++;
    }

    public int getCount() {
        return count;
    }
}

public class SyncExample {
    public static void main(String[] args) throws InterruptedException {
        Counter counter = new Counter();

        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                counter.increment();
            }
        });

        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                counter.increment();
            }
        });

        t1.start();
        t2.start();
        t1.join();
        t2.join();

        System.out.println("Final Count: " + counter.getCount());
    }
}
```

---

## **4. Thread Havuzları (Thread Pools)**
Çok fazla thread oluşturmak performans sorunlarına neden olabilir. **Executor Framework** kullanarak thread havuzu oluşturulabilir.

**Örnek:**
```java
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadPoolExample {
    public static void main(String[] args) {
        ExecutorService executor = Executors.newFixedThreadPool(3);

        for (int i = 1; i <= 5; i++) {
            int taskNumber = i;
            executor.execute(() -> System.out.println("Görev " + taskNumber + " Çalışıyor"));
        }

        executor.shutdown();
    }
}
```

---

## **Sonuç**
Java'da thread yönetimi, performansı artırmak ve işlemleri daha verimli hale getirmek için kritik öneme sahiptir. `Thread` ve `Runnable` kullanarak thread'ler oluşturabilir, senkronizasyon sağlayabilir ve thread havuzları ile kaynak yönetimi yapabilirsiniz. Bu teknikler, çok iş parçacıklı uygulamalarda veri bütünlüğünü ve verimliliği artırmak için kullanılır.


## Eşzamanlılık (Concurrency)
```sh 

```
---

# **Java'da Eşzamanlılık (Concurrency) - Kapsamlı Rehber**

## **1. Giriş: Java'da Eşzamanlılık (Concurrency) Nedir?**
Java, çok iş parçacıklı (multithreading) ve çok işlemcili (multiprocessing) programlamayı destekleyen güçlü bir programlama dilidir. Eşzamanlılık (concurrency), bir Java programında birden fazla görevin (task, thread, process) aynı zaman dilimi içinde yürütülebilmesini ifade eder. Java, eşzamanlı programlama için kapsamlı kütüphaneler, API'ler ve veri yapıları sunarak geliştiricilerin yüksek performanslı ve ölçeklenebilir uygulamalar oluşturmasını sağlar.

## **2. Java'da Eşzamanlılık ve Paralellik**
Java'da eşzamanlılık ve paralellik farklı konseptlerdir:

- **Eşzamanlılık (Concurrency):** Birden fazla görevin (task) zaman paylaşımlı olarak çalıştırılması.
- **Paralellik (Parallelism):** Birden fazla görevin aynı anda fiziksel olarak çalıştırılması (çok çekirdekli işlemciler ile mümkün).

**Örnek:**
- **Concurrency:** Tek bir CPU çekirdeği üzerinde, zaman dilimlerine bölerek birden fazla görevin sırayla çalıştırılması.
- **Parallelism:** Çok çekirdekli bir CPU’da görevlerin gerçekten aynı anda çalıştırılması.

---

## **3. Java'da İş Parçacıkları (Threads)**
Java'da eşzamanlı işlemler **Thread** sınıfı veya **Runnable** arayüzü ile oluşturulabilir.

### **3.1. Thread Sınıfını Kullanarak Thread Oluşturma**
Java'da iş parçacığı oluşturmanın en basit yolu, `Thread` sınıfından türetilmiş bir sınıf oluşturmaktır.

```java
class MyThread extends Thread {
    public void run() {
        System.out.println("Thread çalışıyor: " + Thread.currentThread().getName());
    }
    
    public static void main(String[] args) {
        MyThread t1 = new MyThread();
        t1.start(); // Thread'i başlatır
    }
}
```
- `run()` metodu, iş parçacığının çalıştırılmasını sağlar.
- `start()` metodu iş parçacığını başlatır.

### **3.2. Runnable Arayüzünü Kullanarak Thread Oluşturma**
Daha esnek bir yöntem, `Runnable` arayüzünü kullanmaktır.

```java
class MyRunnable implements Runnable {
    public void run() {
        System.out.println("Runnable thread çalışıyor: " + Thread.currentThread().getName());
    }
    
    public static void main(String[] args) {
        Thread t1 = new Thread(new MyRunnable());
        t1.start();
    }
}
```
Bu yöntem, `Thread` sınıfını miras almadan iş parçacıkları oluşturmayı sağlar.

### **3.3. Lambda İle Runnable Kullanımı**
Java 8'den itibaren lambda ifadeleri ile daha kısa ve okunaklı bir şekilde `Runnable` nesnesi oluşturabiliriz:

```java
public class LambdaThread {
    public static void main(String[] args) {
        Thread thread = new Thread(() -> System.out.println("Lambda ile Thread çalışıyor."));
        thread.start();
    }
}
```

---

## **4. Java'da Thread Yönetimi**
Java, iş parçacıklarını yönetmek ve kontrol etmek için çeşitli yöntemler sunar.

### **4.1. Thread.sleep() ile İş Parçacığını Uyutma**
`Thread.sleep(milisaniye)`, iş parçacığını belirtilen süre boyunca askıya alır.

```java
public class SleepExample {
    public static void main(String[] args) {
        Thread t1 = new Thread(() -> {
            try {
                System.out.println("Thread uyuyor...");
                Thread.sleep(3000); // 3 saniye uyut
                System.out.println("Thread uyandı.");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
        t1.start();
    }
}
```

### **4.2. Thread.join() ile İş Parçacıklarının Senkronizasyonu**
`join()` metodu, bir iş parçacığının diğer iş parçacığının tamamlanmasını beklemesini sağlar.

```java
public class JoinExample {
    public static void main(String[] args) {
        Thread t1 = new Thread(() -> {
            for (int i = 1; i <= 5; i++) {
                System.out.println("Thread 1: " + i);
            }
        });

        Thread t2 = new Thread(() -> {
            try {
                t1.join(); // t1'in tamamlanmasını bekle
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Thread 2 başladı.");
        });

        t1.start();
        t2.start();
    }
}
```

---

## **5. Java'da Eşzamanlılık için Yüksek Seviyeli API'ler**
Java'da **java.util.concurrent** paketi, iş parçacıkları ile çalışmayı kolaylaştıran birçok sınıf içerir.

### **5.1. Executor Framework ile Thread Yönetimi**
`ExecutorService`, iş parçacıklarını yönetmek için kullanılır.

```java
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorExample {
    public static void main(String[] args) {
        ExecutorService executor = Executors.newFixedThreadPool(3);

        for (int i = 1; i <= 5; i++) {
            executor.execute(() -> System.out.println("Çalışan thread: " + Thread.currentThread().getName()));
        }
        
        executor.shutdown(); // Thread havuzunu kapat
    }
}
```

### **5.2. Future ve Callable ile Sonuç Döndüren İş Parçacıkları**
`Callable`, `Runnable` arayüzünden farklı olarak bir sonuç döndürür.

```java
import java.util.concurrent.*;

public class CallableExample {
    public static void main(String[] args) throws Exception {
        ExecutorService executor = Executors.newSingleThreadExecutor();

        Callable<Integer> task = () -> {
            TimeUnit.SECONDS.sleep(2);
            return 123;
        };

        Future<Integer> future = executor.submit(task);
        System.out.println("İşlem sonucu bekleniyor...");
        Integer result = future.get(); // Bloklayıcı çağrı
        System.out.println("Sonuç: " + result);

        executor.shutdown();
    }
}
```

---

## **6. Java'da Eşzamanlılık Problemleri ve Çözümleri**
Eşzamanlı programlama sırasında karşılaşılan bazı problemler şunlardır:

### **6.1. Yarış Koşulları (Race Condition)**
Birden fazla iş parçacığının aynı değişkeni güncellemesi sonucu veri tutarsızlığı oluşabilir.

```java
class Counter {
    private int count = 0;

    public void increment() {
        count++;
    }

    public int getCount() {
        return count;
    }
}
```
**Çözüm:** `synchronized` anahtar kelimesi veya `ReentrantLock` kullanımı.

```java
class SafeCounter {
    private int count = 0;

    public synchronized void increment() {
        count++;
    }

    public int getCount() {
        return count;
    }
}
```

### **6.2. Deadlock (Çıkmaz Durumu)**
İki iş parçacığı birbirinden kaynak beklerken sonsuz bekleme durumuna girer.

**Çözüm:** Kaynak tahsis sırasını belirlemek.

```java
// Avoiding deadlock with ordered locking
```

### **6.3. Starvation ve Livelock**
Bazı iş parçacıklarının kaynaklara erişememesi.

**Çözüm:** Adil planlama (`Fair locks`), zaman aşımı mekanizmaları.

---

## **7. Sonuç**
Java'da eşzamanlılık, performansı artırırken yönetilmesi gereken kritik konular içerir. **Thread**, **ExecutorService**, **Callable**, **Locks** gibi araçları doğru kullanarak yüksek performanslı uygulamalar geliştirebilirsiniz.


## Reflection API
```sh 

```
---
# **Reflection API Nedir? (Çok Detaylı Açıklama)**

## **1. Giriş: Reflection API Nedir?**
**Reflection API**, **Java sınıflarını, metotlarını, değişkenlerini ve anotasyonlarını çalışma zamanında (runtime) dinamik olarak incelemek ve değiştirmek** için kullanılan güçlü bir mekanizmadır. Normalde, bir Java sınıfı derleme zamanında belirlenen yapıya sahiptir ve çalışma zamanında değiştirilemez. Ancak **Reflection** ile çalışma zamanında **bir sınıfın yapısını öğrenebilir, yeni nesneler oluşturabilir ve metotlarını çağırabiliriz.**

### **Kullanım Alanları**
- **Framework ve Kütüphanelerde**: Spring, Hibernate gibi framework'ler **Reflection** kullanır.
- **Dinamik Kod Üretimi**: Runtime'da obje oluşturup metodlarını çağırabiliriz.
- **Test ve Debugging Araçları**: Unit test framework'leri Reflection ile metotları çağırabilir.
- **Kod Analizi (Introspection)**: Bir sınıfın içindeki **private metotları ve değişkenleri** analiz etmek için kullanılabilir.

---

## **2. Reflection API’nin Ana Bileşenleri**
Java Reflection API, `java.lang.reflect` paketinde bulunur ve aşağıdaki temel bileşenleri içerir:

1. **`Class<?>`** → Bir sınıfın yapısını temsil eder.
2. **`Method`** → Bir sınıfın metotlarını temsil eder.
3. **`Field`** → Bir sınıfın değişkenlerini temsil eder.
4. **`Constructor`** → Bir sınıfın constructor metodlarını temsil eder.
5. **`Modifier`** → Sınıf, metot veya değişkenin erişim belirleyicilerini alır.

---

## **3. Reflection API Kullanımı**
### **3.1. Bir Sınıfın Yapısını İnceleme**
Bir sınıfın Reflection API ile analiz edilmesi için **Class** nesnesi kullanılır.

```java
class Student {
    private String name;
    private int age;

    public Student() {}

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void study() {
        System.out.println(name + " çalışıyor...");
    }
}

public class ReflectionExample {
    public static void main(String[] args) throws ClassNotFoundException {
        // 1. Yöntem: Class.forName()
        Class<?> studentClass = Class.forName("Student");

        // 2. Yöntem: .class kullanımı
        Class<?> studentClass2 = Student.class;

        // 3. Yöntem: getClass()
        Student student = new Student();
        Class<?> studentClass3 = student.getClass();

        // Sınıf adını yazdır
        System.out.println("Sınıf Adı: " + studentClass.getName());
    }
}
```
**Çıktı:**
```
Sınıf Adı: Student
```

---

### **3.2. Bir Sınıftaki Tüm Metotları ve Değişkenleri Listeleme**
Bir sınıfın **tüm metotlarını, değişkenlerini ve constructor'larını** almak için aşağıdaki yöntemler kullanılır.

```java
import java.lang.reflect.*;

class Teacher {
    private String name;
    private double salary;

    public Teacher() {}

    public Teacher(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public void teach() {
        System.out.println(name + " ders anlatıyor.");
    }
}

public class ReflectionDetails {
    public static void main(String[] args) {
        Class<?> clazz = Teacher.class;

        // Constructor bilgilerini al
        Constructor<?>[] constructors = clazz.getConstructors();
        System.out.println("\n### Constructor Listesi:");
        for (Constructor<?> constructor : constructors) {
            System.out.println(constructor);
        }

        // Metotları listele
        Method[] methods = clazz.getDeclaredMethods();
        System.out.println("\n### Metot Listesi:");
        for (Method method : methods) {
            System.out.println(method);
        }

        // Değişkenleri listele
        Field[] fields = clazz.getDeclaredFields();
        System.out.println("\n### Değişken Listesi:");
        for (Field field : fields) {
            System.out.println(field);
        }
    }
}
```

**Çıktı:**
```
### Constructor Listesi:
public Teacher()
public Teacher(java.lang.String,double)

### Metot Listesi:
public void teach()

### Değişken Listesi:
private java.lang.String name
private double salary
```

---

### **3.3. Reflection ile Özel (private) Değişkenlere ve Metotlara Erişme**
Normalde bir sınıfın **private değişkenlerine doğrudan erişilemez**, ancak Reflection API ile erişebiliriz.

```java
import java.lang.reflect.*;

class Secret {
    private String hiddenMessage = "Bu bir sır!";

    private void secretMethod() {
        System.out.println("Bu özel bir metottur.");
    }
}

public class AccessPrivateFields {
    public static void main(String[] args) throws Exception {
        Secret secret = new Secret();
        Class<?> clazz = secret.getClass();

        // Private değişkene erişim
        Field field = clazz.getDeclaredField("hiddenMessage");
        field.setAccessible(true);
        System.out.println("Gizli Mesaj: " + field.get(secret));

        // Private metodu çağırma
        Method method = clazz.getDeclaredMethod("secretMethod");
        method.setAccessible(true);
        method.invoke(secret);
    }
}
```

**Çıktı:**
```
Gizli Mesaj: Bu bir sır!
Bu özel bir metottur.
```
> **Burada `setAccessible(true)` kullandık çünkü normalde private alanlara erişim yasaktır.**

---

### **3.4. Reflection ile Dinamik Nesne Oluşturma ve Metot Çağırma**
Reflection ile **çalışma zamanında (runtime) nesne oluşturabiliriz.**

```java
import java.lang.reflect.Constructor;

class Person {
    private String name;

    public Person() {
        this.name = "Bilinmeyen";
    }

    public Person(String name) {
        this.name = name;
    }

    public void introduce() {
        System.out.println("Benim adım " + name);
    }
}

public class DynamicObjectCreation {
    public static void main(String[] args) throws Exception {
        // Person sınıfının class objesini al
        Class<?> clazz = Person.class;

        // Parametresiz Constructor ile nesne oluştur
        Object obj1 = clazz.getDeclaredConstructor().newInstance();
        Method method1 = clazz.getMethod("introduce");
        method1.invoke(obj1); // Çıktı: Benim adım Bilinmeyen

        // Parametreli Constructor ile nesne oluştur
        Constructor<?> constructor = clazz.getConstructor(String.class);
        Object obj2 = constructor.newInstance("Ahmet");
        method1.invoke(obj2); // Çıktı: Benim adım Ahmet
    }
}
```

---

## **4. Reflection API’nin Dezavantajları**
**Her güçlü özellik gibi Reflection API’nin de bazı dezavantajları vardır:**
1. **Performans Kaybı**: Reflection, normal metot çağrılarına kıyasla **%10-30 daha yavaştır**.
2. **Güvenlik Riski**: Private metotlara erişebiliriz, ancak bu **güvenlik açığına neden olabilir**.
3. **Kodun Okunabilirliğini Azaltır**: Normal kodlara kıyasla **daha karmaşık** ve **hata ayıklaması zor** olabilir.

---

## **5. Reflection API Nerelerde Kullanılır?**
- **Spring Framework**: Dependency Injection için kullanır.
- **JUnit, Mockito**: Unit test yazarken private metotları test edebiliriz.
- **ORM Frameworkleri (Hibernate, JPA)**: Veritabanı nesnelerini dinamik olarak yönetir.
- **Runtime Proxy Oluşturma**: Java Dynamic Proxy Pattern ile interface'lerin implementasyonlarını runtime'da oluşturabiliriz.

---

## **Sonuç**
**Reflection API**, Java'nın **dinamik ve esnek bir dil olmasını sağlayan** en güçlü özelliklerinden biridir. Ancak, **dikkatli kullanılmalı** ve **performans düşüşü göz önünde bulundurulmalıdır**. Özellikle **Spring, Hibernate gibi framework'lerde** bu yapı yaygın olarak kullanılır.

✔ **Eğer bir framework veya kütüphane geliştiriyorsan**, **Reflection API kesinlikle bilinmesi gereken** bir konudur. 🚀




## Diğer
```sh 

```
---



