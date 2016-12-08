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
	        compile 'com.github.jgabrielfreitas:DataController:v1.3.0'
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

---

#### LICENSE
```
The MIT License (MIT)

Copyright (c) 2016 João Gabriel de Freitas

Permission is hereby granted, free of charge, to any person obtaining a copy
of this software and associated documentation files (the "Software"), to deal
in the Software without restriction, including without limitation the rights
to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
copies of the Software, and to permit persons to whom the Software is
furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in all
copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
SOFTWARE.
```
