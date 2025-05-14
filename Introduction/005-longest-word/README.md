## longest word

Write a method, _longestWord_, that takes in a sentence string as an argument. The method should return
the longest word in the sentence. If there is a tie, return the word that occurs later in the sentence.

You can assume that the sentence is non-empty.


#### test_00:

```java
longestWord("what a wonderful world"); // -> "wonderful"
```

#### test_01:

```java
longestWord("have a nice day"); // -> "nice"
```

#### test_02:

```java
longestWord("the quick brown fox jumped over the lazy dog"); // -> "jumped"
```

#### test_03:

```java
longestWord("who did eat the ham"); // -> "ham"
```

#### test_04:

```java
longestWord("potato"); // -> "potato"
```