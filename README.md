## HomeWork 2- LoginToMain -> https://github.com/FMSSBilisimAndroid/alp-tazecicek-odev3-LoginToMain

# SavingState

## Uygulama Hakkında
   SavingState fragmentinde Name edittext ile textview a ait text save butonuyla değiştiriliyor.
   FragmentLifecycle ile onSaveInstanceState durumunda Textview'a ait text Bundle'a ekleniyor.
   Fragmentin yeniden create olması durumunda textview a ait textin bundle yardımıyla korunumu sağlanıyor.

  
https://user-images.githubusercontent.com/82867179/189547762-43074df9-2097-4a41-bf9e-4d502c8ccdac.mp4

## Parcelable & Serializable

Serializable, standart bir Java arabirimidir. 
Bu yaklaşımla ilgili sorun bunun yavaş bir süreç olmasıdır. 
Bu yöntem çok sayıda geçici nesne oluşturur ve oldukça fazla çöp toplama işlemine neden olur. 
Ancak, Serializable arabirimin uygulanması daha kolaydır.

Parcelable işlemi Serializable'dan çok daha hızlıdır. 
Dataları küçük parçalara bölerek işler böylece Serializable'dan 10 kat daha hızlı olabilir. 
Implement edilişi Serializable'dan daha zordur.

