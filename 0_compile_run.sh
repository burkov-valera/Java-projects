#!/bin/bash

echo " " 
echo " " 
echo " " 
echo " " 
echo "------------------------Версия javac-----------------------------"
echo " " 
/home/bvn-ssd/PJ-astra-mini-bellsoft/jdk/bin/javac -version 
echo " "
echo "-----------------------------------------------------------------"
echo "------------------Компиляция java программы----------------------"
echo " " 
/home/bvn-ssd/PJ-astra-mini-bellsoft/jdk/bin/javac -d ./ -encoding utf8 sin_print_Form2.java
echo " " 
echo "-------------------Конец компиляции java программы---------------"
echo " "
echo "---------------------Версия java --------------------------------"
echo " " 
/home/bvn-ssd/PJ-astra-mini-bellsoft/jdk/bin/java -version 
echo " " 
echo "-----------------------------------------------------------------"
echo " " 
echo "-----------------Запуск java программы---------------------------"
echo " " 
/home/bvn-ssd/PJ-astra-mini-bellsoft/jdk/bin/java forms.sin_print_Form2
echo " " 
echo "---------------Конец работы java программы-----------------------"
echo " " 
read p