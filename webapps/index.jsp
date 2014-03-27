<%@ page language="java" pageEncoding="ISO-8859-1"%>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
    <base href="<%=basePath%>">

    <title>My JSP 'index.jsp' starting page</title>
    <meta http-equiv="pragma" content="no-cache">
    <meta http-equiv="cache-control" content="no-cache">
    <meta http-equiv="expires" content="0">
    <meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
    <meta http-equiv="description" content="This is my page">
    <!--
    <link rel="stylesheet" type="text/css" href="styles.css">
    -->
    <script type="text/javascript" src="<%=basePath%>js/jquery-2.0.2.js"></script>

</head>

<body>
This is my JSP page. <br>

${actionStr}
<script type="text/javascript">
    var nameSpace = {
        aa:function(){
            alert("aa");
        }
    };

</script>
<input type="button" value="nameSpace.aa()" onclick="nameSpace.aa();">

<script type="text/javascript">
    (function namespace(){
        this.bb=function(){
            //console.log('test');
            alert("bb")
        }
        window.NS=this;
    })();
</script>
<input type="button" value="NS.bb()" onclick="NS.bb();"/>


<script type="text/javascript">
    (function ns(){
        this.bb=function(){
            //console.log('test');
            alert("2222")
        }
        window.my_namespace=this;
    })();
</script>
<input type="button" value="22222" onclick="my_namespace.bb();"/>


<script type="text/javascript">

    $(document).ready(function(){
        $("#MyBut").click(function(){
            alert("MyBut is click");
        });
        $("#MySelect").change(function(){
            alert("MySelect is change");
        });
    });
</script>

<input type="button" id="MyBut" value="33333">
<input type="text" id="MyText" value="Test">


<select id="MySelect">
    <option id="1">1</option>
    <option id="2">2</option>
</select>




</body>
</html>
