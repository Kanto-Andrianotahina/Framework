jar -cf fw.jar -C .\Framework\build\web\WEB-INF\classes\ etu1922
jar -cvf test_fw.war -C .\Test_Framework\build\web\ WEB-INF\
copy test_fw.war C:\MyWebServer\apache-tomcat-10.0.20\apache-tomcat-10.0.20\webapps\
xcopy fw.jar A:\Documents\Mr_NAINA_(Reseaux)\S4\FrameWork\Test_framework\build\web\WEB-INF\lib\
xcopy A:\Documents\Mr_NAINA_(Reseaux)\S4\FrameWork\Test_framework\build\web\ C:\MyWebServer\apache-tomcat-10.0.20\apache-tomcat-10.0.20\webapps\Framework\ /E