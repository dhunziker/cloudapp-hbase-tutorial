# cloudapp-hbase-tutorial

Week 4 tutorial for [Cloud Computing Applications](https://class.coursera.org/cloudapplications-001) courser on Coursera.

This tutorial is not part of an assignment nor have the original source files been created by myself. All credits go to: https://github.com/xldrx/hbase_examples

# Prepare Maven

In order to compile the sources in this project, JDK's tools.jar needs to be installed into the local Maven repository using the following command:

```
C:\Program Files\Java\jdk1.8.0_51\lib>mvn install:install-file -DgroupId=jdk.tools -DartifactId=jdk.tools -Dpackaging=jar -Dversion=1.8.0_51 -Dfile=tools.jar -DgeneratePom=true
```

# Running the tutorial

1. Start HBase on the AWS Hortonworks Sandbox ```bash ~/start_hbase.sh```

2. Compile this project and copy the class files to the VM

3. Run the classes using the following commands:

  ```
  java CreateTable
  java ListTables
  java InsertData
  java RetrieveData
  java ScanTable
  ```

4. In order to rerun the tutorial, drop the table created previously:

  ```
  hbase shell
  > disable ‘emp’
  > drop ‘emp’
  > exit
  ```