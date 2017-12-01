# Oriented Object Design : Plugins project

**Vabois Loick - Antonelli Aymerick**

**L3S5 MIAGE - Group 1**

![University's logo](http://www.univ-lille1.fr/digitalAssets/38/38040_logo-trans.png)

> The goal of this project was to simulate the operation of a swimming pool

---

**Table of Contents**

1. [Tree](#arborescence)
2. [HowTo](#howto)
3. [UML Diagram](#uml)
4. [Execution of the program](#execute)
5. [Remarks](#remarks)

---

### <a name="arborescence">1 Tree</a>

This directory essentially contains these files and folders :

- `./pom.xml` that is essential for the `Maven` tool
- `./README.md` that you actually read
- the `./src/main/java/fil/coo/miage/vabois-antonelli` folder containing :
    - the `./src/test/java/fil.coo.miage.vabois-antonelli` folder that has nearly the same architecture then the `main` folder

### <a name="install">2 HowTos</a>

For all the following commands, make sure you're positioned at the root of this directory.

#### How to install ?

If you still haven't cloned that repository :

```
git clone https://gitlab-etu.fil.univ-lille1.fr/antonelli/coo-antonelli-vabois.git
```

Otherwise, do a `git pull`.

Then, move to the `Plugins` folder :

```
cd Plugins
```

#### How to compile ? How to generate the docs ?

Essentially through the `Maven` tool.

- Compile the project : `mvn package`
- Generate the docs : `mvn javadoc:javadoc` (you can find it in the `target/docs` folder, then open the `index.html` file)
- Cleanup the directory : `mvn clean` (cleans the `target` folder)

#### How to execute the program ?

Before that step, make sure you have **compiled** the project (otherwise, do a `mvn package`). Then do :

```
java -jar target/Plugins-1.0-SNAPSHOT.jar
```

### <a name="uml">3 UML Diagram</a>

<!--![UML](UML.png)-->

### <a name="uml">4 Execution of the program</a>

```
In progress...
```

### <a name="remarks">5 Remarks</a>

* We haven't tested the getters, setters and `toString()` methods because of the simplicity of these methods.