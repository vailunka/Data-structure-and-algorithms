# Not enough memory?

In some situations, the amounts of data processed by the exercise tasks is very large. Thus, significant amounts of heap memory may be needed. If the Java virtual machine does not have enough heap memory available, an out of memory error may happen.

Your computer may have enough RAM available, but for the JVM the exercise task code is running, may not have enough of it.

In this situation, you can make sure the JVM has enough available heap, using the different techniques below.

Note that **stack overflow** is a different problem. In stack overflow, the stack memory available to the running process is not enough. How to solve this problem is explained in another guide [WHAT-STACKOVERFLOW-EN.md](WHAT-STACKOVERFLOW-EN.md). That guide also explains what stack and heap are.

In the instructions below, minimum and maximum amounts of heap memory is specified. Using the various ways explained, you need the following to specify the amount of heap required:

* `-Xms4g` specifies that the minimum amount of heap that the process should have is 4GB, and
* `-Xmx16g` specifies that the maximum amount of heap that the process should have is 16GB.

If your PC has less RAM available, you may try smaller numbers. If you have more, try out using larger numbers. Experiment what works in your PC, and what is enough for the task. Instead of specifying gigabytes of heap using "g", try out using hundreds of megabytes using "m" in the option. If that is enough.

When working from the terminal, it is enough to modify the `pom.xml` file and pass correct command line parameters to the java command. Instructions for these are below.

When testing and running code in VS Code, you need to configure the testing and launch settings of VS Code project. Instructions for this are also below, and the link below gives you more information about configuring the VS Code when programming with Java:

https://code.visualstudio.com/docs/java/java-debugging#_configuration-options


## Executing tests from the command line

If heap runs out when executing tests from the command line (`mvn test`), do this.

Add the XMl element below to the project's `pom.xml` file. 

**Note** that the file already has a `build` element, `plugins` element and perhaps also the `plugin` element below too, so make sure to **just add the necessary elements below to already existing elements** to the **correct place** of the `pom.xml` file. **The essential thing** for this purpose is in the  `argLine` element contained in the `configuration` element.

```XML
  <build>
    <plugins>
      <plugin>
        <groupId>org.apache.maven.plugins</groupId>
        <artifactId>maven-surefire-plugin</artifactId>
        <version>2.22.2</version>
        <configuration>
          <argLine>-Xms4g -Xmx16g</argLine>
       </configuration>
      </plugin>
    </plugins>
```

## Executing tests from the VS Code

Make sure, when running tests **from the VS Code**, that the similar thing than above is also found from the VS Code project settings file. 

VS Code project specific settings are places in the project root directory, that contains a directory `.vscode`. In there, create the file `settings.json` if it is not already there.

In this settings file, you need to add the following JSON element:

```JSON
{
	"java.test.config": {
	"-vmArgs": ["-Xms4g -Xmx16g"]
	}
}
```

Now when testing from within VS Code, the tests should have enough memory.

## If the task builds an executable

If the task includes building an app (`mvn package`) and then executed (`java -jar ...`) read from below how to do this both from the command line and from the VS Code so that enough heap memory is reserved for the app.

### Executing the app from command line

This applies to only those tasks where you use the command `mvn package` to build an executable and then execute it. If the task only instructs you to test (`mvn test`), then you do not need this instruction in that task.

Usually, how to build and run an executable from command line you do this:

```console
mvn package
java -jar target/executable-jar-file-here.jar
```

If the executable has not enough memory issue, then specify more memory using these command line parameters:

```command
java -Xms4g -Xmx16g -jar target/executable-jar-file-here.jar
```

### VS Codesta ohjelmaa suoritettaessa

You can create a file for VS Code to specify how to launch the executable. The file `launch.json` is also placed in the project subdirectory `.vscode`, as well as the `settings.json` file.

If the file `launch.json` does not exist, you can create it. Instructions can be found from the link:

https://code.visualstudio.com/docs/java/java-debugging#_configure

An example content of that file is below. Essential part is again that `vmArgs` setting, that specifies the min and max amounts of heap for the executable:

```JSON
      {
         "type": "java",
         "name": "Launch Example app",
         "request": "launch",
         "mainClass": "oy.tol.tira.ExampleApp",
         "projectName": "example",
         "vmArgs": [ "-Xss8m", "-Xmx16g" ] 
      }
```
`mainClass` must be the name of the class, including the package path, that contains the executable's `main(String [] args)` method.
