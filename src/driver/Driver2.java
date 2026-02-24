// Source code is decompiled from a .class file using FernFlower decompiler (from Intellij IDEA).
import java.util.Scanner;

public class Driver2 {
   public Driver2() {
   }

   public static void main(String[] var0) {
      Scanner var1 = new Scanner(System.in);

      try {
         int var2 = var1.nextInt();
         int[] var3 = new int[var2];

         int var4;
         for(var4 = 0; var4 < var2; ++var4) {
            var3[var4] = var1.nextInt();
         }

         var4 = var1.nextInt();
         int var5 = 0;

         int var6;
         for(var6 = 1; var6 < var4; ++var6) {
            var5 += var6;
         }

         var6 = 0;

         for(int var7 = 0; var7 < var4; ++var7) {
            if (var5 + var7 < var3.length) {
               var6 += var3[var5 + var7];
            }
         }

         System.out.println(var6);
      } catch (Throwable var9) {
         try {
            var1.close();
         } catch (Throwable var8) {
            var9.addSuppressed(var8);
         }

         throw var9;
      }

      var1.close();
   }
}
