package ru.practicum.theatre;

import java.util.ArrayList;

public class Theatre {

	public static void main(String[] args) {
		//Три актера
		Actor ivan = new Actor("Иванов", "Иван", Gender.MALE, 1.8);
		Actor vadim = new Actor("Сергеев", "Вадим", Gender.MALE, 1.6);
		Actor sveta = new Actor("Иванова", "Светлана", Gender.FEMALE, 1.7);
		
		//Два режисера
		Director roman = new Director("Петров", "Роман", Gender.MALE, 5);
		Director igor = new Director("Сидоров", "Игорь", Gender.MALE, 6);
		
		//Три представления
		Show show = new MusicalShow("обычный", 2, new ArrayList<>(), "Петушков", "текст либретто");
		Opera opera = new Opera("оперный",1, new ArrayList<>(), "Петушков", "текст либретто");
		Ballet ballet = new Ballet("балет", 3, new ArrayList<>(), "Петушков", "текст либретто");
		
		//распределим актеров по спектаклям
		show.addActor(ivan);
		show.addActor(sveta);

		
		ballet.addActor(ivan);
		ballet.addActor(sveta);
		ballet.addActor(vadim);
		
		opera.addActor(ivan);
		opera.addActor(vadim);
		
        System.out.println();
        System.out.println("-".repeat(20));
		System.out.println("Шоу");
		System.out.println("-".repeat(20));
		
		show.printActors();
		
        System.out.println();
        System.out.println("-".repeat(20));
		
		System.out.println("Опера");
		System.out.println("-".repeat(20));
		
		opera.printActors();
		
        System.out.println();
        System.out.println("-".repeat(20));
		
		System.out.println("Баллет");
		System.out.println("-".repeat(20));
		
		ballet.printActors();
		
		//заменим одного из актеров другим
		opera.replaceActor(vadim, sveta);
		
        System.out.println();
        System.out.println("-".repeat(20));
		opera.printActors();
		System.out.println("-".repeat(20));
		
		//Попробуйте заменить в другом спектакле несуществующего актёра
		show.replaceActor(sveta, ivan);
		
		//Для оперного и балетного спектакля выведите на экран текст либретто.
		opera.printLibrettoText();
		ballet.printLibrettoText();
	}
}