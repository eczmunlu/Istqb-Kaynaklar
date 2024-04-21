package ISTQB;

public class SORU_007 {
    /*
 SORU 7
Which of the following will be the best definition for Testing?
A. The goal / purpose of testing is to demonstrate that the program works.
B. The purpose of testing is to demonstrate that the program is defect free.
C. The purpose of testing is to demonstrate that the program does what it is supposed to do.
D. Testing is executing Software for the purpose of finding defects.

Asagidakilerden hangisi Testing icin en iyi tarifdir?
A. Testin hedefi / sebebi, programın çalıştığını göstermektir.
B. Testin amacı, programın hatasız olduğunu göstermektir.
C. Testin amacı, programın yapması gerekeni yaptığını göstermektir.
D. Testing kusurları bulmak amacıyla yazılımı calistirmaktir

Dogru Cevap D : (Internette soruyu aldigim dokumanin belirledigi cevap)

Benim cevabim C sikki olurdu. Yukarida yazan siklardan tamami Testing’in amaclarindan olmakla birlikte tumunu kapsayan
cevap olarak C sikki bana daha mantikli geliyor.
Kisminin cevirisini github repo’ya ekledim. Yaklasik bir sayfalik kismi okumanizi tavsiye ederim.
Asagid tercumesi verilen ISTQB Syllabus bolum 1.1 Testing Nedir ?’de gecen bir cumleyi D sikkinin bu sorunun cevabi olmamasi
gerektigine delil olarak sunabilirim. “Testing icin yaygın ama yanlış bir algı, testing’in yalnızca test amacli kodlarin
calistirilmasindan ve sonuçların kontrol edilmesinden ibaret oldugudur. ”

Ek Bilgiler Soru 7

1.1 Testing Nedir ?

Yazılım sistemleri, ticari uygulamalardan (örn. bankacılık) tüketici ürünlerine kadar (örn. otomobiller), yaşamın ayrılmaz bir parçasıdır.
Çoğu insan, beklediği gibi çalışmayan bir yazılımla karsilasmistir. Düzgün çalışmayan yazılımlar para, zaman veya iş itibarı kaybı,
hatta yaralanma veya ölüm dahil olmak üzere birçok soruna yol açabilir. Software testing, yazılımın kalitesini değerlendirmenin ve
çalışma sırasında yazılım hatası(failure) riskini azaltmanın bir yoludur.
Testing icin yaygın ama yanlış bir algı, testing’in yalnızca test amacli kodlarin calistirilmasindan ve sonuçların kontrol edilmesinden
ibaret oldugudur. Bölüm 1.4'te açıklandığı gibi, yazılım testi birçok farklı aktiviteyi içeren bir süreçtir.Testleri calistirma(execution)
(sonuçların kontrolü de dahil) bu faaliyetlerden sadece biridir. Test süreci(test process) testleri execute etme disinda, test planlama,
analiz etme, test tasarlama(designing) ve uygulama(implementing tests), test ilerlemesini ve sonuçlarını raporlama ve yapilan testin
kalitesini değerlendirme gibi faaliyetleri de içerir.
Bazı testler, testin isleyisine test edilen bileşen(component) ve testin gerceklestigi sistemi de dahil eder;
bu tür testlere dinamik test denir. Bazi testler ise, test edilen bileşen ve sistemi calistirilan testlere dahil etmez;
bu tür testlere statik test denir. Bu nedenle, testing aynı zamanda gereksinimler(requirements), user story ve
gereksinimler(requirements), user story ve kaynak kodu(source code) gibi calisma urunlerinin(work product) gözden geçirilmesini de içerir.

Testing icin var olan başka bir yanlış algı ise, Testing’in tamamen gereksinimlerin(requirements), kullanıcı hikayelerinin(user story)
veya diger spesifikasyonlarin dogrulanmasina odaklandigidir. Testing, sistemin belirtilen gereksinimleri karşılayıp karşılamadığını
kontrol etmenin yaninda, sistemin calisma ortaminda kullanıcı (user) ve diğer paydaşlarin(stakeholder) ihtiyaçlarını karşılayıp
karşılamayacağını kontrol etmeyi de içerir.
Test faaliyetleri, farklı yaşam döngülerinde(life cycle) farklı şekilde düzenlenir ve yürütülür (Bölüm 2.1).

1.1.1 Testing’in Temel Amaclari

Herhangi bir proje için testin amaçları şunları içerebilir:
• Gereksinimler, user story, tasarım ve kodlar gibi calisma ürünlerini(work product) değerlendirerek kusurları önlemek
• Belirtilen tüm gereksinimlerin karşılanıp karşılanmadığını doğrulamak
• Testin tamamlanıp tamamlanmadığını kontrol etmek ve kullanıcılar ve stakeholder’larin beklediği gibi çalışıp çalışmadığını doğrulamak
• Testimizin kalite düzeyine güven oluşturmak
• Kusurları(defects) ve arızaları(failures) bulmak, böylece yazilimin “yetersiz yazılım kalitesine (inadequate software quality)”
dusme riskini azaltmak
• Paydaşlara(stakeholder), bilinçli kararlar vermelerini sağlamak için yeterli bilgi vermek, ozellikle de testimizin kalite düzeyi
ile ilgili bilgiler saglamak
• Sözleşmeye dayalı, yasal veya düzenleyici gereksinimlere veya standartlara uymak ve/veya testimizin bu tür gereksinimler veya standartlara
uygunluğunu doğrulamak
Testin amaçları, test edilen bileşen(component) veya sistemin bağlamına(context), test düzeyine ve yazılım geliştirme yaşam döngüsü(lifecycle)
 modeline bağlı olarak değişebilir. Bu farklılıklar örneğin şunları içerebilir:
• Bileşen(component) testi sırasında, bir amaç mümkün olduğunca çok sayıda hata bulmak olabilir, böylece altta yatan kusurlar erken tespit
 edilip düzeltilir. Diğer bir amaç, bileşen testlerinin kodlarinin uzerinden gecmek ve kod kalitesini artırmak olabilir.
• Kabul testi(acceptance testing) sırasında, sistemin beklendiği gibi çalıştığını ve gereksinimleri karşıladığını doğrulamak
bir amaç olabilir. Bu testin bir başka amacı da , paydaşlara(stakeholder), sistemi belirlenen zamanda yayınlama(release) durumunda
olusabilecek riskler konusunda bilgi vermek olabilir.

1.1.1 Testing ve Hata Ayiklama(Debugging)

Testing ve debugging birbirinden farklidir.
Testlerin yürütülmesi(Execution), yazılımdaki kusurların(defect) neden olduğu arızaları(failure) gösterebilir.
Hata ayıklama(debugging) ise, bu tür kusurları(defect) bulan, analiz eden ve düzelten geliştirme(development) etkinliğidir.
Sonraki onay testi, düzeltmelerin(fixes) kusurları(defect) çözüp çözmediğini kontrol eder. Bazı durumlarda, geliştiriciler(developers)
hata ayıklamayı(debugging), ilişkili bileşen(associated component) ve bileşen entegrasyonu testini(component integration testing) yaparken,
test uzmanları(tester) ilk testten(initial test) ve son onay testinden(final confirmation test) sorumludur. Ancak, Agile geliştirmede ve
diğer bazı yazılım geliştirme yaşam döngülerinde, tester’lar hata ayıklama(debugging) ve bileşen testine(component testing) dahil olabilir.
Yazılım testi kavramları hakkında daha fazla bilgiye ISO standardı (ISO/IEC/IEEE 29119-1 standardindan ulasilabilinir.

     */
}
