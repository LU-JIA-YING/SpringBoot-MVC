# 呂佳穎_07/29 HW-1討論

###### tags: `Homework`、`Git`、`Restful API`
>- [查看作業題目](https://reurl.cc/GErKxx)
>- [作業繳交連結](https://reurl.cc/nO0DgX)

[TOC]

## Git

#### 1.甚麼是 Repository ?
:::warning
Repository(Repo.)是虛擬存儲，可以用倉庫比喻  
用於協同開發並託管專案用得文檔、程式，與版本控制。
:::
#### 2.甚麼是 Branch ?
:::warning
分支 Branch，可同時在同一個數據庫裡開發不同的功能與修改，並且互不影響。
:::
#### 3如果要將寫完的程式碼給別人看，git需要走哪些流程?
:::warning

1.  new repo(初始化)  
    add to temp  
    comment  
    建branch  
    本地連線遠端  
    push  
    
2. clone remoto  
    pull code  
    new branch  
    modify code then add file  
    commit and comment  
    push  
    
3. git flow  
    master/main>特定人員merge
:::

## Restful API

#### 4.Restful具有哪些特性或優點?
:::warning
* **RestFul API 是個風格，不一定要完全遵照！**

1.介面一致，API邏輯一致:開發者只要熟悉你的一支 API，他就應該能用同樣的邏輯，來理解你開出來的其他API

2.無狀態的Server端:在server端不儲存client端的狀態資訊，而是由client端來掌握app的狀態

3.Client端和Server端分離:只要中間的 API沒有變，Server和Client可以個別開發，相互不受影響

4.可暫存的資源

5.分層系統
:::
#### 5.舉例一種應用情境套用在Get, Post, Put, Delete
:::warning
- Get(讀取)
- Post(新增)
- Put(修改)
- Delete(刪除)

> 假設學生點名名單  
必須先知道學生資訊(Get)  
新增插班的學生(Post)  
刪除取消上課的學生(Delete)  
修改錯誤學生資訊(Put)
:::

>##### Spring Boot MVC課程教材
>-->https://reurl.cc/MNkqDn

>##### 撰寫格式
>-->https://reurl.cc/1moDl8

>##### RESTful 概念學習
>-->https://reurl.cc/pMxO4r

>##### Postman 基礎使用學習
>-->https://reurl.cc/ERZELA

>##### 學習 Git 觀念、操作與使用
>-->https://reurl.cc/jGgLoL
