# CMPE-202 Individual Project By Han-Wei Lin
## Design Pattern
#### Pattern Used
- Singleton
- Chain Of Responsibility
- Strategy

#### Structure
![](https://www.lucidchart.com/publicSegments/view/c09f9086-5a14-4836-924b-d4f95cc65661/image.png)
- Singleton is used in HandlerGetter

#### Reasons
- Chain Of Responsibility here is because you can't tell which handler you are going to use until you find out one specific card number belongs to which provider.
Finding out the provider also determines how you create an CreditCard object. Which is why I didn't use the pattern I used in part one of this project.
- Strategy here is because the way I save all data is exactly the same, only the way I read and write are different according to the file extensions.
- Singleton here doesn't really matter at this moment, but if I want to extend my code to maybe read multiple files, I won't need to rebuild the handler anymore.

#### Tools
The project is built and run using IntelliJ IDEA with Maven enabled. Maven is used only for testing.
Both project and module bytecode version are set to 8.