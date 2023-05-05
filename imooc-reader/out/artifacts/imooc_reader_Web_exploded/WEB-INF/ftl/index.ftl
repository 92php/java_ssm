<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Title</title>
</head>
<body>
index页面
<#list categoryList as category>
<a data-category="${category.categoryId}" href="#">${category.categoryName}</a>
    <#if category_has_next> | </#if>
</#list>
</body>
</html>