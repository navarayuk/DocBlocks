**My Head Command**

This is the /myhead command for getting your own head for base builds in DocBlocks

```java
if (true) {
  if (entity instanceof EntityPlayerMP) {
    MinecraftServer minecraftserver = FMLCommonHandler.instance().getMinecraftServerInstance();
    if (minecraftserver != null)
      minecraftserver.getCommandManager().executeCommand((EntityPlayerMP) entity,
       "give @p skull 1 3 {SkullOwner:" + entity.getName() + "} ");

      entity.sendMessage(new TextComponentString(TextFormatting.DARK_RED + "[Triggered]" + TextFormatting.WHITE + " You claimed your head"));
  }
}
```
