# Queue

Eine Queue ist eine Datenstruktur zur Abbildung von Warteschlangen. Es ist möglich, Werte zu einer Queue hinzuzufügen oder hinzugefügte Werte wieder aus der Queue zu entnehmen. Es werden immer die zuerst hinzugefügten Werte entnommen. Dieses Verhalten nennt man deswegen auch first-in-first-out (FIFO).

1. Schreiben Sie ein Interface `Queue` zur Verwaltung von Strings. Das Interface benötigt zwei Methoden, um oben genanntes Verhalten abzubilden. Welche?

2. Ebenso sollen folgende Methode existieren:
   - eine Methode, die überprüft, ob die Queue leer ist oder nicht
   - eine Methode, die das erste Element aus der Queue zurückgibt, aber nicht aus der Queue entfernt
   - eine Methode, das das letzte Element aus der Queue zurückgibt, aber nicht aus der Queue entfernt

3. Implementieren Sie abschließend das Interface. Verwenden Sie für die interne Verwaltung der Strings eine `ArrayList`. 

4. Testen Sie Ihre Implementierung ausgiebig mit Unit-Tests.
