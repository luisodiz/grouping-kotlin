package collections

// Упрощенная реализация List

/*
class MyList<T> : Iterable<T> {
    private var array: Array<Any?> = arrayOfNulls(10); // размер 10.
    private var realSize = 0

    // Добавление элемента в конец, если не нужно расширять массив O(1)
    fun add(element: T) {
        if (realSize >= array.size) {
            // увеличить размер массива
        }

        array[realSize] = element
        realSize++
    }

    // Получение элемента по индексу O(1)
    fun get(index: Int) : T {
        checkIndex(index)
        return array[index] as T
    }

    // Установка элемента по индексу O(1)
    fun set(index: Int, element: T) {
        checkIndex(index)
        array[index] = element
    }

    // Удаление элемента по индексу О(n)
    fun removeAt(index: Int) {
        checkIndex(index)
        System.arraycopy(array, index + 1, array, index, realSize - index - 1)
        realSize--;
    }

    // Проверка индекса
    private fun checkIndex(index: Int) {
        if (index < 0 || index >= realSize) {
            throw IndexOutOfBoundsException("Index: $index, Size: $realSize")
        }
    }

    // Переопределить итератор
}*/
