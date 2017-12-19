## ViewTransformer 

View global transformation Library for Android, written in Kotlin

### Usages

**NOT PRODUCTION READY!**

*rootProject/build.gradle*
```	
allprojects {
    repositories {
	    maven { url 'https://jitpack.io' }
    }
}
```

*app/build.gradle*
```
dependencies {
    implementation ''
}
```

### Usages

#### Kotlin
```Kotlin
ViewTransformer.add(ConsumerType.TypeTextView, TextSizeChanger(3))
ViewTransformer.add(ConsumerType.TypeTextView, TextViewConsumer<TextView> { textView ->
        textView.setTextColor(Color.parseColor("#A0A0A0"))
})
setContentView(ViewTransformer.transform(R.layout.activity_textview, this))
```

#### Java
```Java
ViewTransformer.add(ConsumerType.TypeTextView, new TextSizeChanger(3));
ViewTransformer.add(ConsumerType.TypeTextView, (TextViewConsumer<TextView>) textView -> textView.setTextColor(0xffA0A0A0));
setContentView(ViewTransformer.transform(R.layout.activity_textview, this));
```

### License 
```
Copyright 2017 WindSekirun (DongGil, Seo)

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

   http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
```
