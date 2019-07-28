## Spring Fundamentals with XML Configurations

# Task 5:



From the aware-interface branch of spring-xml-demo repo created a bean-lifecycle
branch.

Added BeanLifecycleDemoBean class in com.stackroute.demo that implements
InitializingBean and DisposableBean.

Override the required methods to print out messages.
Define BeanLifecycleDemoBean as a bean in beans.xml.
Run the application and observe the result.

Added two methods customInit() and customDestroy() to the BeanLifecycleDemoBean
class and print out custom messages.

In the BeanLifecycleDemoBean bean definition, in beans.xml, set the customInit()
and customDestroy() methods to be called.
Run the application.

