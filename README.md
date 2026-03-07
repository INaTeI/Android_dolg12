Никифоров Владимир ЦТЭ Б9123-09.03.03
COUNTRY-ALL-MOD_A2_GRID
Здравствуйте, взял другое api. С предыдущим у меня были проблемы, я надеюсь, что вы не против и так можно


Jetpack Compose
Hilt (DI)
Retrofit (HTTP клиент)
Navigation Compose
MVVM архитектура

Используемое API
REST Countries API
Endpoints
Получение списка стран:
GET https://restcountries.com/v3.1/all?fields=name,cca2,flags,capital,region,population

Получение одной страны:
GET https://restcountries.com/v3.1/alpha/{code}

VariantCode отображается на главном экране приложения строкой.

Особенности
LazyVerticalGrid
Карточки (Card)
Обработка состояний Loading / Error / Success
Переход на экран деталей по нажатию на карточку

В приложении
Главный экран

VariantCode
Сетка стран (Grid)

Карточка страны содержит

Название страны
Столицу
Флаг

Экран деталей
Название страны
Столица
Регион
Население
Флаг страны

Скриншоты: 
список стран
детали каждой страны
Оформленная анимация загрузки
![photo_5289948663020983476_y](https://github.com/user-attachments/assets/efa51b12-b5e1-4ade-b9ac-66a6c1444a69)
![photo_5289948663020983475_y](https://github.com/user-attachments/assets/a3677e21-259e-422a-8e91-806b7848a933)
![photo_5289948663020983473_y](https://github.com/user-attachments/assets/caeadd8b-ea63-4def-870c-cf095fa06cce)
