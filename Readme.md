//TODO
    /*
     * [X] Creación de POJOs -> (Pokemon)
     * [X] Fuente de datos   -> (Pokedex)
     *
     * Graddle Module
     * 16 -[x] añadir dependencias Picasso para gestionar las imagenes
     *
     * Manifest
     *
     * 17 -[x] añadir permisos de internet (imagenes cargadas desde URL)
     *
     * Adaptador
     * 1 - [X] Crear la clase pública adapter que extiende RecyclerView.Adapter
     * 5 - [X] Implementar método abstracto onCreateViewHolder
     *       [X] Contexto
     *       [X] LayoutInfalter desde el contexto
     *       [X] Inflar la vista del ViewHolder
     *       [X] Retornar un nuevo viewHolder utilizando la vista creada
     * 7 - [X] Implementar método abstracto onBindViewHolder
     *       [X] Dada una posición en la lista, recuperar el pokemon
     *       [X] Asignar la información a las vistas en el ViewHolder
     * 11 -[X] Implementar método abstracto getItemCount
     * 8 - [X] Agregar el constructor que reciba los datos
     * Viewholder
     * 4 - [X] Layout para el ViewHolder    -> (1 solo layout por que hay 1 solo viewholder)
     *       4.1- [X] la altura (height) debe NO debe ser match_parent
     *       4.2- [X] agregar padding
     *       4.3- [X] agregar margin
     * 2 - [X] Extender la clase RecyclerView.ViewHolder para crear el viewHolder
     * 3 - [X] Crear el constructor que llame a la superclase
     * 9 - [X] Crear e instanciar cada vista del ViewHolder
     * 10- [X] Crear el método bind que reciba la información y actualice las vistas
     * 18 -[x] añadir las imagenes empleando Picasso
     *
     * MainActivity (RecyclerView)
     * 6 - [X] Crear una instancia de adapter con un constructor que reciba la lista de valores
     * 12- [X] Layout que incluye el RecyclerView
     * 13- [X] Instanciar el adapter con los datos
     * 14- [X] Enlazar en el código el RecyclerView con el adaptador
     *       [X] declarar un recyclerView como instancia de la clase
     *       [X] inicializar el recycler
     * 15- [X] Enlazar el recyclerView con el LayoutManager