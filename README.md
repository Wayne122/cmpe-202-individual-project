# CMPE-202 Individual Project By Han-Wei Lin
## Design Pattern
#### Pattern Used
- Singleton
- Chain Of Responsibility
- Strategy

#### Structure
![](https://www.lucidchart.com/publicSegments/view/f87b279b-5960-4429-9ca9-a4b0444f0739/image.jpeg)
- Singleton is used in HandlerGetter

#### Reasons
- Chain Of Responsibility here is because you can't tell which handler you are going to use until you find out one specific card number belongs to which provider.
Finding out the provider also determines how you create an CreditCard object.
- Strategy here is because the way I save all data is exactly the same, only the way I read and write are different according to the file extensions.
- Singleton here doesn't really matter at this moment, but if I want to extend my code to maybe read multiple files, I won't need to rebuild the handler anymore.
