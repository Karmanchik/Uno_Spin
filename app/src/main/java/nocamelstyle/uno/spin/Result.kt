package nocamelstyle.uno.spin

import androidx.annotation.DrawableRes

class Result(
    val shortTitle: String,
    val longTitle: String,
    @DrawableRes val cover: Int
)

val resultsVariant = listOf(
    Result(
        "Почти УНО",
        "Игрок, крутивший колесо, сбрасывает все карты за исключением 2 карт.",
        R.drawable.cover1
    ),
    Result(
        "Сбрось Число",
        "Игрок, крутивший ко-лесо, выбирает число из карт находящихся у него на руках, и может сбросить\n" +
                "все карты имеющие данное число. Он может не сбрасывать некоторые карты, имеющие выбранное число, если пожелает.",
        R.drawable.cover1
    ),
    Result(
        "Сбрось Цвет",
        "Игрок, крутивший колесо, выбирает цвет из карт находящихся у него на руках,\n" +
                "и может сбросить все имеющиеся карты данного цвета.\n" +
                "Он может не сбрасывать некоторые карты выбранного цвета, если пожелает.",
        R.drawable.cover1
    ),
    Result(
        "Вытяни Красный",
        "Игрок, вытягивает карты до тех пор, пока не вытянет Красную Карту (или Дикую Карту). Все вытянутые карты остаются на руках у данного игрока.",
        R.drawable.cover1
    ),
    Result(
        "Вытяни Синий",
        "Игрок, вытягивает карты до тех пор, пока не вытянет Синюю Карту (или Дикую Карту). Все вытянутые карты остаются на руках у данного игрока.",
        R.drawable.cover1
    ),
    Result(
        "Обменяй Карты",
        "Все игроки обмениваются картами, находящимися на руках, передавая карты справа - налево. Если у кого-либо из игроков на руках оказывается одна карта, он должен незамедлительно громко крикнуть: «УНО» или возьмет две карты.",
        R.drawable.cover1
    ),
    Result(
        "Покажи Карты",
        "Игрок должен показать всем остальным игрокам все карты, находящиеся у него на руках. Потом игра продолжается, как обычно.",
        R.drawable.cover1
    ),
    Result(
        "Война",
        "Каждый игрок выбирает из карт, находящихся на руках, карту любого цвета с наибольшим числом (если таковая имеется) и игроки одновременно открывают выбранные карты.\n" +
                "Игрок, у которого оказалась карта с наибольшим чис-лом, сбрасывает ее, а все остальные игроки берут свои карты обратно в свои колоды. Если у нескольких игроков одновременно оказались карты с одинаковым наиболь-шим числом, эти игроки выбирают из карт, находящихся на руках, еще по одной карте любого цвета с наибольшим числом и опять одновременно открывают выбранные карты. Выигравший игрок сбрасывает все карты «Война» принимающие участие в этом поединке. Игру продолжает следующий игрок после выигравшего данный поединок игрока.",
        R.drawable.cover1
    ),
    Result(
        "УНО Спин",
        "Все игроки незамедлительно должны крикнуть:\n" +
                "«УНО Спин». Игрок, крик-нувший первым, сбрасы-вает на свой выбор одну\n" +
                "любую карту. Игру продолжает следующий игрок после выигравшего данный поединок игрока.\n" +
                "Если колесо показало, что необходимо сбросить несколько карт, ты можешь сам выбрать какую карту ты положишь на самый верх КОЛОДЫ СБРОСА, что будет иметь непосредственное влияние на ход следующего игрока.",
        R.drawable.cover1
    ),
)