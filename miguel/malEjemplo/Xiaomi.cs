using System;

namespace malEjemplo
{
    public class Xiaomi : Telefono
    {
        public Xiaomi(string marca, int modelo, int precio, int RAM) : base(marca, modelo, precio, RAM)
        {
        }

        public override void escribir()
        {
            Console.WriteLine($"Escribiendo desde mi {marca}");
        }

        public override void llamar()
        {
            Console.WriteLine($"Llamando desde mi {marca}");
        }

        public override void pagarConNFC()
        {
            Console.WriteLine($"Pagando con NFC desde mi {marca}");
        }
        public override void usarAsistenteVirtual()
        {
            Console.WriteLine($"Este dispositivo no tiene asistente virtual");
        }

        public override void desbloquearConHuella()
        {
            Console.WriteLine($"Desbloqueando mi {marca} con huella dactilar");
        }
    }
}