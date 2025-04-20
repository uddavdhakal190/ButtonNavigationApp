Homework package 3 

 

Return code copied from .kt files and xml files inside a text file (doc/docx or pdf) (copy from ALL files where you have written your own code). CODE IN KOTLIN! Name your answer file firstname_lastname_package3

 

MainActivity.kt 

class MainActivity : AppCompatActivity() { 
    override fun onCreate(savedInstanceState: Bundle?) { 
        super.onCreate(savedInstanceState) 
        setContentView(R.layout.activity_main) 
    } 
} 

  

 activity_main.xml 

<?xml version="1.0" encoding="utf-8"?> 

<androidx.constraintlayout.widget.ConstraintLayout xmlns:android="http://schemas.android.com/apk/res/android" 

    xmlns:app="http://schemas.android.com/apk/res-auto" 

    xmlns:tools="http://schemas.android.com/tools" 

    android:layout_width="match_parent" 

    android:layout_height="match_parent" 

    tools:context=".MainActivity"> 

 

    <TextView 

        android:layout_width="wrap_content" 

        android:layout_height="wrap_content" 

        android:text="Hello World!" 

        app:layout_constraintBottom_toBottomOf="parent" 

        app:layout_constraintLeft_toLeftOf="parent" 

        app:layout_constraintRight_toRightOf="parent" 

        app:layout_constraintTop_toTopOf="parent" /> 

 

</androidx.constraintlayout.widget.ConstraintLayout> 

  

 

Part 1: 

Create an Activity that has two buttons. One button has text “Cars” and the other has text “Motorbikes”. When a button is clicked the app will start a new Activity. Information which of the two buttons is transferred to the new Activity. On the top of the new activity layout create a TextView and show in it which button was pressed in previous Activity (text Cars/Motorbikes). 

 

Part 2: 

Continue by adding a Listview under the TextView. Create a datasource (class Car/class Motorbike variables manufacturer, year, country) for your ListView and populate it with names of car manufacturers or motorbike manufacturers (5 items is enough) depending which button was pressed on the first Activity.  

 

Part 3: 

Continue by creating a custom adapter for the ListView. With the adapter create a custom layout for the rows in the ListView. Layout of the row is following:

TextView for the manufacturer in horizontally center top corner of the row. Font size of 24sp.

TextView for the year in right hand corner of the row below manufacturer

TextView for the country in left hand corner of the row below manufacturer

 

Part 4:

When a row is clicked the app will display a Toast with the information from the row. Something like “The manufacturer of this bike is xxxxxx and it was built in year yyyy in zzzzzzz”
