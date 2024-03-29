package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main2.*
import kotlinx.android.synthetic.main.element.*

class Main2Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        var l : ArrayList<String> = ArrayList()
        add(l)


        rec_view.layoutManager = LinearLayoutManager(this)

        rec_view.adapter = MyAdapter(l, this)

    }

    fun onClickTest(view: View) {
        Toast.makeText(this, element.text.toString(), Toast.LENGTH_SHORT).show()
    }
}

fun add(l : ArrayList<String>){
    l.add("Максимl")
    l.add("Сергейl")
    l.add("Андрейl")
    l.add("Алексейl")
    l.add("Артёмl")
    l.add("Ильяl")
    l.add("Кириллl")
    l.add("Михаилl")
    l.add("Никитаl")
    l.add("Матвейl")
    l.add("Романl")
    l.add("Егорl")
    l.add("Арсенийl")
    l.add("Иванl")
    l.add("Денисl")
    l.add("Евгенийl")
    l.add("Даниилl")
    l.add("Тимофейl")
    l.add("Владиславl")
    l.add("Игорьl")
    l.add("Владимирl")
    l.add("Павелl")
    l.add("Русланl")
    l.add("Маркl")
    l.add("Константинl")
    l.add("Тимурl")
    l.add("Олегl")
    l.add("Ярославl")
    l.add("Антонl")
    l.add("Николайl")
    l.add("Глебl")
    l.add("Данилl")
    l.add("Савелийl")
    l.add("Вадимl")
    l.add("Степанl")
    l.add("Юрийl")
    l.add("Богданl")
    l.add("Артурl")
    l.add("Семенl")
    l.add("Макарl")
    l.add("Левl")
    l.add("Викторl")
    l.add("Елисейl")
    l.add("Виталийl")
    l.add("Вячеславl")
    l.add("Захарl")
    l.add("Миронl")
    l.add("Дамирl")
    l.add("Георгийl")
    l.add("Давидl")
    l.add("Платонl")
    l.add("Анатолийl")
    l.add("Григорийl")
    l.add("Демидl")
    l.add("Данилаl")
    l.add("Станиславl")
    l.add("Василийl")
    l.add("Федорl")
    l.add("Родионl")
    l.add("Леонидl")
    l.add("Одиссейl")
    l.add("Валерийl")
    l.add("Святославl")
    l.add("Борисl")
    l.add("Эдуардl")
    l.add("Маратl")
    l.add("Германl")
    l.add("Даниэльl")
    l.add("Петрl")
    l.add("Амирl")
    l.add("Всеволодl")
    l.add("Мирославl")
    l.add("Гордейl")
    l.add("Артемийl")
    l.add("Эмильl")
    l.add("Назарl")
    l.add("Савваl")
    l.add("Янl")
    l.add("Рустамl")
    l.add("Игнатl")
    l.add("Владl")
    l.add("Альбертl")
    l.add("Тамерланl")
    l.add("Айдарl")
    l.add("Робертl")
    l.add("Адельl")
    l.add("Марсельl")
    l.add("Ильдарl")
    l.add("Самирl")
    l.add("Тихонl")
    l.add("Рамильl")
    l.add("Ринатl")
    l.add("Радмирl")
    l.add("Филиппl")
    l.add("Арсенl")

}