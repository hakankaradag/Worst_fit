
1) Bu projeyi calistirmak icin once Proje2\src klasorune gidin. (Ornegin cd C:\Users\Semiramis\JAVA\Project2\src\)

2) Tum java dosyalarini derlemek icin asagidaki komutu calistirin:
javac *.java

3) N tane random integer'a sahip dosya olusturmak icin asagidaki komutu calistirabilirsiniz:
java RandomNumberGenerator N (N degerini belirleyiniz. Ornegin "java RandomNumberGenerator 1000" komutu 1000 tane integer iceren input1000.txt dosyasini olusturacaktir.

4) Asagidaki komut worst-fit algoritmasini input***.txt ile calistiracaktir.
java WorstFit < input***.txt

5) Asagidaki komut worst-fit decreasing algoritmasini input***.txt ile calistiracaktir.
java IntegerSorter < input**.txt | java WorstFit


Analizimi yapmam icin calistirdigim komutlar asagidadir:

javac *.java
java WorstFit < input20.txt
java IntegerSorter < input20.txt | java WorstFit

java RandomNumberGenerator 100
java WorstFit < input100.txt
java IntegerSorter < input100.txt | java WorstFit

java RandomNumberGenerator 1000
java WorstFit < input1000.txt
java IntegerSorter < input1000.txt | java WorstFit

java RandomNumberGenerator 10000
java WorstFit < input10000.txt
java IntegerSorter < input10000.txt | java WorstFit

java RandomNumberGenerator 100000
java WorstFit < input100000.txt
java IntegerSorter < input100000.txt | java WorstFit

java RandomNumberGenerator 1000000
java WorstFit < input1000000.txt
java IntegerSorter < input1000000.txt | java WorstFit
