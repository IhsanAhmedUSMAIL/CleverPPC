#AC07_Checkout
#1. Kullanıcı, "US06_AddToCart" adlı Test Case'de belirtilen adımları tamamlamış olmalıdır (Sepette ürün olmalıdır / Önkoşul).
#2. Alışveriş sepeti simgesine (Cart) tıklanabilmelidir.
#3. "Checkout" butonuna tıklanabilmelidir.
#4. "US03_AddAddr" adlı hikaye'de oluşturulan adres seçilebilmelidir. (Eğer hesaba ait bir adres yoksa, "US03_AddAddr" adlı hikaye'de belirtilen adımları uygulamak gereklidir).
#5. Shipment method varsayılan olarak seçili olmalı ve Kullanım Şartları Sözleşmesi kabul edilmelidir ("I Agree...").
#6. "Proceed to checkout" butonuna tıklanabilmelidir.
#7. "PayPal ile ödeme" butonuna tıklanmalıdır ve "Şu anda bir şeylerin yolunda gitmediği görülüyor. Lütfen daha sonra tekrar deneyin." olumsuz mesajı doğrulanmalıdır.
#8. Geri gidilmeli (NavigateTo.back), "Kredi Kartı ile ödeme" butonuna tıklanmalı ve "Invalid request (1)." olumsuz mesajı doğrulanmalıdır.
#9. Geri gidilmeli (NavigateTo.back), "Banka Havalesi ile ödeme" butonuna tıklanabilmelidir.
#10. Mesaj kısmında gösterilen tutarın, vergi dahil ürünlerin tutarı ve kargo tutarının toplamına eşit olduğu doğrulanmalıdır.
#11. "I confirm my order" butonuna tıklanabilmelidir.
#12. Ödeme onaylanmalı ve "Your order on Xu Clothing is complete." mesajı ile ödemenin gerçekleştiği doğrulanmalıdır.
#13. Çıkan Mesajdaki sipariş numarası kaydedilebilmelidir.

Feature: Online Shopping

  Scenario: Order and Checkout
    Given Navigate to CleverPpc
    And Click sign in button
    When Enter username and password and click login button
    Then User should login successfully
    And the user can click on the shopping cart icon (Cart)

    When the user clicks on the Checkout button
    Then Selected address  should be displayed
    And the Shipment method is selected by default
    And the Terms and Conditions Agreement is accepted by clicking I Agree...

    And the user can click on the Proceed to checkout button
    And the user clicks on the Pay with PayPal button

    Then the negative message should be displayed

    And the user navigates back
    And the user clicks on the Pay with Credit Card button
    Then the credit card negative message should be displayed

    And the user navigates back
    And the user can click on the Pay with Bank Transfer button

    Then it should be verified that the total amount shown in the message matches the sum of the product cost including tax and shipping cost

    And the user can click on the I confirm my order button


    And it should be displayed that the message indicates the payment has been processed

    And the order number from the displayed message should be verified




