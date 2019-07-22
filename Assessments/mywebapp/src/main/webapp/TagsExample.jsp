
<%!public String name = "ramu";
	private int age = 100;
	
	{
		System.out.println("sourabh here");
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public String getName(String name) {
		return "Given name is - " + name;
	}%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Example</title>
</head>
<body>
<h1>JSP tags are here</h1>
<br><br>

Name 01: <%=name %><br> 
Name 02: <%=getName() %><br> 
Name 03: <%=getName("soupas") %><br> 
Age 01: <%=age %><br> 
Age 02: <%=getAge() %><br>

<%
for(int i=0;i<5;i++){
	%>
	Name <%=i+" "+name %><br><% 
}%>


</body>
</html>