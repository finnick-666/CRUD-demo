CREATE TABLE public.student
(
    id uuid NOT NULL,
    name "char"[] NOT NULL,
    password "char"[] NOT NULL,
    CONSTRAINT student_pkey PRIMARY KEY (id)
)
