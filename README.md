Laboratorio 1A 
- Parte 1: Dos Activities (modelo tradicional antiguo)
- Parte 2: Una Activity + dos Fragments (modelo moderno)

Notas:

Activity
-Pantalla independiente con su propio ciclo de vida
-Se declara en AndroidManifest.xml
-Navegación con Intent explícito
-Paso de datos con putExtra() / getStringExtra()

Fragment
-Porción de UI que vive DENTRO de una Activity
-Más liviano que una Activity
-Su ciclo de vida está atado al de la Activity contenedora
-Navegación con FragmentManager + transacciones

ViewBinding
-Genera una clase con referencias TIPADAS a las vistas
-Evita usar findViewById
-Importante: Liberar en onDestroyView() para evitar memory leaks
