require: slotfilling/slotFilling.sc
  module = sys.zb-common
theme: /

require: intents.sc
  file: src/intents.sc

theme: /

 require: intents.sc

theme: /

state: Start
q!: *
go!: /hello

state: /hello
intent = Hello
a: Привет! Я бот-помощник. Могу рассказать о погоде и курсах валют.

state: /weather
intent = Weather
a: Сегодня ожидается хорошая погода.

state: /currency
intent = Currency
a: Сейчас курс валют доступен на сайте Центробанка.

state: /NoMatch
event!: noMatch
a: Извините, я не понял запрос.
