# 🛒 Sistema de Tienda Online

<p align="center">
  <img src="https://img.shields.io/badge/Estado-Activo-success?style=for-the-badge"/>
  <img src="https://img.shields.io/badge/Licencia-MIT-yellow?style=for-the-badge"/>
</p>

---

## 🛠️ 💻 Technology Stack

<p align="center">
  <img src= "https://img.shields.io/badge/SpringBoot-6DB33F?style=flat-square&logo=Spring&logoColor=white"/>
  <img src= "https://img.shields.io/badge/-Postman-FF6C37?style=flat&logo=postman&logoColor=white"/>
  <img src= "https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white"/>
  <img src="https://img.shields.io/badge/Intellij%20Idea-000?logo=intellij-idea&style=for-the-badge"/>
  <img src= "https://img.shields.io/badge/github-%23121011.svg?&style=for-the-badge&logo=github&logoColor=white"/>
  <img src= "https://shields.io/badge/simple__diarizer-Trello-blue?logo=Trello&style=flat"/>
  <img src= "https://img.shields.io/badge/Lucid-282C33?logo=lucid&logoColor=fff&style=for-the-badge"/>
</p>

---

## 🛍️ Descripción

Sistema de **tienda online (e-commerce)** desarrollado con **Spring Boot y Java**, diseñado para gestionar productos, usuarios, pedidos y pagos mediante una arquitectura basada en **API REST**.

Permite la administración completa del catálogo de productos y la interacción con clientes de forma eficiente.

---

## 🚀 Funcionalidades

- 🛒 Gestión de productos (CRUD)  
- 👤 Registro y autenticación de usuarios  
- 📦 Gestión de pedidos  
- 💳 Procesamiento de pagos  
- 📊 Panel administrativo  
- 🔎 Búsqueda y filtrado de productos  
- 🧾 Historial de compras  
- 🔐 Seguridad básica de usuarios  

---

## 🧩 Módulos del Sistema

- 🛍️ **Productos** → Catálogo e inventario  
- 👤 **Usuarios** → Registro y autenticación  
- 📦 **Pedidos** → Gestión de compras  
- 💳 **Pagos** → Procesamiento de transacciones  
- 📊 **Admin** → Control general del sistema  

---

## 🔗 API REST

Ejemplo de endpoints:

```http id="p4m8z2"
GET /api/productos
POST /api/usuarios
POST /api/pedidos
PUT /api/productos/{id}
DELETE /api/productos/{id}
