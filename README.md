[![](https://jitpack.io/v/jgabrielfreitas/DataControllerDemo.svg)](https://jitpack.io/#jgabrielfreitas/DataControllerDemo)    [![](https://img.shields.io/badge/Language%20-Java-4682b4.svg)](https://jitpack.io/#jgabrielfreitas/DataControllerDemo) 
# DataController library 

Easy way to work with `SharedPreferences` with a simple layer.

## How to

1 Add the JitPack repository to your build file


```gradle
allprojects {
		repositories {
			...
			maven { url "https://jitpack.io" }
		}
}
```

2 Add the dependency


```gradle
dependencies {
	        compile 'com.github.jgabrielfreitas:DataController:1.1.0'
}
```

## Usage 


> Instance a DataController and parse your Context in param 

```Java
public class FooBarActivity extends AppCompatActivity {

    private static final String TEXT_EXAMPLE_KEY = "text_example";
    DataController dataController;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        
        ...
        dataController = new DataController(this);
    }
}
```


> Now you can write yours datas, for example, to save a String content 

```Java
dataController.writeData(TEXT_EXAMPLE_KEY, "YOUR CONTENT HERE");
```


> To read something, as the String saved above, you'll call

```Java
dataController.readStringData(TEXT_EXAMPLE_KEY);
```

> If you want drop all your contents, just call

```Java
dataController.dropAllDatas();
```
