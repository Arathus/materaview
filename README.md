# MateraView  (v0.1)

![](/home/arathus/AndroidStudioProjects/Matera/gfx/banner.png) 

>####Do you want your **app look stylish**, but you are not a designer ? Or just don't want to spend hours of creating **Material designed backgrounds **? Do you need **flexibility**, and also want a **simple and easy** to understand design library? MateraView was designed to solve these problems!





# Screenshots


### Why is it useful ? 
- *takes about **50 seconds** (!) to integrate*
- *fits perfectly to the **Material Design** guideline*
- **
- ****

>####**Never** spend time with creating single-use design pictures again!

# Setup
## 1. Provide the gradle dependency

```gradle
implementation "com.arathus:materaview:v0.1"
```


## 2. Add the MateraView to your XML
```xml
new DrawerBuilder().withActivity(this).build();
```

Great. Your drawer is now ready to use.

# Sample

## Properties:

* `app:ci_width`
* `app:ci_height`
* `app:ci_margin`
* `app:ci_drawable`
* `app:ci_drawable_unselected`
* `app:ci_animator`
* `app:ci_animator_reverse`
* `app:ci_orientation` (default:horizontal)
* `app:ci_gravity` (default:center)

# FAQ

#### Does I get the same view every time I use it ?
Quite the opposite. Everytime the view is created you get a new MateraView with random generated layer elements according to your predefined settings and to the material design guideline

#### Does it make the app slow ?
The cordinates of the elements, and the colors are created and saved in the constructor of the View; after it is done the library just draw the preset values. The MateraView was built from basic elements, therefore the library only use 1-3% of the processor

#### Can I save the generated designs ?
At this point of the development you are unable to do it, but it's possible that in the further versions this will be an option


# Credits

- Danny Hvam - [GitHub](https://github.com/oizo)
	- For his awesome material color palette generator library [Material Color Creator](https://github.com/shopgun/material-color-creator-android). Thanks for the help!
	
	

# Developed By

 * Ákos Jakub (Arathus)
 * <jakubakos@gmail.com>
 * [paypal.me/arathus](http://paypal.me/arathus)


# License

    Copyright 2018 Ákos Jakub

    Licensed under the Apache License, Version 2.0 (the "License");
    you may not use this file except in compliance with the License.
    You may obtain a copy of the License at

       http://www.apache.org/licenses/LICENSE-2.0

    Unless required by applicable law or agreed to in writing, software
    distributed under the License is distributed on an "AS IS" BASIS,
    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    See the License for the specific language governing permissions and
    limitations under the License.
