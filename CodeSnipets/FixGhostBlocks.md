MCreator does not seem to handle ghost blocks versy well
to fix this we had to include 

```JAVA
if(!world.isRemote){
    /*Your action what creates ghost blocks here, 
    should no longer create ghost blocks.*/
}
```
