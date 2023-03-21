import kotlin.math.abs

fun main() {
    // Ввод координат треугольника
    println("Введите координаты вершин треугольника, каждую чиселку с новой строчки (x1 y1 x2 y2 x3 y3):")
    try {
        val x1 = readln().toDouble()
        val y1 = readln().toDouble()
        val x2 = readln().toDouble()
        val y2 = readln().toDouble()
        val x3 = readln().toDouble()
        val y3 = readln().toDouble()

        // Ввод координат точки
        println("Введите координаты точки (x y):")
        val x = readln().toDouble()
        val y = readln().toDouble()
//        ?: run {
//            println("Ошибка: неверный формат ввода")
//            return
//        }

        // Вычисление площади треугольника
        val area = 0.5 * Math.abs((x2 - x1) * (y3 - y1) - (x3 - x1) * (y2 - y1))

        // Вычисление площадей треугольников, образованных точкой
        val area1 = 0.5 * abs((x1 - x) * (y2 - y) - (x2 - x) * (y1 - y))
        val area2 = 0.5 * abs((x2 - x) * (y3 - y) - (x3 - x) * (y2 - y))
        val area3 = 0.5 * abs((x3 - x) * (y1 - y) - (x1 - x) * (y3 - y))

        // Проверка, находится ли точка внутри треугольника
        if (area == area1 + area2 + area3) {
            println("Точка находится внутри треугольника")
        } else {
            println("Точка находится вне треугольника")
        }
    }
    catch (e:NumberFormatException) {
        println("Ойй, неправильный формат..")
    }
}